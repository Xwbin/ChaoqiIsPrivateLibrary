
package com.chaoqi.demo.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/test") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    public String sayHello() {
        logger.info("hello world");
        return "index";
    }
}
