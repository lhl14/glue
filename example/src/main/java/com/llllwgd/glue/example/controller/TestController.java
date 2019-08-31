package com.llllwgd.glue.example.controller;

import com.llllwgd.glue.core.GlueFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: llllwgd
 * Description:
 * Date: 2019-08-31
 * Time: 18:48
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(String t) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("telephone", t);
        Object glue = GlueFactory.glue("xxl_glue_core_exapml.llllwgd_test", map);
        return glue;
    }

}
