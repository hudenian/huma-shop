//package com.huma.gateway.controller;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.huma.gateway.config.UserConfig;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//public class UserController {
//
//    @Resource
//    private UserConfig userConfig;
//
//    @GetMapping
//    public String get() throws JsonProcessingException {
//        return new ObjectMapper().writeValueAsString(userConfig);
//    }
//}
