package com.wisniowski.sandbox.structures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@SpringBootApplication
public class StructuresApplication {
    static Logger log = Logger.getLogger(StructuresApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(StructuresApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        long startTime = System.currentTimeMillis();
        log.info("start - hello at:" + startTime);
        Sorts sorts = new Sorts();

        long endTime = System.currentTimeMillis();
        log.info("end - hello at:" + endTime);
        return "hello";
    }

}
