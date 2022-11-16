package com.huma.auth.service.impl;

import com.huma.auth.service.SystemUserService;
import com.huma.system.api.UserFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SystemUserServiceImpl implements SystemUserService {

    private final UserFeignClient userFeignClient;

    @Override
    public String loadUserByUsername(String username) {
        return  userFeignClient.getUserByUserName(username).getData();
    }
}
