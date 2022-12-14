package com.huma.gateway.propertys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cache {
    private String cacheName;  // redis cache 名
    private Long ttl = 0L;           // 最大生存时间 秒  null || 0 永不过期
    private Long maxIdleTime = 0L;   // 最大空闲时间  秒  null || 0 永不过期
}
