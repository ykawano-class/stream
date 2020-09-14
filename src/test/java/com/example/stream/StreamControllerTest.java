package com.example.stream;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class StreamControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void streaming() {
        HttpEntity<String> requestEntity = new HttpEntity<>("");
        List<Runnable> rList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Runnable runnable = () -> {
                ResponseEntity<String> actual = restTemplate.exchange("/stream", HttpMethod.GET, requestEntity,
                        String.class);
                assertThat(actual.getStatusCode(), is(HttpStatus.OK));
                assertThat(actual.getBody(), is("{'test': 'value'}"));
            };
            rList.add(runnable);
        }
        rList.parallelStream().forEach(r -> r.run());
    }
}
