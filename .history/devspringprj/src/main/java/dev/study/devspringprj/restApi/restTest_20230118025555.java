package dev.study.devspringprj.restApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class restTest {
    private Logger log = LoggerFactory.getLogger(getClass());
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.apiTest("post");
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
