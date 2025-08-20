package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 智能体信息表
 */
@Data
@TableName(value = "ai_agent_info")
public class AiAgentInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 智能体id
     */
    @TableField(value = "agent_id")
    private String agentId;

    /**
     * 智能体名称
     */
    @TableField(value = "agent_name")
    private String agentName;

    /**
     * 智能体描述
     */
    @TableField(value = "agent_desc")
    private String agentDesc;

    /**
     * 智能体类型
     */
    @TableField(value = "agent_type")
    private String agentType;

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