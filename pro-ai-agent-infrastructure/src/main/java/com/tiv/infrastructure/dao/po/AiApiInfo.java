package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * api配置信息表
 */
@Data
@TableName(value = "ai_api_info")
public class AiApiInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * api id
     */
    @TableField(value = "api_id")
    private String apiId;

    /**
     * 基础url
     */
    @TableField(value = "base_url")
    private String baseUrl;

    /**
     * api密钥
     */
    @TableField(value = "api_key")
    private String apiKey;

    /**
     * 补全路径
     */
    @TableField(value = "completions_path")
    private String completionsPath;

    /**
     * 嵌入路径
     */
    @TableField(value = "embeddings_path")
    private String embeddingsPath;

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