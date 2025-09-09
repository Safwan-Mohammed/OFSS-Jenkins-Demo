package org.example.ofssjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OfssJenkinsApplicationTests {

    private final OFSSTest ofssTest = new OFSSTest();
    @Test
    void contextLoads() {
        ofssTest.sayHello();
    }

}
