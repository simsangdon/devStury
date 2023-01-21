package dev.study.devspringprj.restApi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class restTest {
    public static void main(String[] args) {
        Server server = new Server();
        try {
            log.info("rest실행 실습");
            server.apiTest("get");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
