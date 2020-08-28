package com.sparkle.blog.controller;

import com.sparkle.blog.utils.ESUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/elasticsearch")
    public String testElasticSearch() {
        Map<String, Object> mapping = new HashMap<>();
        Map<String, Object> properties = new HashMap<>();
        Map<String, Object> name = new HashMap<>();
        name.put("type", "text");
        Map<String, Object> age = new HashMap<>();
        age.put("type", "integer");
        properties.put("name", name);
        properties.put("age", age);
        mapping.put("properties", properties);
        ESUtil.createIndex("test", mapping);
        return "success";
    }

}
