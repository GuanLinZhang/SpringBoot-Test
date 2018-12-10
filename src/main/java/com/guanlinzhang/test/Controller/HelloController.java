package com.guanlinzhang.test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class HelloController {

    @RequestMapping
    public String hello() {
        return "hello";
    }

    @RequestMapping("/info")
    public Map<String,String> getInfo(@RequestParam("name") String name) {
        var map = new HashMap<String,String>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String,Integer>> getList() {
        var list = new ArrayList<Map<String,Integer>>();

        for (int i = 0; i < 5; i++) {
            var map = new HashMap<String, Integer>();
            map.put("name", i);
            list.add(map);
        }
        return list;
    }
}
