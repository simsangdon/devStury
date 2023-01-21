package dev.study.devspringprj.blog.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
    
    @Override
    public String toString() {
        return "Member [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
    }
}
