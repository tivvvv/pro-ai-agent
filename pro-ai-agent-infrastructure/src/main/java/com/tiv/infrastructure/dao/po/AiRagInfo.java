package com.tiv.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 知识库信息表
 */
@Data
@TableName(value = "ai_rag_info")
public class AiRagInfo {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 知识库id
     */
    @TableField(value = "rag_id")
    private String ragId;

    /**
     * 知识库名称
     */
    @TableField(value = "rag_name")
    private String ragName;

    /**
     * 知识库标签
     */
    @TableField(value = "rag_tag")
    private String ragTag;

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