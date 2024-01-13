create database hobby_blog_dev;
use hobby_blog_dev;

DROP TABLE IF EXISTS `TB_USER_INFO`;
CREATE TABLE `TB_USER_INFO`  (
     `ID` varchar(36) NOT NULL COMMENT 'id',
     `USER_CODE` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户编码',
     `USER_NAME` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名称',
     `GENDER` tinyint(1) NOT NULL COMMENT '性别 1:男 0:女',
     `PASSWORD` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
     `SALT` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '加密盐',
     `EMAIL` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
     `TELEPHONE` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号码',
     `INITIAL_PWD` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '初始密码',
     `USE_INITIAL_PWD` tinyint(1) DEFAULT 1 COMMENT '初始密码状态 1:启用 0:禁用',
     `PWD_STATUS` tinyint(1) DEFAULT 1 COMMENT '密码状态 为0时锁住用户',
     `PWD_LOCK_DATE` DATETIME DEFAULT NULL COMMENT '密码锁定时间',
     `LOGIN_TIME` DATETIME DEFAULT NULL COMMENT '用户头像',
     `IMAGE_URL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像链接',
     `CREATE_TIME` DATETIME DEFAULT NULL COMMENT '创建时间',
     `MODIFY_TIME` DATETIME DEFAULT NULL COMMENT '修改时间',
     `ENABLE` tinyint(1) DEFAULT 1 COMMENT '用户状态',
     `IS_DELETE` tinyint(1) DEFAULT 0 COMMENT '是否删除',
     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;
