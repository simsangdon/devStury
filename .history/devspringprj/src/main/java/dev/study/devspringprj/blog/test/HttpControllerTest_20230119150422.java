package dev.study.devspringprj.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        log.info("get 테스트");
        log.info(member.toString());
        return "get 요청( id : " + member.getId() + ", username : " + member.getUsername() + ", password : " + member.getPassword() + ", email : " + member.getEmail() + " )";
    }

    //postman에 body에서 x-www-form-urlencoded 방식은 html에서 <form></form>테그를 사용하는것과 같다. 파라메터는 get과 같이 Member member 적어도 무방하다.
    //body의 text값을 받을때는 @RequestBody 어노테이션을 셋팅(@RequestBody String text) 한다 postman에서 text로 테스트를 할때는 body에서 raw를 선택 하고 테스트 한다. raw선택시에는 가장 우측에 Text, JavaScript, JSON, HTML, XML중 선택 하여 할수 있다. 통상적으로 JSON사용.
    //raw에서 JSON으로 선택하고 값을 작성할때는 Member객체의 변수들과 같은 값들이 들어 있다면 Member객체로 받을수 있다.(@RequestBody Member member  <== 이렇게 선언한다.)
    @PostMapping("/http/post")
    public String postTest(@RequestBody Member member) {
        log.info("post 테스트");
        //log.info("text : " + text);
        log.info(member.toString());
        return "post 요청( id : " + member.getId() + ", username : " + member.getUsername() + ", password : " + member.getPassword() + ", email : " + member.getEmail() + " )";
        //return "post 요청( text : " + text + " )";
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