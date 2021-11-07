package com.beauty.idgenerator.config;

import com.beauty.idgenerator.util.IdGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author yufw
 */
@Configuration
@EnableConfigurationProperties(BeautyProperties.class)
@ConditionalOnProperty(
        prefix = "beauty.id-generator",
        name = "enable",
        havingValue = "true"
)
public class BeautyAutoConfiguration {

    @Resource
    BeautyProperties beautyProperties;

    @Bean
    public IdGenerator getIdGenerator(){
        return new IdGenerator(beautyProperties);
    }


}
