--用户表 add by MC 2017-10-29
DROP TABLE IF EXISTS `ji_user`;
CREATE TABLE `ji_user` (
  `id` varchar(38) NOT NULL,
  `nick_name` varchar(38) NOT NULL,
  `gender` int(2) NOT NULL,
  `country` varchar(28) NOT NULL,
  `province` varchar(28) DEFAULT NULL,
  `city` varchar(28) DEFAULT NULL,
  `language` varchar(18) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `remark` varchar(168) DEFAULT NULL,
  `status` varchar(8) DEFAULT 'y' COMMENT 'y-启用；n-禁用，默认为y',
  `last_login_time` datetime DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--系统用户表
DROP TABLE IF EXISTS `ji_sys_user`;
CREATE TABLE `ji_sys_user` (
  `id` varchar(38) NOT NULL,
  `username` varchar(28) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(8) DEFAULT NULL,
  `phone` varchar(18) DEFAULT NULL,
  `email` varchar(38) DEFAULT NULL,
  `role_id` varchar(38) DEFAULT NULL,
  `status` varchar(8) DEFAULT 'y' COMMENT 'y-启用；n-禁用，默认为y',
  `last_login_time` datetime DEFAULT NULL,
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--角色表
DROP TABLE IF EXISTS `ji_role`;
CREATE TABLE `ji_role` (
  `id` varchar(38) NOT NULL,
  `name` varchar(18) NOT NULL,
  `description` varchar(68) DEFAULT NULL,
  `status` varchar(8) DEFAULT 'y',
  `remark` varchar(168) DEFAULT NULL,
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--文件夹表
DROP TABLE IF EXISTS `ji_folder`;
CREATE TABLE `ji_folder` (
  `id` varchar(38) NOT NULL COMMENT '文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹',
  `name` varchar(28) NOT NULL,
  `pid` varchar(38) DEFAULT NULL COMMENT '父文件夹id',
  `path` varchar(38) DEFAULT '/' COMMENT '文件夹全路径/隔开文件夹名name',
  `level` int(8) DEFAULT 1 COMMENT '文件夹层级，首层层级为1，依次递增',
  `status` varchar(8) DEFAULT 'y',
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--文档表
DROP TABLE IF EXISTS `ji_file`;
CREATE TABLE `ji_file` (
  `id` varchar(38) NOT NULL,
  `title` varchar(38) NOT NULL,
  `content` text DEFAULT NULL,
  `folder_id` varchar(38) DEFAULT NULL COMMENT '默认为我的文件夹id',
  `status` varchar(8) DEFAULT 'y',
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--账目表
DROP TABLE IF EXISTS `ji_account`;
CREATE TABLE `ji_account` (
  `id` varchar(38) NOT NULL,
  `title` varchar(68) NOT NULL,
  `action` varchar(18) NOT NULL COMMENT 'earn-收入, pay-支出',
  `amount` decimal(10,2) NOT NULL,
  `account_type_id` varchar(38) NOT NULL,
  `status` varchar(8) DEFAULT 'y',
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--账目类型表
DROP TABLE IF EXISTS `ji_account_type`;
CREATE TABLE `ji_account_type` (
  `id` varchar(38) NOT NULL,
  `name` varchar(18) NOT NULL,
  `status` varchar(8) DEFAULT 'y',
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--广告表 add by MC 2017-10-29
DROP TABLE IF EXISTS `ji_advert`;
CREATE TABLE `ji_advert` (
  `id` varchar(38) NOT NULL,
  `title` varchar(68) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `status` varchar(8) DEFAULT 'y' COMMENT '广告状态：y-启用；n-禁用，默认为y',
  `start_time` datetime DEFAULT NULL COMMENT '广告上架时间',
  `end_time` datetime DEFAULT NULL COMMENT '广告下架时间',
  `sort` int(8) DEFAULT 0 COMMENT '排列顺序：数值越大越排前面，默认为0',
  `type` varchar(68) DEFAULT 'home' COMMENT '广告类别：home-首页，默认为home',
  `remark` varchar(168) DEFAULT NULL,
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;