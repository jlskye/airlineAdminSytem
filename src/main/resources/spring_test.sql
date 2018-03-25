/*
Navicat MySQL Data Transfer

Source Server         : host
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : spring_test

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-03-25 08:50:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info` (
  `admin_acount` varchar(255) NOT NULL,
  `admin_pwd` varchar(255) DEFAULT NULL,
  `admin_perm` varchar(255) DEFAULT NULL,
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES ('admin', 'admin', '1', '1');
INSERT INTO `admin_info` VALUES ('admin2', 'admin', '2', '2');

-- ----------------------------
-- Table structure for air_info
-- ----------------------------
DROP TABLE IF EXISTS `air_info`;
CREATE TABLE `air_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classifications` varchar(20) NOT NULL,
  `cabin` varchar(20) NOT NULL,
  `assembly` varchar(40) NOT NULL,
  `description` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of air_info
-- ----------------------------
INSERT INTO `air_info` VALUES ('1', 'B-747', '9L2AKE', '短边出板装，高40CM出45（78）CM，总高160CM', 'NW026,LH729');
INSERT INTO `air_info` VALUES ('2', 'B-777', '8LD8LD3', '短边出板装，高40CM出40CM，总高160CM', 'NH920、NH922,MH389,MH387、AF117、BA168');
INSERT INTO `air_info` VALUES ('3', 'B-767', '4LD7DQP', '长边出板装，高35CM出40CM，总高160CM', 'NH960、940、154、156,AC038、OS、UX、AZ797、HY');

-- ----------------------------
-- Table structure for carrier_info
-- ----------------------------
DROP TABLE IF EXISTS `carrier_info`;
CREATE TABLE `carrier_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picpath` varchar(225) NOT NULL,
  `carrier_name` varchar(20) NOT NULL,
  `carrier_id` varchar(40) NOT NULL,
  `landline` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carrier_info
-- ----------------------------
INSERT INTO `carrier_info` VALUES ('1', '8L.png', '云南祥鹏航空公司', '8L', '95071950');
INSERT INTO `carrier_info` VALUES ('2', '3U.png', '四川航空公司', '3U', '4008300999');
INSERT INTO `carrier_info` VALUES ('3', 'BK.png', '奥凯航空有限公司', 'BK', '400-886-5889');
INSERT INTO `carrier_info` VALUES ('4', 'CA.png', '中国国际航空公司', 'CA', '95583');
INSERT INTO `carrier_info` VALUES ('5', 'CN.png', '大新华航空有限公司', 'CN', '950718');
INSERT INTO `carrier_info` VALUES ('6', 'CZ.png', '中国南方航空公司', 'CZ', '95539');
INSERT INTO `carrier_info` VALUES ('7', 'DR.png', '瑞丽航空有限公司', 'DR', '95526');
INSERT INTO `carrier_info` VALUES ('8', 'DZ.png', '东海航空', 'DZ', '4000888666');
INSERT INTO `carrier_info` VALUES ('9', 'EU.png', '成都航空有限公司', 'EU', '95527');
INSERT INTO `carrier_info` VALUES ('10', 'FM.png', '上海航空公司', 'FM', '0086-10-95530');
INSERT INTO `carrier_info` VALUES ('11', 'FU.png', '福州航空公司', 'FU', '95528');
INSERT INTO `carrier_info` VALUES ('12', 'G5.png', '华夏航空有限公司', 'G5', '');
INSERT INTO `carrier_info` VALUES ('13', 'GJ.png', '浙江长龙航空', 'GJ', '0571-89999999');
INSERT INTO `carrier_info` VALUES ('14', 'GS.png', '天津航空公司', 'GS', '95529');
INSERT INTO `carrier_info` VALUES ('15', 'GY.png', '多彩贵州航空公司', 'GY', '95531');
INSERT INTO `carrier_info` VALUES ('16', 'HO.png', '上海吉祥航空公司', 'HO', '95520');
INSERT INTO `carrier_info` VALUES ('17', 'HU.png', '海南航空公司', 'HU', '010-95339');
INSERT INTO `carrier_info` VALUES ('18', 'JD.png', '北京首都航空公司', 'JD', '95071999');
INSERT INTO `carrier_info` VALUES ('19', 'JR.png', '幸福航空公司', 'JR', '95532');
INSERT INTO `carrier_info` VALUES ('20', 'KN.png', '中国联合航空公司', 'KN', '95533');
INSERT INTO `carrier_info` VALUES ('21', 'KY.png', '昆明航空有限公司', 'KY', '0871-67086688-6696');
INSERT INTO `carrier_info` VALUES ('22', 'MF.png', '厦门航空公司', 'MF', '95557');
INSERT INTO `carrier_info` VALUES ('23', 'MU.png', '中国东方航空公司', 'MU', '95530');
INSERT INTO `carrier_info` VALUES ('24', 'RY.png', '江西航空有限公司', 'RY', '0311-89193304');
INSERT INTO `carrier_info` VALUES ('25', 'PN.png', '西部航空公司', 'PN', '95534');
INSERT INTO `carrier_info` VALUES ('26', 'QW.png', '青岛航空公司', 'QW', '0532-85851169');
INSERT INTO `carrier_info` VALUES ('27', 'NS.png', '河北航空有限公司', 'NS', '95535');
INSERT INTO `carrier_info` VALUES ('28', 'SC.png', '山东航空公司', 'SC', '400-60-96777');
INSERT INTO `carrier_info` VALUES ('29', 'TV.png', '西藏航空有限公司', 'TV', '4008-0891-88');
INSERT INTO `carrier_info` VALUES ('30', 'UQ.png', '乌鲁木齐航空公司', 'UQ', '95536');
INSERT INTO `carrier_info` VALUES ('31', 'Y8.png', '扬子江航空公司 ', 'Y8', '95573');
INSERT INTO `carrier_info` VALUES ('35', 'NS.png', '大股东股份的', 'NS1', '435532');

-- ----------------------------
-- Table structure for flight_info
-- ----------------------------
DROP TABLE IF EXISTS `flight_info`;
CREATE TABLE `flight_info` (
  `flight_id` int(11) NOT NULL AUTO_INCREMENT,
  `flight_no` varchar(255) DEFAULT NULL,
  `dep_time` varchar(255) DEFAULT NULL,
  `arr_time` varchar(255) DEFAULT NULL,
  `dep_airport` varchar(255) DEFAULT NULL,
  `dep_city` varchar(255) DEFAULT NULL,
  `arr_airport` varchar(255) DEFAULT NULL,
  `arr_city` varchar(255) DEFAULT NULL,
  `carrier_id` varchar(255) DEFAULT NULL,
  `air_name` varchar(255) DEFAULT NULL,
  `seat_account` int(11) DEFAULT NULL,
  PRIMARY KEY (`flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flight_info
-- ----------------------------
INSERT INTO `flight_info` VALUES ('1', '1179', '10:50', '13:55', '温州龙湾', '温州', '成都双流', '成都', '3U', '中型客机', null);
INSERT INTO `flight_info` VALUES ('2', '1378', '16:00', '18:30', '珠海金湾', '珠海', '成都双流', '成都', 'JR', '中型客机', null);
INSERT INTO `flight_info` VALUES ('3', '2347 ', '13:30', '16:00', '珠海金湾', '珠海', '成都双流', '成都', 'JD', '大型客机', null);
INSERT INTO `flight_info` VALUES ('4', '3234', '16:30', '19:20', '济南遥墙', '济南', '成都双流', '成都', 'NS', '大型客机', null);
INSERT INTO `flight_info` VALUES ('5', '3238', '19:30', '22:20', '济南遥墙', '济南', '成都双流', '成都', 'KY', '小型客机', null);
INSERT INTO `flight_info` VALUES ('6', '1137', '04:30', '06:45', '成都双流', '成都', '北京机场', '北京', '3U', '中型客机', null);
INSERT INTO `flight_info` VALUES ('7', '1345', '04:30', '06:45', '成都双流', '成都', '北京机场', '北京', '8L', '大型客机', null);
INSERT INTO `flight_info` VALUES ('8', '1456', '06:30', '08:50', '上海浦东', '上海', '北京机场', '北京', '3U', '中型客机', null);
INSERT INTO `flight_info` VALUES ('9', '1567', '09:30', '12:30', '北京机场', '北京', '上海浦东', '上海', '3U', '中型客机', null);
INSERT INTO `flight_info` VALUES ('10', '8399', '09:30', '11:30', '上海虹桥', '上海', '北京机场', '北京', '3U', '中型客机', null);
INSERT INTO `flight_info` VALUES ('11', '8917', '06:30', '08:55', '上海虹桥', '上海', '宝安国际', '深圳', 'BK', '小型客机', null);
INSERT INTO `flight_info` VALUES ('12', '1893', '07:25', '10:00', '浦东国际', '上海', '宝安国际', '深圳', 'CA', '小型客机', null);
INSERT INTO `flight_info` VALUES ('13', '1111', '07:35', '10:05', '虹桥国际', '上海', '宝安国际', '深圳', 'CN', '小型客机', null);
INSERT INTO `flight_info` VALUES ('14', '8956', '06:40', '08:50', '宝安国际', '深圳', '上海虹桥', '上海', 'CZ', '小型客机', null);
INSERT INTO `flight_info` VALUES ('15', '5332', '07:15', '09:35', '宝安国际', '深圳', '上海虹桥', '上海', 'DR', '小型客机', null);
INSERT INTO `flight_info` VALUES ('16', '9440', '07:50', '10:10', '宝安国际', '深圳', '上海虹桥', '上海', 'DZ', '小型客机', null);
INSERT INTO `flight_info` VALUES ('17', '1152', '07:55', '10:15', '宝安国际', '深圳', '上海虹桥', '上海', 'EU', '小型客机', null);
INSERT INTO `flight_info` VALUES ('18', '7541', '07:20', '09:00', '萧山国际', '杭州', '黄花国际', '长沙', 'FM', '小型客机', null);
INSERT INTO `flight_info` VALUES ('19', '8026', '21:15', '22:50', '萧山国际', '杭州', '黄花国际', '长沙', 'FU', '中型客机', null);
INSERT INTO `flight_info` VALUES ('20', '5006', '21:15', '22:50', '萧山国际', '杭州', '黄花国际', '长沙', 'G5', '中型客机', null);
INSERT INTO `flight_info` VALUES ('21', '8664', '15:25', '17:00', '黄花国际', '长沙', '萧山国际', '长沙', 'GJ', '中型客机', null);
INSERT INTO `flight_info` VALUES ('22', '8025', '08:15', '	\r\n09:50', '黄花国际', '长沙', '萧山国际', '长沙', 'GS', '中型客机', null);
INSERT INTO `flight_info` VALUES ('23', '1117', '15:10', '	\r\n16:40', '黄花国际', '长沙', '萧山国际', '长沙', 'GY', '中型客机', null);
INSERT INTO `flight_info` VALUES ('24', '9796', '00:10', '01:25', '禄口国际', '南京', '流亭国际', '青岛', 'HO', '中型客机', null);
INSERT INTO `flight_info` VALUES ('25', '5297', '08:25', '09:40', '禄口国际', '南京', '流亭国际', '青岛', 'HU', '中型客机', null);
INSERT INTO `flight_info` VALUES ('26', '2835', '14:35', '	\r\n16:00', '禄口国际', '南京', '流亭国际', '青岛', 'JD', '中型客机', null);
INSERT INTO `flight_info` VALUES ('27', '4696', '17:35', '	\r\n	\r\n19:00', '禄口国际', '南京', '流亭国际', '青岛', 'JR', '中型客机', null);
INSERT INTO `flight_info` VALUES ('28', '9795', '06:45', '	\r\n	\r\n	\r\n08:10', '流亭国际', '青岛', '禄口国际', '南京', 'KN', '中型客机', null);
INSERT INTO `flight_info` VALUES ('29', '5298', '10:45', '	\r\n	\r\n	\r\n	\r\n12:10', '流亭国际', '青岛', '禄口国际', '南京', 'KY', '大型客机', null);
INSERT INTO `flight_info` VALUES ('30', '4943', '12:55', '	\r\n	\r\n	\r\n	\r\n	\r\n14:10', '流亭国际', '青岛', '禄口国际', '南京', 'MF', '大型客机', null);
INSERT INTO `flight_info` VALUES ('31', '2836', '17:00', '	\r\n	\r\n	\r\n	\r\n	\r\n	\r\n18:20', '流亭国际', '青岛', '禄口国际', '南京', 'MU', '大型客机', null);
INSERT INTO `flight_info` VALUES ('32', '7669', '07:20', '	\r\n09:35', '咸阳国际', '西安', '周水子国际', '大连', 'NS', '大型客机', null);
INSERT INTO `flight_info` VALUES ('33', '5319', '13:20', '	\r\n15:35', '咸阳国际', '西安', '周水子国际', '大连', 'PN', '大型客机', null);
INSERT INTO `flight_info` VALUES ('34', '9067', '16:20', '	\r\n18:35', '咸阳国际', '西安', '周水子国际', '大连', 'QW', '大型客机', null);
INSERT INTO `flight_info` VALUES ('35', '8310', '09:45', '	\r\n12:15', '周水子国际', '大连', '咸阳国际', '西安', 'RY', '大型客机', null);
INSERT INTO `flight_info` VALUES ('36', '7670', '10:50', '	\r\n	\r\n13:25', '周水子国际', '大连', '咸阳国际', '西安', 'SC', '小型客机', null);
INSERT INTO `flight_info` VALUES ('37', '4621', '15:25', '17:55', '周水子国际', '大连', '咸阳国际', '西安', 'TV', '小型客机', null);
INSERT INTO `flight_info` VALUES ('38', '6510', '09:25', '13:05', '凤凰国际', '三亚', '滨海国际', '天津', 'UQ', '小型客机', null);
INSERT INTO `flight_info` VALUES ('39', '7872', '13:20', '	\r\n17:05', '凤凰国际', '三亚', '滨海国际', '天津', 'Y8', '小型客机', null);
INSERT INTO `flight_info` VALUES ('40', '5195', '17:10', '	\r\n20:55', '凤凰国际', '三亚', '滨海国际', '天津', 'ZH', '小型客机', null);

-- ----------------------------
-- Table structure for flight_uniinfo
-- ----------------------------
DROP TABLE IF EXISTS `flight_uniinfo`;
CREATE TABLE `flight_uniinfo` (
  `flight_id` int(11) NOT NULL AUTO_INCREMENT,
  `flight_no` varchar(255) DEFAULT NULL,
  `dep_date` varchar(225) DEFAULT NULL,
  `arr_date` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=364 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flight_uniinfo
-- ----------------------------
INSERT INTO `flight_uniinfo` VALUES ('1', 'helloworld', '2018-03-16 ', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('2', null, '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('3', null, '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('4', null, '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('5', null, '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('6', 'fuckyou', '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('7', 'fuckyouyou', '2018-03-16', '2018-03-16');
INSERT INTO `flight_uniinfo` VALUES ('8', null, '2018-03-18', '2018-03-18');
INSERT INTO `flight_uniinfo` VALUES ('9', null, '2018-03-20', '2018-03-20');
INSERT INTO `flight_uniinfo` VALUES ('10', null, '2018-03-24', '2018-03-24');
INSERT INTO `flight_uniinfo` VALUES ('11', '21', '2018-03-25', '2018-03-25');
INSERT INTO `flight_uniinfo` VALUES ('12', null, '2018-03-25', '2018-03-25');
INSERT INTO `flight_uniinfo` VALUES ('13', null, '2018-03-25', '2018-03-25');
INSERT INTO `flight_uniinfo` VALUES ('14', null, '2018-03-26', '2018-03-26');
INSERT INTO `flight_uniinfo` VALUES ('15', null, '2018-03-26', '2018-03-26');
INSERT INTO `flight_uniinfo` VALUES ('16', null, '2018-03-27', '2018-03-27');
INSERT INTO `flight_uniinfo` VALUES ('17', null, '2018-03-27', '2018-03-27');
INSERT INTO `flight_uniinfo` VALUES ('18', '3543', '2018-03-28', '2018-03-28');
INSERT INTO `flight_uniinfo` VALUES ('19', null, '2018-03-28', '2018-03-28');
INSERT INTO `flight_uniinfo` VALUES ('20', null, '2018-03-28', '2018-03-28');
INSERT INTO `flight_uniinfo` VALUES ('21', null, '2018-03-29', '2018-03-29');
INSERT INTO `flight_uniinfo` VALUES ('22', null, '2018-03-29', '2018-03-29');
INSERT INTO `flight_uniinfo` VALUES ('23', null, '2018-03-29', '2018-03-29');
INSERT INTO `flight_uniinfo` VALUES ('24', null, '2018-03-30', '2018-03-30');
INSERT INTO `flight_uniinfo` VALUES ('25', null, '2018-03-30', '2018-03-30');
INSERT INTO `flight_uniinfo` VALUES ('26', null, '2018-03-30', '2018-03-30');
INSERT INTO `flight_uniinfo` VALUES ('27', null, '2018-03-31', '2018-03-31');
INSERT INTO `flight_uniinfo` VALUES ('28', null, '2018-03-31', '2018-03-31');
INSERT INTO `flight_uniinfo` VALUES ('29', null, '2018-03-31', '2018-03-31');
INSERT INTO `flight_uniinfo` VALUES ('30', null, '2018-04-01', '2018-04-01');
INSERT INTO `flight_uniinfo` VALUES ('31', null, '2018-04-01', '2018-04-01');
INSERT INTO `flight_uniinfo` VALUES ('32', null, '2018-04-01', '2018-04-01');
INSERT INTO `flight_uniinfo` VALUES ('33', null, '2018-04-02', '2018-04-02');
INSERT INTO `flight_uniinfo` VALUES ('34', null, '2018-04-03', '2018-04-03');
INSERT INTO `flight_uniinfo` VALUES ('35', null, '2018-04-04', '2018-04-04');
INSERT INTO `flight_uniinfo` VALUES ('36', null, '2018-04-04', '2018-04-04');
INSERT INTO `flight_uniinfo` VALUES ('37', null, '2018-04-04', '2018-04-04');
INSERT INTO `flight_uniinfo` VALUES ('38', null, '2018-04-04', '2018-04-04');
INSERT INTO `flight_uniinfo` VALUES ('39', null, '2018-04-05', '2018-04-05');
INSERT INTO `flight_uniinfo` VALUES ('40', null, '2018-04-05', '2018-04-05');

-- ----------------------------
-- Table structure for mainorder_info
-- ----------------------------
DROP TABLE IF EXISTS `mainorder_info`;
CREATE TABLE `mainorder_info` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_type` int(11) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mainorder_info
-- ----------------------------
INSERT INTO `mainorder_info` VALUES ('14', '1', '15528088735');
INSERT INTO `mainorder_info` VALUES ('15', '2', '15528088735');
INSERT INTO `mainorder_info` VALUES ('16', '1', '15528088735');
INSERT INTO `mainorder_info` VALUES ('17', '1', '15528088735');

-- ----------------------------
-- Table structure for psg_info
-- ----------------------------
DROP TABLE IF EXISTS `psg_info`;
CREATE TABLE `psg_info` (
  `order_id` int(11) NOT NULL,
  `psg_id` varchar(255) DEFAULT NULL,
  `psg_name` varchar(255) DEFAULT NULL,
  `psg_phone` varchar(255) DEFAULT NULL,
  `psg_type` int(11) DEFAULT NULL,
  `go_seat_type` int(11) DEFAULT NULL,
  `go_seat_price` int(11) DEFAULT NULL,
  `back_seat_type` int(11) DEFAULT NULL,
  `back_seat_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psg_info
-- ----------------------------
INSERT INTO `psg_info` VALUES ('14', '330327199702130250', '杨敏', '15528088735', '1', '1', '1500', null, null);
INSERT INTO `psg_info` VALUES ('15', '330327199702130250', '杨敏', '15528088735', '1', '1', '1500', '1', '1500');
INSERT INTO `psg_info` VALUES ('16', '330327199702130250', '杨敏', '15528088735', '1', '1', '1500', null, null);
INSERT INTO `psg_info` VALUES ('17', '330327199702130250', '杨敏', '15528088735', '1', '1', '1500', null, null);

-- ----------------------------
-- Table structure for retnorder_info
-- ----------------------------
DROP TABLE IF EXISTS `retnorder_info`;
CREATE TABLE `retnorder_info` (
  `order_id` int(11) NOT NULL,
  `order_code` int(11) NOT NULL,
  `flight_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`,`order_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of retnorder_info
-- ----------------------------
INSERT INTO `retnorder_info` VALUES ('15', '1', '11');
INSERT INTO `retnorder_info` VALUES ('15', '2', '14');

-- ----------------------------
-- Table structure for seat_info
-- ----------------------------
DROP TABLE IF EXISTS `seat_info`;
CREATE TABLE `seat_info` (
  `flight_id` int(11) NOT NULL,
  `seat_type` int(11) NOT NULL,
  `seat_price` int(10) DEFAULT NULL,
  `seat_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`flight_id`,`seat_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seat_info
-- ----------------------------
INSERT INTO `seat_info` VALUES ('1', '1', '200', '200');
INSERT INTO `seat_info` VALUES ('1', '2', '200', '200');
INSERT INTO `seat_info` VALUES ('1', '3', '300', '300');
INSERT INTO `seat_info` VALUES ('1', '4', '400', '400');
INSERT INTO `seat_info` VALUES ('2', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('2', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('2', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('2', '4', '480', '200');
INSERT INTO `seat_info` VALUES ('3', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('3', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('3', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('3', '4', '480', '200');
INSERT INTO `seat_info` VALUES ('4', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('4', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('4', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('4', '4', '480', '200');
INSERT INTO `seat_info` VALUES ('5', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('5', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('5', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('5', '4', '480', '200');
INSERT INTO `seat_info` VALUES ('6', '1', '300', '200');
INSERT INTO `seat_info` VALUES ('6', '2', '200', '400');
INSERT INTO `seat_info` VALUES ('6', '3', '200', '400');
INSERT INTO `seat_info` VALUES ('6', '4', '100', '50');
INSERT INTO `seat_info` VALUES ('7', '1', '5000', '100');
INSERT INTO `seat_info` VALUES ('7', '2', '4000', '200');
INSERT INTO `seat_info` VALUES ('7', '3', '3000', '400');
INSERT INTO `seat_info` VALUES ('7', '4', '2000', '50');
INSERT INTO `seat_info` VALUES ('8', '1', '100', '100');
INSERT INTO `seat_info` VALUES ('8', '2', '100', '100');
INSERT INTO `seat_info` VALUES ('8', '3', '100', '100');
INSERT INTO `seat_info` VALUES ('8', '4', '100', '100');
INSERT INTO `seat_info` VALUES ('9', '1', '100', '200');
INSERT INTO `seat_info` VALUES ('9', '2', '200', '300');
INSERT INTO `seat_info` VALUES ('9', '3', '300', '300');
INSERT INTO `seat_info` VALUES ('9', '4', '400', '400');
INSERT INTO `seat_info` VALUES ('10', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('10', '2', '1200', '400');
INSERT INTO `seat_info` VALUES ('10', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('10', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('11', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('11', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('11', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('11', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('12', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('12', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('12', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('12', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('13', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('13', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('13', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('13', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('14', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('14', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('14', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('14', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('15', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('15', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('15', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('15', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('16', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('16', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('16', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('16', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('17', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('17', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('17', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('17', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('18', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('18', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('18', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('18', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('19', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('19', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('19', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('19', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('20', '1', '1500', '200');
INSERT INTO `seat_info` VALUES ('20', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('20', '3', '520', '200');
INSERT INTO `seat_info` VALUES ('20', '4', '680', '200');
INSERT INTO `seat_info` VALUES ('21', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('21', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('21', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('21', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('22', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('22', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('22', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('22', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('23', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('23', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('23', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('23', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('24', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('24', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('24', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('24', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('25', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('25', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('25', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('25', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('26', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('26', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('26', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('26', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('27', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('27', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('27', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('27', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('28', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('28', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('28', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('28', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('29', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('29', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('29', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('29', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('30', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('30', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('30', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('30', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('31', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('31', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('31', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('31', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('32', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('32', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('32', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('32', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('33', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('33', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('33', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('33', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('34', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('34', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('34', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('34', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('35', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('35', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('35', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('35', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('36', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('36', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('36', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('36', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('37', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('37', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('37', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('37', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('38', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('38', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('38', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('38', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('39', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('39', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('39', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('39', '4', '620', '200');
INSERT INTO `seat_info` VALUES ('40', '1', '1560', '200');
INSERT INTO `seat_info` VALUES ('40', '2', '1200', '200');
INSERT INTO `seat_info` VALUES ('40', '3', '545', '200');
INSERT INTO `seat_info` VALUES ('40', '4', '620', '200');

-- ----------------------------
-- Table structure for sgorder_info
-- ----------------------------
DROP TABLE IF EXISTS `sgorder_info`;
CREATE TABLE `sgorder_info` (
  `order_id` int(11) NOT NULL,
  `flight_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sgorder_info
-- ----------------------------
INSERT INTO `sgorder_info` VALUES ('14', '10');
INSERT INTO `sgorder_info` VALUES ('16', '10');
INSERT INTO `sgorder_info` VALUES ('17', '11');

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `acount` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(4) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `age` int(4) DEFAULT NULL,
  `addr` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `user_money` int(8) DEFAULT NULL,
  `user_salt` varchar(255) DEFAULT NULL,
  `user_hash` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'lily', '13258261963', '510921199609274800', '2450134', null, null, null);
INSERT INTO `user_info` VALUES ('2', 'tom', '13482161963', '230921199703231524', '785', null, null, null);
INSERT INTO `user_info` VALUES ('3', '邓小倩', '13482161963', '230921199703231524', '785', null, null, null);
INSERT INTO `user_info` VALUES ('7', '213123', '43214', '3214', '321', null, null, null);
INSERT INTO `user_info` VALUES ('8', 'L', '15528088735', '330327199702130250', '20000', '5528019248223336', '6cafb190f0e7c43790cbf11440b8818262352fa4442109667026953f3f9fd354', '1668718472@qq.com');
INSERT INTO `user_info` VALUES ('9', 'spring', '15528088737', '330327199702130250', '20000', '6421027393257708', '1c122ab816086509fc21ffe68fec565e321d5a870a628d2fc7cfcb6fb48f4ae4', '1668718472@qq.com');
