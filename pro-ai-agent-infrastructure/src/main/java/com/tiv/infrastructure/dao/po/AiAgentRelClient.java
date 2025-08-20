package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 智能体-客户端关联表
 */
@Data
@TableName(value = "ai_agent_rel_client")
public class AiAgentRelClient {

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
     * 客户端id
     */
    @TableField(value = "client_id")
    private String clientId;

    /**
     * 顺序
     */
    @TableField(value = "sequence")
    private Integer sequence;

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