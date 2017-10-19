package com.ai.czh.spring.log.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * http://localhost:8080/spring-mvc-logback
 */
@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {
    private static final Logger logger =
            LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String welcome(Model model) {
        logger.trace("Trace level");

        logger.info("params:","Info level");

        logger.debug("welcome() is executed, value {}", "Debug level");
        logger.warn("Warn level");

        logger.error("This is Error message", new Exception("Testing"));

        model.addAttribute("msg", "Hello Spring MVC + Logback");

        return "welcome";

    }
}
