package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * This is a simple method with no input arguments and return just a string
     * as response. Note: If ResponseBody annotation is not present, spring will
     * try to resolve the string into a page by applying prefix suffix etc. If
     * it cannot find anything you should get a 404 not found.
     * 
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring Controller";
    }

    /**
     * 
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/mypage")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {

        // Add some data to use in view
        model.addAttribute("name", name);

        /*
         * return the view name and the framework will use prefix and suffix
         * provided in xml to figure out the exact page path
         */
        return "helloworld";

    }

}
