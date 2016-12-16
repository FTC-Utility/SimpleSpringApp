package com.simplespring.web.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


/**
 * Created by Eyuel Tadesse on 12/1/2016.
 */

@Configuration
@ComponentScan(basePackages = "com.simplespring.web",excludeFilters =@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.simplespring.web.webConfig.*"))
@PropertySource(value = {"classpath:application.properties"})
@EnableCaching
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager();
    }
}
