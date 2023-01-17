package dev.study.devspringprj.restApi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class restTest {
    public static void main(String[] args) {
        Server server = new Server();
        try {
            log.info("test__rest");
            server.apiTest("post");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
