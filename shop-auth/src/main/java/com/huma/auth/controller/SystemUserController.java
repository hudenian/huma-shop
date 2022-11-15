package com.huma.auth.controller;

import com.huma.auth.service.SystemUserService;
import com.huma.common.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class SystemUserController {

    @Resource
    private SystemUserService systemUserService;

    @GetMapping("/username/{username}")
    public Result<String> getUserByUsername(@PathVariable String username) {
        return Result.success(systemUserService.loadUserByUsername(username));
    }
}
