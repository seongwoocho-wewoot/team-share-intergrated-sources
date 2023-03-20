package team.share.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jTest {

    public static void main(String[] args) {
        String var = "philz";
        log.info("hello, {}", var);
    }
}
