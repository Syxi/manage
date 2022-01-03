/*
 Navicat Premium Data Transfer

 Source Server         : su
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : manage

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 03/01/2022 21:19:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `rid` int(11) NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL COMMENT '0为待审核，1为通过',
  `create_time` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'superAdmin', '123456', '18593913211', '39485920@qq.com', 1, 1, '20220103');
INSERT INTO `admin` VALUES (2, 'admin', '123', '12345678912', '123456@163.com', 2, 1, '2022-01-03');
INSERT INTO `admin` VALUES (3, '王少少', '123', '12345678913', '123456234@163.com', 4, 1, '2022-01-03');
INSERT INTO `admin` VALUES (4, '田大大', '123', '12345678914', '123453226@163.com', 4, 1, '2022-01-03');
INSERT INTO `admin` VALUES (5, '陈小小', '123', '12345678915', '123459876@163.com', 4, 1, '2022-01-03');
INSERT INTO `admin` VALUES (6, '陈人', '123', '12334567916', '12ddss3456@163.com', 4, 1, '2022-01-03');
INSERT INTO `admin` VALUES (7, '陈生', '123', '12345678917', '122323456@163.com', 4, 1, '2022-01-03');

-- ----------------------------
-- Table structure for icon
-- ----------------------------
DROP TABLE IF EXISTS `icon`;
CREATE TABLE `icon`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of icon
-- ----------------------------
INSERT INTO `icon` VALUES (1, 'fa-home');
INSERT INTO `icon` VALUES (2, 'fa-book');
INSERT INTO `icon` VALUES (3, 'fa-pencil');

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uri` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志的uri路径',
  `log_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生成日志的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名字',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '超级管理员');
INSERT INTO `role` VALUES (2, '管理员');
INSERT INTO `role` VALUES (4, '普通用户');

-- ----------------------------
-- Table structure for role_treemenu
-- ----------------------------
DROP TABLE IF EXISTS `role_treemenu`;
CREATE TABLE `role_treemenu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rid` int(11) NULL DEFAULT NULL,
  `tid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_treemenu
-- ----------------------------
INSERT INTO `role_treemenu` VALUES (19, 1, 1);
INSERT INTO `role_treemenu` VALUES (20, 1, 2);
INSERT INTO `role_treemenu` VALUES (21, 1, 3);
INSERT INTO `role_treemenu` VALUES (22, 1, 4);
INSERT INTO `role_treemenu` VALUES (23, 1, 6);
INSERT INTO `role_treemenu` VALUES (24, 1, 7);
INSERT INTO `role_treemenu` VALUES (25, 1, 9);
INSERT INTO `role_treemenu` VALUES (26, 1, 11);
INSERT INTO `role_treemenu` VALUES (49, 2, 1);
INSERT INTO `role_treemenu` VALUES (50, 2, 6);
INSERT INTO `role_treemenu` VALUES (51, 2, 2);
INSERT INTO `role_treemenu` VALUES (52, 2, 3);
INSERT INTO `role_treemenu` VALUES (53, 2, 9);
INSERT INTO `role_treemenu` VALUES (54, 2, 7);
INSERT INTO `role_treemenu` VALUES (55, 2, 11);
INSERT INTO `role_treemenu` VALUES (56, 4, 1);
INSERT INTO `role_treemenu` VALUES (57, 4, 6);
INSERT INTO `role_treemenu` VALUES (58, 4, 2);
INSERT INTO `role_treemenu` VALUES (59, 4, 3);

-- ----------------------------
-- Table structure for treemenu
-- ----------------------------
DROP TABLE IF EXISTS `treemenu`;
CREATE TABLE `treemenu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NULL DEFAULT NULL,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of treemenu
-- ----------------------------
INSERT INTO `treemenu` VALUES (1, -1, '控制面板', 'fa-home', NULL);
INSERT INTO `treemenu` VALUES (2, -1, '用户管理', 'fa-book', NULL);
INSERT INTO `treemenu` VALUES (3, 2, '用户列表', NULL, '/manager/admin');
INSERT INTO `treemenu` VALUES (4, 2, '角色列表', NULL, '/manager/role');
INSERT INTO `treemenu` VALUES (6, 1, '后台主页', NULL, '/manager/index');
INSERT INTO `treemenu` VALUES (7, -1, '系统日志', 'fa-pencil', NULL);
INSERT INTO `treemenu` VALUES (9, 2, '权限列表', NULL, '/manager/permission');
INSERT INTO `treemenu` VALUES (11, 7, '日志列表', NULL, '/manager/log');

SET FOREIGN_KEY_CHECKS = 1;
