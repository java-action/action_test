package com.waglewagle.rest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @GetMapping("/demo")
    @ResponseBody
    public Map<String, String> sendDemoData() {

        Map<String, String> testData = new HashMap<>();
        testData.put("TestKey", "TestValue");

        return testData;
    }
}
