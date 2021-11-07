package com.beauty.idgenerator.enums;

/**
 * description
 *
 * @author yufengwen
 * @date 2021/11/3 6:58 下午
 */
public enum Type {

    /**
     * 雪花
     */
    SNOWFLAKE("snowflake")
    ;

    private String type;

    Type(String type) {

        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
