package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 客户端信息表
 */
@Data
@TableName(value = "ai_client_info")
public class AiClientInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 客户端id
     */
    @TableField(value = "client_id")
    private String clientId;

    /**
     * 客户端名称
     */
    @TableField(value = "client_name")
    private String clientName;

    /**
     * 客户端描述
     */
    @TableField(value = "client_desc")
    private String clientDesc;

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