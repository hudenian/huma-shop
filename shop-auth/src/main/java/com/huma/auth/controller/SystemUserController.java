package com.huma.auth.controller;

import com.huma.auth.service.SystemUserService;
import com.huma.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Api("鉴权")
public class SystemUserController {

    @Resource
    private SystemUserService systemUserService;

    @GetMapping("/login")
    @ApiOperation("登录接口")
    public Result<String> getUserByUsername(String username, String password) {
        return Result.success(systemUserService.loadUserByUsername(username));
    }
}
