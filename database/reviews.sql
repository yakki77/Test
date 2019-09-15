/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : amazon_products

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-09-13 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `reviews`
-- ----------------------------

CREATE TABLE `reviews` (
    `autoid` int(11) NOT NULL AUTO_INCREMENT,
    `itemid` varchar(255) DEFAULT NULL,
    `date` date DEFAULT NULL,
    `dateSeen` varchar(2083) DEFAULT NULL,
    `didPurchase` varchar(255) DEFAULT NULL,
    `doRecommend` varchar(255) DEFAULT NULL,
    `reviewid` bigint(30) DEFAULT NULL,
    `numHelpful` int(11) DEFAULT NULL,
    `rating` int(11) DEFAULT NULL,
    `sourceURLs` text,
    `text` text,
    `title` varchar(255) DEFAULT NULL,
    `username` varchar(255) DEFAULT NULL,
    `sourceURLs` text,
    PRIMARY KEY (`reviewid`),
    FOREIGN KEY (`itemid`) REFERENCES `items`(`itemid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8