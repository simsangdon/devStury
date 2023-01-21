package dev.study.devspringprj.blog.test;

public class Member {
    private int id;
    private String username;
    private String password;
    private String emaeil;

    public Member(int id, String username, String password, String emaeil) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.emaeil = emaeil;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmaeil() {
        return emaeil;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmaeil(String emaeil) {
        this.emaeil = emaeil;
    }
}
