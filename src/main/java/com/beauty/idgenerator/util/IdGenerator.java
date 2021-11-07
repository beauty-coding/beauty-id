package com.beauty.idgenerator.util;

import com.beauty.idgenerator.config.BeautyProperties;
import com.beauty.idgenerator.config.SnowFlakeProperties;
import com.beauty.idgenerator.enums.Type;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * description
 *
 * @author yufengwen
 * @date 2021/11/3 5:43 下午
 */
public class IdGenerator {

    private BeautyProperties beautyProperties;

    public IdGenerator() {
    }

    public IdGenerator(BeautyProperties beautyProperties) {
        this.beautyProperties = beautyProperties;
    }

    public Long nextId() throws Exception {

        System.out.println("配置信息："+beautyProperties);

        final String type = beautyProperties.getType();
        System.out.println("id生成器类型 type:"+type);
        switch (Type.valueOf(type)) {
            case SNOWFLAKE:
                final SnowFlakeProperties snowFlakeProperties = beautyProperties.getSnowFlakeProperties();
                final long workerId = snowFlakeProperties.getWorkerId();
                final long datacenterId = snowFlakeProperties.getDatacenterId();

                final SnowFlakeUtil snowFlakeUtil = new SnowFlakeUtil(datacenterId, workerId, 1);
                final long id = snowFlakeUtil.nextId();
                System.out.println("生成的id:"+id);
                return id;
            default:
                break;
        }
        throw new Exception("生成id失败");

    }


}
