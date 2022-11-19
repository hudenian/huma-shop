package com.huma.gateway.propertys;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author hudenian
 * @date 2022/11/14
 */
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "huma")
@Getter
@Setter
@Slf4j
public class SystemConfig {
    private List<String> skipUrls; //  白名单 无需认证 放行uri

    private List<Cache> caches;

}