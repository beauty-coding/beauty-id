package com.beauty.idgenerator.config;

import com.beauty.idgenerator.enums.Type;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * 配置解析
 * @author yufw
 */
@ConfigurationProperties(prefix = "beauty.id-generator")
public class BeautyProperties {

    /**
     * snowFlake
     */
    private String type = Type.SNOWFLAKE.getType();

    @NestedConfigurationProperty
    private SnowFlakeProperties snowFlakeProperties;

    private Boolean enable = false;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SnowFlakeProperties getSnowFlakeProperties() {
        return snowFlakeProperties;
    }

    public void setSnowFlakeProperties(SnowFlakeProperties snowFlakeProperties) {
        this.snowFlakeProperties = snowFlakeProperties;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}

