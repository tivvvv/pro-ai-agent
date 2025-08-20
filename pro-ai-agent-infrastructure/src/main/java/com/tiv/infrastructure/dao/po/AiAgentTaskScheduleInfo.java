package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 智能体任务调度信息表
 */
@Data
@TableName(value = "ai_agent_task_schedule_info")
public class AiAgentTaskScheduleInfo {

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
     * 任务名称
     */
    @TableField(value = "task_name")
    private String taskName;

    /**
     * 任务描述
     */
    @TableField(value = "task_desc")
    private String taskDesc;

    /**
     * cron表达式
     */
    @TableField(value = "cron")
    private String cron;

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