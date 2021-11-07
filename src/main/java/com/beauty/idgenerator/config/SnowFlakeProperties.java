package com.beauty.idgenerator.config;

/**
 * description
 *
 * @author yufengwen
 * @date 2021/11/3 7:05 下午
 */
public class SnowFlakeProperties {
    /**
     * 机器ID  2进制5位  32位减掉1位 31个
     */
    private long workerId = 1L;

    /**
     * 机房ID 2进制5位  32位减掉1位 31个
     */
    private long datacenterId = 1L;

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public long getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(long datacenterId) {
        this.datacenterId = datacenterId;
    }
}
