package dev.study.devspringprj.restApi;

public class restTest {
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.apiTest("get");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
