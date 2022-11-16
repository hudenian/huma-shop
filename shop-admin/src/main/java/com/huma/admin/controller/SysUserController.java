package com.huma.admin.controller;

import com.huma.common.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */

@RestController
@RequestMapping("system")
@RequiredArgsConstructor
public class SysUserController {


    @GetMapping("/username/{username}")
    public Result<String> getUserByUserName( @PathVariable String username) {
        String user = username + System.currentTimeMillis();
        return Result.success(user);
    }

}
