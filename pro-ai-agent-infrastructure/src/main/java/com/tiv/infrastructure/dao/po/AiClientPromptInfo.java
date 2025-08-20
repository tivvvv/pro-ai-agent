package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 客户端提示词信息表
 */
@Data
@TableName(value = "ai_client_prompt_info")
public class AiClientPromptInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 提示词id
     */
    @TableField(value = "prompt_id")
    private String promptId;

    /**
     * 提示词名称
     */
    @TableField(value = "prompt_name")
    private String promptName;

    /**
     * 提示词内容
     */
    @TableField(value = "prompt_content")
    private String promptContent;

    /**
     * 提示词描述
     */
    @TableField(value = "prompt_desc")
    private String promptDesc;

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