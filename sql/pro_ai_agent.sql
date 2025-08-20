# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_agent_info;

CREATE TABLE ai_agent_info
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `agent_id`    varchar(64) NOT NULL COMMENT '智能体id',
    `agent_name`  varchar(64) NOT NULL COMMENT '智能体名称',
    `agent_desc`  varchar(255) DEFAULT NULL COMMENT '智能体描述',
    `agent_type`  varchar(32)  DEFAULT NULL COMMENT '智能体类型',
    `status`      tinyint(1)   DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_agent_id` (`agent_id`)
) COMMENT ='智能体信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_agent_rel_client;

CREATE TABLE ai_agent_rel_client
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `agent_id`    varchar(64) NOT NULL COMMENT '智能体id',
    `client_id`   varchar(64) NOT NULL COMMENT '客户端id',
    `sequence`    int         NOT NULL COMMENT '顺序',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_agent_client_seq` (`agent_id`, `client_id`, `sequence`)
) COMMENT ='智能体-客户端关联表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_agent_task_schedule_info;

CREATE TABLE ai_agent_task_schedule_info
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `agent_id`    varchar(64) NOT NULL COMMENT '智能体id',
    `task_name`   varchar(64)  DEFAULT NULL COMMENT '任务名称',
    `task_desc`   varchar(255) DEFAULT NULL COMMENT '任务描述',
    `cron`        varchar(50) NOT NULL COMMENT 'cron表达式',
    `param`       json         DEFAULT NULL COMMENT '参数配置',
    `status`      tinyint(1)   DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_agent_id` (`agent_id`)
) COMMENT ='智能体任务调度信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_api_info;

CREATE TABLE ai_api_info
(
    `id`               bigint       NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `api_id`           varchar(64)  NOT NULL COMMENT 'api id',
    `base_url`         varchar(255) NOT NULL COMMENT '基础url',
    `api_key`          varchar(255) NOT NULL COMMENT 'api密钥',
    `completions_path` varchar(255) NOT NULL COMMENT '补全路径',
    `embeddings_path`  varchar(255) NOT NULL COMMENT '嵌入路径',
    `status`           tinyint(1)   NOT NULL DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time`      datetime              DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`      datetime              DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_api_id` (`api_id`),
    KEY `idx_status` (`status`)
) COMMENT ='api配置信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_model_info;

CREATE TABLE ai_model_info
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `model_id`    varchar(64) NOT NULL COMMENT '模型id',
    `api_id`      varchar(64) NOT NULL COMMENT 'api id',
    `model_name`  varchar(64) NOT NULL COMMENT '模型名称',
    `model_type`  varchar(32) NOT NULL COMMENT '模型类型',
    `status`      tinyint(1)  NOT NULL DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime             DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime             DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_model_id` (`model_id`),
    KEY `idx_api_id` (`api_id`),
    KEY `idx_status` (`status`)
) COMMENT ='模型信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_client_info;

CREATE TABLE ai_client_info
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `client_id`   varchar(64) NOT NULL COMMENT '客户端id',
    `client_name` varchar(64) NOT NULL COMMENT '客户端名称',
    `client_desc` varchar(512) DEFAULT NULL COMMENT '客户端描述',
    `status`      tinyint(1)   DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_client_id` (`client_id`)
) COMMENT ='客户端信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_client_advisor_info;

CREATE TABLE ai_client_advisor_info
(
    `id`           bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `advisor_id`   varchar(64) NOT NULL COMMENT '顾问id',
    `advisor_name` varchar(64) NOT NULL COMMENT '顾问名称',
    `advisor_type` varchar(32) NOT NULL COMMENT '顾问类型',
    `sequence`     int         NOT NULL COMMENT '顺序',
    `param`        json       DEFAULT NULL COMMENT '参数配置',
    `status`       tinyint(1) DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time`  datetime   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`  datetime   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_advisor_id` (`advisor_id`)
) COMMENT ='客户端顾问信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_client_prompt_info;

CREATE TABLE ai_client_prompt_info
(
    `id`             bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `prompt_id`      varchar(64) NOT NULL COMMENT '提示词id',
    `prompt_name`    varchar(64) NOT NULL COMMENT '提示词名称',
    `prompt_content` text        NOT NULL COMMENT '提示词内容',
    `prompt_desc`    varchar(512) DEFAULT NULL COMMENT '提示词描述',
    `status`         tinyint(1)   DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time`    datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`    datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_prompt_id` (`prompt_id`)
) COMMENT ='客户端提示词信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_rag_info;

CREATE TABLE ai_rag_info
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `rag_id`      varchar(64) NOT NULL COMMENT '知识库id',
    `rag_name`    varchar(64) NOT NULL COMMENT '知识库名称',
    `rag_tag`     varchar(50) NOT NULL COMMENT '知识库标签',
    `status`      tinyint(1) DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_rag_id` (`rag_id`)
) COMMENT ='知识库信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_mcp_info;

CREATE TABLE ai_mcp_info
(
    `id`               bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `mcp_id`           varchar(64) NOT NULL COMMENT 'MCP id',
    `mcp_name`         varchar(64) NOT NULL COMMENT 'MCP名称',
    `transport_type`   varchar(32) NOT NULL COMMENT '传输类型',
    `transport_config` varchar(1024) DEFAULT NULL COMMENT '传输配置',
    `request_timeout`  int           DEFAULT '180' COMMENT '请求超时时间(分钟)',
    `status`           tinyint(1)    DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time`      datetime      DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`      datetime      DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_mcp_id` (`mcp_id`)
) COMMENT ='MCP信息表';

# ------------------------------------------------------------
DROP TABLE IF EXISTS ai_unified_config;

CREATE TABLE ai_unified_config
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `source_type` varchar(32) NOT NULL COMMENT '源类型',
    `source_id`   varchar(64) NOT NULL COMMENT '源id',
    `target_type` varchar(32) NOT NULL COMMENT '目标类型',
    `target_id`   varchar(64) NOT NULL COMMENT '目标id',
    `param`       json       DEFAULT NULL COMMENT '参数配置',
    `status`      tinyint(1) DEFAULT '1' COMMENT '状态:0-禁用,1-启用',
    `create_time` datetime   DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_source_id` (`source_id`),
    KEY `idx_target_id` (`target_id`)
) COMMENT ='统一配置表';
