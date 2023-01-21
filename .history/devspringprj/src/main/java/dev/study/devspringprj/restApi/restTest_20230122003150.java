package dev.study.devspringprj.restApi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class restTest {
    public static void main(String[] args) {
        try {
            log.info("rest실행 실습");
            Server.apiTest("get");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
