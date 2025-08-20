package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * MCP信息表
 */
@Data
@TableName(value = "ai_mcp_info")
public class AiMcpInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * MCP id
     */
    @TableField(value = "mcp_id")
    private String mcpId;

    /**
     * MCP名称
     */
    @TableField(value = "mcp_name")
    private String mcpName;

    /**
     * 传输类型
     */
    @TableField(value = "transport_type")
    private String transportType;

    /**
     * 传输配置
     */
    @TableField(value = "transport_config")
    private String transportConfig;

    /**
     * 请求超时时间(分钟)
     */
    @TableField(value = "request_timeout")
    private Integer requestTimeout;

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