/*
 Navicat Premium Data Transfer

 Source Server         : WSJ
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : 127.0.0.1:3306
 Source Schema         : chuilunchamber

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 24/02/2021 15:12:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'banner图id',
  `cover` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT ' ' COMMENT '封面',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'url路径',
  `status` bit(1) NOT NULL COMMENT '状态：0下架，1上架',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `update_time` bigint(50) NOT NULL COMMENT '修改时间',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编辑人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES (1, '4564564', 'www.xxx.com', b'0', 0, 0, '梵高');
INSERT INTO `banner` VALUES (2, '456345', 'www.xxx.com', b'0', 0, 0, '孙大圣');
INSERT INTO `banner` VALUES (3, '3940379f54574ba7990781ef78f662d8.jpg', NULL, b'0', 1612455053176, 1612455053176, NULL);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论表id',
  `work_id` bigint(20) NOT NULL COMMENT '作品ID，备注：和作品对应',
  `reply_id` bigint(20) NULL DEFAULT NULL COMMENT '记住留言的id,回复的时候根据这个id进行回复',
  `tourist_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '游客名字,根据IP自动分配',
  `status` bit(1) NOT NULL COMMENT '状态：0普通，1精选',
  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID，备注：和角色绑定',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '修改时间',
  `contents` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '留言+回复类容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, 1, 0, '游客1', b'0', NULL, 1611902141950, 543453453, '这幅画很好看');
INSERT INTO `message` VALUES (2, 1, 1, '管理员1', b'0', 1, 1611925448348, 45325432543245, '谢谢夸奖');
INSERT INTO `message` VALUES (3, 1, 0, '游客2', b'0', NULL, 0, 0, '我能购买吗？');
INSERT INTO `message` VALUES (4, 1, 3, '管理员1', b'0', 1, 0, 0, '暂时不行');
INSERT INTO `message` VALUES (5, 2, 0, '游客1', b'0', 0, 0, 0, '这幅画不好看');
INSERT INTO `message` VALUES (6, 2, 5, '管理员1', b'0', 1, 0, 0, '已拉黑');
INSERT INTO `message` VALUES (7, 12, 6, '艺术家', b'0', 1, 1612614169330, 1612614169330, '这幅画很好看');
INSERT INTO `message` VALUES (8, 12, 6, '艺术家', b'0', 1, 1612621326644, 1612621326644, '这幅画很好看');
INSERT INTO `message` VALUES (9, 12, 6, '艺术家', b'0', 1, 1612621787839, 1612621787839, '这幅画很好看');

-- ----------------------------
-- Table structure for module
-- ----------------------------
DROP TABLE IF EXISTS `module`;
CREATE TABLE `module`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '模块管理ID',
  `module_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '模块名字',
  `parent_node_id` bigint(20) NOT NULL COMMENT '父节点ID',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父节点的url地址',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '更新时间',
  `created_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名字',
  `banner` bit(5) NOT NULL COMMENT '权限：0空；1写入',
  `message` bit(5) NOT NULL COMMENT '权限：0空；1写入',
  `studio` bit(5) NOT NULL COMMENT '权限：0空；1写入',
  `work` bit(5) NOT NULL COMMENT '权限：0空；1写入',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '修改时间',
  `created_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for studio
-- ----------------------------
DROP TABLE IF EXISTS `studio`;
CREATE TABLE `studio`  (
  `id` bigint(50) NOT NULL AUTO_INCREMENT COMMENT '工作室id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简介类型',
  `status` bit(1) NOT NULL COMMENT '状态：0下架，1上架',
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作室图片',
  `about` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '正文',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '更新时间',
  `updated_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编辑人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studio
-- ----------------------------
INSERT INTO `studio` VALUES (1, '艺术家简介', b'0', '75b5682f1e5747c9bd8da8df5d1865d7.jpg,0db4ab2b6d4944f99dd9e9aab84aa159.jpg,0e034070d7164300b2f092c2397bd15c.jpg,ce33b950ed2c4c89a1b1b291eecabac3.jpg,d71f0cf8a76a408b8b0764055ccbf1e1.jpg', '这些都是头像', 1612606445748, 1612606445748, '无名氏');

-- ----------------------------
-- Table structure for title
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '一级标题id',
  `parent_id` bigint(20) NOT NULL COMMENT '父级主键id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作品集名称',
  `level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '层级',
  `status` bit(1) NOT NULL COMMENT '状态：0下架，1上架',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '修改时间',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编辑人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES (1, 0, '架上绘画装置', '0', b'0', 0, 0, '0000');
INSERT INTO `title` VALUES (2, 1, '绘画 ', '0.1', b'0', 0, 0, '0000');
INSERT INTO `title` VALUES (3, 1, '梦雨童乡', '0.1', b'0', 0, 0, '0');
INSERT INTO `title` VALUES (4, 0, '影像摄影', '0', b'0', 0, 0, '0');
INSERT INTO `title` VALUES (5, 4, '春天', '0.4', b'0', 0, 0, '0');
INSERT INTO `title` VALUES (6, 4, '秋天', '0.4', b'0', 0, 0, '0');

-- ----------------------------
-- Table structure for tourist
-- ----------------------------
DROP TABLE IF EXISTS `tourist`;
CREATE TABLE `tourist`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '游客id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '游客名字',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名字',
  `passwrod` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '修改时间',
  `created_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '作品id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作品名称',
  `status` bit(1) NOT NULL COMMENT '状态：0下架，1上架',
  `frist_id` bigint(20) NOT NULL COMMENT '一级标题id，对应于多层级标题的父级ID',
  `second_id` bigint(20) NOT NULL COMMENT '二级标题id,对应于多层级标题的主键ID',
  `introduction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作品简介',
  `thumbnail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '缩略图',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '视频url',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '介绍文章',
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作品详情图片',
  `created_time` bigint(50) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(50) NOT NULL COMMENT '修改时间',
  `updated_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编辑人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES (1, '梵高的老舅', b'0', 1, 2, '123456', '123454', '', 'www.xxx.com', '35464946461646', 0, 0, '0000');
INSERT INTO `work` VALUES (2, '星空', b'0', 1, 2, '12316546', '35415466', 'www.xxx.com', '这是梵高的作品', 'd45826277cc14bf0be7dc82260180846.jpg', 1612603438145, 1612603438145, '无名氏');

SET FOREIGN_KEY_CHECKS = 1;
