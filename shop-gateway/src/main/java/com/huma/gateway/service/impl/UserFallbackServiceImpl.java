package com.huma.gateway.service.impl;


import com.huma.gateway.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallbackServiceImpl implements UserService {

    @Override
    public String getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<String> getUserRolesByName(String username) {
        return null;
    }

    @Override
    public List<String> getUserPermissionsByName(String username) {
        return null;
    }
}
