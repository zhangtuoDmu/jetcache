/**
 * Created on  13-09-04 14:03
 */
package com.alicp.jetcache.anno.support;

import com.alicp.jetcache.anno.impl.ProxyUtil;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class CacheClient {

    private GlobalCacheConfig globalCacheConfig;

    public <T> T getProxy(T target, CacheAnnoConfig cacheAnnoConfig) {
        return ProxyUtil.getProxy(target, cacheAnnoConfig, globalCacheConfig);
    }

    public <T> T getProxyByAnnotation(T target) {
        return ProxyUtil.getProxyByAnnotation(target, globalCacheConfig);
    }

    public void setGlobalCacheConfig(GlobalCacheConfig globalCacheConfig) {
        this.globalCacheConfig = globalCacheConfig;
    }

    public GlobalCacheConfig getGlobalCacheConfig() {
        return globalCacheConfig;
    }
}
