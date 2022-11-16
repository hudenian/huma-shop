package com.huma.system.api.fallback;


import com.huma.common.result.Result;
import com.huma.common.result.ResultCode;
import com.huma.system.api.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 */
@Component
@Slf4j
public class UserFeignFallbackClient implements UserFeignClient {

    @Override
    public Result<String> getUserByUserName(String username) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return Result.failed(ResultCode.DEGRADATION.getMsg());
    }
}
