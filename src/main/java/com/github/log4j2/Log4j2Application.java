package com.github.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Log4j2Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Log4j2Application.class, args);
    }

    @PostMapping("/test")
    @ResponseBody
    public void test(@RequestBody POJO pojo) {
        LOGGER.info("input param: " + pojo.getParam());
    }

    public static class POJO {
        private String param;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }
    }

}
