package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 客户端顾问信息表
 */
@Data
@TableName(value = "ai_client_advisor_info")
public class AiClientAdvisorInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 顾问id
     */
    @TableField(value = "advisor_id")
    private String advisorId;

    /**
     * 顾问名称
     */
    @TableField(value = "advisor_name")
    private String advisorName;

    /**
     * 顾问类型
     */
    @TableField(value = "advisor_type")
    private String advisorType;

    /**
     * 顺序
     */
    @TableField(value = "sequence")
    private Integer sequence;

    /**
     * 参数配置
     */
    @TableField(value = "param")
    private Object param;

    /**
     * 状态:0-禁用,1-启用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

}