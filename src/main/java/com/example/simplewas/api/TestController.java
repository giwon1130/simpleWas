package com.example.simplewas.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/info")
    public Map<String, Object> testInfoGET() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("이름", "임기원");
        resultMap.put("한줄요약", "적극적인 리더형 개발자");
        // 테스트
        return resultMap;
    }
}