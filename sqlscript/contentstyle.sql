


create database if not exists `contentstyle`;
use `contentstyle`;

SET FOREIGN_KEY_CHECKS=0;

drop table IF exists `group_role_rel`;
drop table IF exists `user_group_rel`;
drop table IF exists `usergroup`;
drop table IF exists `userrole`;
drop table IF exists `useraction`;
drop table IF exists `role_ope_rel`;
drop table IF exists `actope_confie`;
drop table IF exists `actmou_opeaut_rel`;
drop table IF exists `actionmoudle`;
drop table IF exists `opeaut`;
drop table IF exists `userlevel`;
drop table IF exists `userinfo`;





-- --------------------------
-- Table structure for `userinfo`
-- --------------------------
create table `userinfo` (
       `userid` int(11) not NULL,
       `username` varchar(38) not NULL,
       `userpwd` varchar(40) not NULL,
       `idcarno` varchar(20) default NULL,
       `truename` varchar(50) default NULL,
       `birthdate` date default NULL,
       `age` int(4) default '1',
       `sex` varchar(20) default NULL,
       `email` varchar(128) default NULL,
       `phone` varchar(35) default NULL,
       `mobile` varchar(35) default NULL,
       `chattool` varchar(100) default NULL,
       `remark` varchar(256) default NULL,
       `degree` varchar(256) default NULL,
       `education` varchar(256) default NULL,
       `experience` mediumtext,
       `createdate` timestamp not NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
       `disable` tinyint(1) default '0',
       `userlid` int(11) not NULL,
PRIMARY KEY (`userid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `userlevel`
-- --------------------------
create table `userlevel` (
       `userlid` int(11) not NULL,
       `levelname` varchar(128) not NULL,
       `explanation` mediumtext,
PRIMARY KEY (`userlid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `opeaut`
-- --------------------------
create table `opeaut` (
       `opeautid` int(11) not NULL,
       `opmethod` varchar(128) not NULL,
       `explanation` longtext default NULL,
       `remark` varchar(256) default NULL,
PRIMARY KEY (`opeautid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `actionmoudle`
-- --------------------------
create table `actionmoudle` (
       `actmouid` int(11) not NULL,
	`moudlename` varchar(128) not NULL,
       `pagepath` varchar(256) default NULL,
       `sysmoudle` tinyint(1) default '0',
       `explanation` longtext,
       `firstpage` varchar(256) default NULL,
       `rankorder` int(11) default '5',
       `oamoudle` tinyint(1) default '0',
       `parentactmou` int(11) default NULL,
PRIMARY KEY (`actmouid`)
) engine=InnoDB default CHARSET=utf8;
--  pk parentactmou

-- --------------------------
-- Table structure for `actmou_opeaut_rel`
-- --------------------------
create table `actmou_opeaut_rel` (
       `aorelid` int(11) not NULL,
       `opeautid` int(11) not NULL,
       `actmouid` int(11) not NULL,
PRIMARY KEY (`aorelid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `actope_confie`
-- --------------------------
create table `actope_confie` (
       `actoperelid` int(11) not NULL,
       `actmouid` int(11) not NULL,
       `opeautid` int(11) not NULL,
       `fieldname` varchar(128) not NULL
) engine=InnoDB default CHARSET=utf8;


-- --------------------------
-- Table structure for `role_ope_rel`
-- --------------------------
create table `role_ope_rel` (
       `rorelid` int(11) not NULL,
       `userrid` int(11) not NULL,
       `opeautid` int(11) not NULL,
PRIMARY KEY (`rorelid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `useraction`
-- --------------------------
create table `useraction` (
       `useraid` int(11) not NULL,
       `actname` varchar(128) not NULL,
PRIMARY KEY (`useraid`)
) engine=InnoDB default CHARSET=utf8;


-- --------------------------
-- Table structure for `userrole`
-- --------------------------
create table `userrole` (
       `userrid` int(11) not NULL,
       `rolename` varchar(128) not NULL,
       `description` varchar(256) default NULL,
       `disable` tinyint(1) default '0',
       `userlid` int(11) not NULL,
PRIMARY KEY (`userrid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `usergroup`
-- --------------------------
create table `usergroup` (
       `usergid` int(11) not NULL,
       `prival` long not NULL,
       `groupname` varchar(128) not NULL,
       `description` varchar(256) default NULL,
       `readable` tinyint(1) default '1',
       `writable` tinyint(1) default '0',
       `executable` tinyint(1) default '0',
PRIMARY KEY (`usergid`)
) engine=InnoDB default CHARSET=utf8;

-- --------------------------
-- Table structure for `user_group_rel`
-- --------------------------
create table `user_group_rel` (
       `ugrelid` int(11) not NULL,
       `userinfoid` int(11) not NULL,
       `usergid` int(11) not NULL,
PRIMARY KEY (`ugrelid`)
) engine=InnoDB default CHARSET=utf8;



-- --------------------------
-- Table structure for `group_role_rel`
-- --------------------------
create table `group_role_rel` (
       `grrelid` int(11) not NULL,
       `usergid` int(11) not NULL,
       `userrid` int(11) not NULL,
PRIMARY KEY (`grrelid`)
) engine=InnoDB default CHARSET=utf8;


