package dev.study.devspringprj.blog.test;

import org.apache.logging.log4j.core.config.plugins.util.PluginUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/* 사용자가 요청 -> 응답(HTML파일) ==> @Controller */
/* 사용자가 요청 -> 응답(data) ==> @RestController */

@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest() {
        return "get 요청";
    }

    @PostMapping("/http/post")
    public String postTest() {
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }

}