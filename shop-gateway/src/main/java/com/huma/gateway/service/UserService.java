package com.huma.gateway.service;

import com.huma.gateway.service.impl.UserFallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "huma-auth",path = "auth",fallback = UserFallbackServiceImpl.class)
public interface UserService {
    @RequestMapping(value = "/username/{username}",method = RequestMethod.GET)
    String getUserByUsername(@PathVariable String username);

    @RequestMapping(value = "/gateway/getUserRolesByNameForGateWay",method = RequestMethod.GET)
    List<String> getUserRolesByName(@RequestParam("username")String username);

    @RequestMapping(value = "/gateway/getUserPermissionsByNameForGateWay",method = RequestMethod.GET)
    List<String> getUserPermissionsByName(@RequestParam("username")String username);
}

