package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 统一配置表
 */
@Data
@TableName(value = "ai_unified_config")
public class AiUnifiedConfig {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 源类型
     */
    @TableField(value = "source_type")
    private String sourceType;

    /**
     * 源id
     */
    @TableField(value = "source_id")
    private String sourceId;

    /**
     * 目标类型
     */
    @TableField(value = "target_type")
    private String targetType;

    /**
     * 目标id
     */
    @TableField(value = "target_id")
    private String targetId;

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