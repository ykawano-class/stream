package com.example.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StreamController {

    @GetMapping("/stream")
    public ResponseEntity<StreamingResponseBody> stream() {
        byte[] test = "{'test': 'value'}".getBytes();

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(outputStream -> {
                    outputStream.write(test);
                    outputStream.flush();
                });
    }

}
