package dev.study.devspringprj.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring이 dev.study.devspringprj 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아님
 * 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에서 관리해줌
 */
@RestController
@Slf4j
public class BlogControllerTest {
    //TODO : @Slf4j 어노테이션을 사용하면 아래 log선언부를 삭제할수 있다.
    //private Logger log = LoggerFactory.getLogger(getClass());
    @GetMapping("/test/hello")
    public String hello() {
        log.info("잘되나? 궁금하군.");
        return "<div>hello spring boot_심상돈111</div>";
    }
}
