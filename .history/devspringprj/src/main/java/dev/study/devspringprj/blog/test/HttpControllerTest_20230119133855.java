package dev.study.devspringprj.blog.test;

import org.apache.logging.log4j.core.config.plugins.util.PluginUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/* 사용자가 요청 -> 응답(HTML파일) ==> @Controller */
/* 사용자가 요청 -> 응답(data) ==> @RestController */

@RestController
@Slf4j
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest() {
        log.info("get 테스트");
        return "get 요청";
    }

    @PostMapping("/http/post")
    public String postTest() {
        log.info("post 테스트");
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest() {
        log.info("put 테스트");
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        log.info("delete 테스트");
        return "delete 요청";
    }

    @Override
    public String toString() {
        return "HttpControllerTest []";
    }

}