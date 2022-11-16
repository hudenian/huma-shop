package com.huma.system.api;


import com.huma.common.result.Result;
import com.huma.system.api.fallback.UserFeignFallbackClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
@FeignClient(value = "shop-admin", fallback = UserFeignFallbackClient.class)
public interface UserFeignClient {

    @GetMapping("/system/username/{username}")
    Result<String> getUserByUserName(@PathVariable String username);
}
