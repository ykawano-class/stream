# stream
StreamingResponseBody error sample

# StreamControllerTest
When you run a number of times it is output error log.
But the test itself does not result in an error.


<details>

```
Testing started at 11:22 ...

> Task :compileJava UP-TO-DATE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
11:22:26.484 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
11:22:26.495 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
11:22:26.519 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.example.stream.StreamControllerTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
11:22:26.531 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.example.stream.StreamControllerTest], using SpringBootContextLoader
11:22:26.534 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.example.stream.StreamControllerTest]: class path resource [com/example/stream/StreamControllerTest-context.xml] does not exist
11:22:26.535 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.example.stream.StreamControllerTest]: class path resource [com/example/stream/StreamControllerTestContext.groovy] does not exist
11:22:26.535 [Test worker] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.example.stream.StreamControllerTest]: no resource found for suffixes {-context.xml, Context.groovy}.
11:22:26.536 [Test worker] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.example.stream.StreamControllerTest]: StreamControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
11:22:26.568 [Test worker] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.example.stream.StreamControllerTest]
11:22:26.623 [Test worker] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/kawano.yoshinari/git/stream/build/classes/java/main/com/example/stream/StreamApplication.class]
11:22:26.632 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.example.stream.StreamApplication for test class com.example.stream.StreamControllerTest
11:22:26.722 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.example.stream.StreamControllerTest]: using defaults.
11:22:26.723 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
11:22:26.730 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
11:22:26.730 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
11:22:26.731 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@486c373c, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@1b8801bd, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@3f9368bf, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@671f16ed, org.springframework.test.context.support.DirtiesContextTestExecutionListener@4ee318e5, org.springframework.test.context.event.EventPublishingTestExecutionListener@15bd7d6d, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@314f29f5, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@2e78e94f, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@780af855, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@622b42c, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@4eea359c, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@27318f9f]
11:22:26.734 [Test worker] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@23f3020a testClass = StreamControllerTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@5a5d106e testClass = StreamControllerTest, locations = '{}', classes = '{class com.example.stream.StreamApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@1d7ca9cd, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@8e413c1, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@70013b90, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@e9047da, org.springframework.boot.test.context.SpringBootTestArgs@1], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false]], class annotated with @DirtiesContext [false] with mode [null].
11:22:26.742 [Test worker] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@23f3020a testClass = StreamControllerTest, testInstance = com.example.stream.StreamControllerTest@3c526e59, testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@5a5d106e testClass = StreamControllerTest, locations = '{}', classes = '{class com.example.stream.StreamApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}', contextCustomizers = set[org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@1d7ca9cd, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@8e413c1, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@70013b90, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@e9047da, org.springframework.boot.test.context.SpringBootTestArgs@1], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> false]]].
11:22:26.757 [Test worker] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=0}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.3.RELEASE)

2020-09-14 11:22:36.945  WARN 56560 --- [    Test worker] o.s.boot.StartupInfoLogger               : InetAddress.getLocalHost().getHostName() took 5003 milliseconds to respond. Please verify your network configuration (macOS machines may need to add entries to /etc/hosts).
2020-09-14 11:22:41.956  INFO 56560 --- [    Test worker] com.example.stream.StreamControllerTest  : Starting StreamControllerTest on HL00483.local with PID 56560 (started by kawano.yoshinari in /Users/kawano.yoshinari/git/stream)
2020-09-14 11:22:41.958  INFO 56560 --- [    Test worker] com.example.stream.StreamControllerTest  : No active profile set, falling back to default profiles: default
2020-09-14 11:22:42.674  INFO 56560 --- [    Test worker] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2020-09-14 11:22:42.684  INFO 56560 --- [    Test worker] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-09-14 11:22:42.685  INFO 56560 --- [    Test worker] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-09-14 11:22:42.760  INFO 56560 --- [    Test worker] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-09-14 11:22:42.761  INFO 56560 --- [    Test worker] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 784 ms
2020-09-14 11:22:42.959  INFO 56560 --- [    Test worker] .s.s.UserDetailsServiceAutoConfiguration : 

Using generated security password: aa26211d-75ae-41df-8c11-fb6efdfa17b1

2020-09-14 11:22:43.061  INFO 56560 --- [    Test worker] o.s.s.web.DefaultSecurityFilterChain     : Creating filter chain: any request, [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@4153869e, org.springframework.security.web.context.SecurityContextPersistenceFilter@303436a8, org.springframework.security.web.header.HeaderWriterFilter@6b818584, org.springframework.security.web.csrf.CsrfFilter@bdfab8, org.springframework.security.web.authentication.logout.LogoutFilter@233c1bc7, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@59b8c497, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@7974a735, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@14e39c50, org.springframework.security.web.session.SessionManagementFilter@187570e1, org.springframework.security.web.access.ExceptionTranslationFilter@6e9c42c7, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@46baba41]
2020-09-14 11:22:43.183  INFO 56560 --- [    Test worker] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-14 11:22:43.183  INFO 56560 --- [    Test worker] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService
2020-09-14 11:22:43.442  INFO 56560 --- [    Test worker] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 59120 (http) with context path ''
2020-09-14 11:22:43.451  INFO 56560 --- [    Test worker] com.example.stream.StreamControllerTest  : Started StreamControllerTest in 16.692 seconds (JVM running for 17.603)
2020-09-14 11:22:43.690  INFO 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-09-14 11:22:43.690  INFO 56560 --- [o-auto-1-exec-6] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-09-14 11:22:43.702  INFO 56560 --- [o-auto-1-exec-6] o.s.web.servlet.DispatcherServlet        : Completed initialization in 12 ms
2020-09-14 11:22:43.762 ERROR 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.http.MimeHeaders.getHeader(MimeHeaders.java:373) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.containsHeader(Response.java:356) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.containsHeader(Response.java:1109) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.ResponseFacade.containsHeader(ResponseFacade.java:398) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.security.web.header.writers.XXssProtectionHeaderWriter.writeHeaders(XXssProtectionHeaderWriter.java:51) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter.writeHeaders(HeaderWriterFilter.java:100) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterResponse.writeHeaders(HeaderWriterFilter.java:139) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter.doHeadersAfter(HeaderWriterFilter.java:94) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter.doFilterInternal(HeaderWriterFilter.java:77) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.context.SecurityContextPersistenceFilter.doFilter(SecurityContextPersistenceFilter.java:105) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter.doFilterInternal(WebAsyncManagerIntegrationFilter.java:56) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:215) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:178) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:358) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:271) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:373) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:43.833 ERROR 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] threw exception

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.http.MimeHeaders.getHeader(MimeHeaders.java:373) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.containsHeader(Response.java:356) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.containsHeader(Response.java:1109) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.ResponseFacade.containsHeader(ResponseFacade.java:398) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.security.web.header.writers.XXssProtectionHeaderWriter.writeHeaders(XXssProtectionHeaderWriter.java:51) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter.writeHeaders(HeaderWriterFilter.java:100) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterResponse.writeHeaders(HeaderWriterFilter.java:139) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterResponse.onResponseCommitted(HeaderWriterFilter.java:131) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper.doOnResponseCommitted(OnCommittedResponseWrapper.java:252) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper.access$000(OnCommittedResponseWrapper.java:34) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper$SaveContextServletOutputStream.flush(OnCommittedResponseWrapper.java:519) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at com.example.stream.StreamController.lambda$stream$0(StreamController.java:27) ~[main/:na]
	at org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler$StreamingResponseBodyTask.call(StreamingResponseBodyReturnValueHandler.java:111) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler$StreamingResponseBodyTask.call(StreamingResponseBodyReturnValueHandler.java:98) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.context.request.async.WebAsyncManager.lambda$startCallableProcessing$4(WebAsyncManager.java:337) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) ~[na:1.8.0_212]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_212]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:43.850 ERROR 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[Tomcat].[localhost]           : Exception Processing ErrorPage[errorCode=0, location=/error]

org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.NullPointerException
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:626) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:733) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:320) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.invoke(FilterSecurityInterceptor.java:115) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.doFilter(FilterSecurityInterceptor.java:90) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:118) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:84) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.AnonymousAuthenticationFilter.doFilter(AnonymousAuthenticationFilter.java:111) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter.doFilter(SecurityContextHolderAwareRequestFilter.java:158) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.savedrequest.RequestCacheAwareFilter.doFilter(RequestCacheAwareFilter.java:63) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:116) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.context.SecurityContextPersistenceFilter.doFilter(SecurityContextPersistenceFilter.java:105) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:215) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:178) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:358) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:271) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.invoke(ApplicationDispatcher.java:712) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.processRequest(ApplicationDispatcher.java:461) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.doForward(ApplicationDispatcher.java:384) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.forward(ApplicationDispatcher.java:312) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.custom(StandardHostValve.java:394) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.status(StandardHostValve.java:253) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.throwable(StandardHostValve.java:348) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:173) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:373) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]
Caused by: java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.http.MimeHeaders.getHeader(MimeHeaders.java:373) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.containsHeader(Response.java:356) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.containsHeader(Response.java:1109) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.ResponseFacade.containsHeader(ResponseFacade.java:398) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at javax.servlet.http.HttpServletResponseWrapper.containsHeader(HttpServletResponseWrapper.java:69) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.security.web.header.writers.XXssProtectionHeaderWriter.writeHeaders(XXssProtectionHeaderWriter.java:51) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter.writeHeaders(HeaderWriterFilter.java:100) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterResponse.writeHeaders(HeaderWriterFilter.java:139) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterResponse.onResponseCommitted(HeaderWriterFilter.java:131) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper.doOnResponseCommitted(OnCommittedResponseWrapper.java:252) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper.access$000(OnCommittedResponseWrapper.java:34) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.util.OnCommittedResponseWrapper$SaveContextServletOutputStream.flush(OnCommittedResponseWrapper.java:519) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at com.example.stream.StreamController.lambda$stream$0(StreamController.java:27) ~[main/:na]
	at org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler$StreamingResponseBodyTask.call(StreamingResponseBodyReturnValueHandler.java:111) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler$StreamingResponseBodyTask.call(StreamingResponseBodyReturnValueHandler.java:98) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.context.request.async.WebAsyncManager.lambda$startCallableProcessing$4(WebAsyncManager.java:337) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) ~[na:1.8.0_212]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	... 1 common frames omitted

2020-09-14 11:22:43.925 ERROR 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] threw exception

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.http.MimeHeaders.getHeader(MimeHeaders.java:373) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.getHeader(Response.java:865) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.ResponseFacade.getHeader(ResponseFacade.java:633) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at javax.servlet.http.HttpServletResponseWrapper.getHeader(HttpServletResponseWrapper.java:241) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at javax.servlet.http.HttpServletResponseWrapper.getHeader(HttpServletResponseWrapper.java:241) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.http.server.ServletServerHttpResponse$ServletResponseHttpHeaders.getFirst(ServletServerHttpResponse.java:143) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.http.HttpHeaders.getContentType(HttpHeaders.java:965) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor.writeWithMessageConverters(AbstractMessageConverterMethodProcessor.java:216) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor.handleReturnValue(HttpEntityMethodProcessor.java:219) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite.handleReturnValue(HandlerMethodReturnValueHandlerComposite.java:82) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:123) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:878) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:792) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:626) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:733) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:320) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.invoke(FilterSecurityInterceptor.java:115) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.doFilter(FilterSecurityInterceptor.java:90) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:118) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:84) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.AnonymousAuthenticationFilter.doFilter(AnonymousAuthenticationFilter.java:111) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter.doFilter(SecurityContextHolderAwareRequestFilter.java:158) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.savedrequest.RequestCacheAwareFilter.doFilter(RequestCacheAwareFilter.java:63) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:116) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.context.SecurityContextPersistenceFilter.doFilter(SecurityContextPersistenceFilter.java:105) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:215) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:178) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:358) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:271) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.invoke(ApplicationDispatcher.java:712) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.processRequest(ApplicationDispatcher.java:461) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.doForward(ApplicationDispatcher.java:384) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.forward(ApplicationDispatcher.java:312) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.custom(StandardHostValve.java:394) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.status(StandardHostValve.java:253) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.throwable(StandardHostValve.java:348) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.AsyncContextImpl.setErrorState(AsyncContextImpl.java:445) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:370) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:373) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:43.943 ERROR 56560 --- [o-auto-1-exec-6] o.a.c.c.C.[Tomcat].[localhost]           : Exception Processing ErrorPage[errorCode=0, location=/error]

org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.NullPointerException
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:626) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:733) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:320) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.invoke(FilterSecurityInterceptor.java:115) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.intercept.FilterSecurityInterceptor.doFilter(FilterSecurityInterceptor.java:90) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:118) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:84) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.AnonymousAuthenticationFilter.doFilter(AnonymousAuthenticationFilter.java:111) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter.doFilter(SecurityContextHolderAwareRequestFilter.java:158) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.savedrequest.RequestCacheAwareFilter.doFilter(RequestCacheAwareFilter.java:63) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:116) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.context.SecurityContextPersistenceFilter.doFilter(SecurityContextPersistenceFilter.java:105) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.security.web.FilterChainProxy$VirtualFilterChain.doFilter(FilterChainProxy.java:334) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:215) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:178) ~[spring-security-web-5.3.4.RELEASE.jar:5.3.4.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:358) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:271) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:103) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.invoke(ApplicationDispatcher.java:712) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.processRequest(ApplicationDispatcher.java:461) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.doForward(ApplicationDispatcher.java:384) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.ApplicationDispatcher.forward(ApplicationDispatcher.java:312) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.custom(StandardHostValve.java:394) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.status(StandardHostValve.java:253) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.StandardHostValve.throwable(StandardHostValve.java:348) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.core.AsyncContextImpl.setErrorState(AsyncContextImpl.java:445) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:370) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:373) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]
Caused by: java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.http.MimeHeaders.getHeader(MimeHeaders.java:373) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.getHeader(Response.java:865) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.ResponseFacade.getHeader(ResponseFacade.java:633) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at javax.servlet.http.HttpServletResponseWrapper.getHeader(HttpServletResponseWrapper.java:241) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at javax.servlet.http.HttpServletResponseWrapper.getHeader(HttpServletResponseWrapper.java:241) ~[tomcat-embed-core-9.0.37.jar:4.0.FR]
	at org.springframework.http.server.ServletServerHttpResponse$ServletResponseHttpHeaders.getFirst(ServletServerHttpResponse.java:143) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.http.HttpHeaders.getContentType(HttpHeaders.java:965) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor.writeWithMessageConverters(AbstractMessageConverterMethodProcessor.java:216) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor.handleReturnValue(HttpEntityMethodProcessor.java:219) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite.handleReturnValue(HandlerMethodReturnValueHandlerComposite.java:82) ~[spring-web-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:123) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:878) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:792) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	... 64 common frames omitted

2020-09-14 11:22:43.989 ERROR 56560 --- [o-auto-1-exec-6] o.a.catalina.connector.CoyoteAdapter     : Exception while processing an asynchronous request

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.getValue(MimeHeaders.java:341) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.isConnectionToken(Http11Processor.java:1015) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.prepareResponse(Http11Processor.java:891) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessor.action(AbstractProcessor.java:376) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.action(Response.java:211) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.sendHeaders(Response.java:437) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.OutputBuffer.doFlush(OutputBuffer.java:291) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.OutputBuffer.close(OutputBuffer.java:251) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.Response.finishResponse(Response.java:442) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.catalina.connector.CoyoteAdapter.asyncDispatch(CoyoteAdapter.java:245) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessor.dispatch(AbstractProcessor.java:238) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:59) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:43.993 ERROR 56560 --- [o-auto-1-exec-6] o.a.coyote.http11.Http11NioProtocol      : Error reading request, ignored

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.clear(MimeHeaders.java:150) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.recycle(Response.java:621) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11OutputBuffer.nextRequest(Http11OutputBuffer.java:271) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11OutputBuffer.recycle(Http11OutputBuffer.java:254) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.recycle(Http11Processor.java:1355) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.release(AbstractProtocol.java:1072) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:993) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:44.007 ERROR 56560 --- [o-auto-1-exec-6] org.apache.tomcat.util.net.NioEndpoint   : Error running socket processor

java.lang.NullPointerException: null
	at org.apache.tomcat.util.http.MimeHeaders.clear(MimeHeaders.java:150) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.Response.recycle(Response.java:621) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11OutputBuffer.nextRequest(Http11OutputBuffer.java:271) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11OutputBuffer.recycle(Http11OutputBuffer.java:254) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.http11.Http11Processor.recycle(Http11Processor.java:1355) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.release(AbstractProtocol.java:1072) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:1032) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1589) ~[tomcat-embed-core-9.0.37.jar:9.0.37]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_212]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_212]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.37.jar:9.0.37]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_212]

2020-09-14 11:22:46.945  INFO 56560 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
BUILD SUCCESSFUL in 21s
4 actionable tasks: 1 executed, 3 up-to-date
11:22:47: Task execution finished ':test --tests "com.example.stream.StreamControllerTest.streaming"'.

```

</details>
