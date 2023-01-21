package dev.study.devspringprj.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/* 사용자가 요청 -> 응답(HTML파일) ==> @Controller */
/* 사용자가 요청 -> 응답(data) ==> @RestController */

@RestController
@Slf4j
public class HttpControllerTest {

    //인터넷 url에서 요청은 get만 할수 있다.
    //@RequestParam int id, @RequestParam String username  <== 변수 하나씩 받을때
    //Member member 객체 안에 있는 변수와 같은 이름의 파라메터가들어오면 알아서 매핑 된다.
    @GetMapping("/http/get")
    public String getTest(Member member) {
        log.info(member.toString());
        log.info("get 테스트");
        return "get 요청( id : " + member.getId() + ", username : " + member.getUsername() + ", password : " + member.getPassword() + ", email : " + member.getEmail() + " )";
    }

    @PostMapping("/http/post")
    public String postTest(Member member) {
        log.info(member.toString());
        log.info("post 테스트");
        return "post 요청( id : " + member.getId() + ", username : " + member.getUsername() + ", password : " + member.getPassword() + ", email : " + member.getEmail() + " )";
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
}