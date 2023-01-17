package dev.study.devspringprj.blog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring이 dev.study.devspringprj 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아님
 * 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에서 관리해줌
 */
@RestController
public class BlogControllerTest {
    private Logger log = LoggerFactory.getLogger(getClass());
    @GetMapping("/test/hello")
    public String hello() {
        log.info("hello");
        return "<div>hello spring boot_심상돈</div>";
    }
}
