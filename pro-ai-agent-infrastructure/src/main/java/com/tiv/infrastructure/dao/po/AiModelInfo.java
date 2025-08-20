package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 模型信息表
 */
@Data
@TableName(value = "ai_model_info")
public class AiModelInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 模型id
     */
    @TableField(value = "model_id")
    private String modelId;

    /**
     * api id
     */
    @TableField(value = "api_id")
    private String apiId;

    /**
     * 模型名称
     */
    @TableField(value = "model_name")
    private String modelName;

    /**
     * 模型类型
     */
    @TableField(value = "model_type")
    private String modelType;

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