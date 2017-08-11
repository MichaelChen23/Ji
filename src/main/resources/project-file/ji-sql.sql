DROP TABLE IF EXISTS `ji_sys_user`;
CREATE TABLE `ji_sys_user` (
  `id` varchar(38) NOT NULL,
  `username` varchar(28) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(8) DEFAULT NULL,
  `phone` varchar(18) DEFAULT NULL,
  `email` varchar(38) DEFAULT NULL,
  `role_id` varchar(38) DEFAULT NULL,
  `status` varchar(8) DEFAULT 'y',
  `last_login_time` datetime DEFAULT NULL,
  `create_account` varchar(28) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_account` varchar(28) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;