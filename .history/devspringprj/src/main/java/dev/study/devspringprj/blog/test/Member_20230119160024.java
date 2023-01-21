package dev.study.devspringprj.blog.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Getter : getter메소드 자동생성 어노테이션
 * @Setter : setter메소드 자동생성 어노테이션
 * @NoArgsConstructor : 파라메터가 없는 기본 생성자 자동생성 어노테이션
 * @AllArgsConstructor : 모든 필드를 파라메터로 가지는 생성자 자동생성 어노테이션
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
}
