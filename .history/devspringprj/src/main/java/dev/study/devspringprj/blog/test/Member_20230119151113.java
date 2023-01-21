package dev.study.devspringprj.blog.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;

    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    
    @Override
    public String toString() {
        return "Member [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
    }
}
