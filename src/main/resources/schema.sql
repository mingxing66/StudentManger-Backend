drop table if exists student;
CREATE TABLE `student` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `sno` varchar(10) NOT NULL COMMENT '学号',
  `name` varchar(20) NOT NULL COMMENT '名字',
  `sex` varchar(2) NOT NULL COMMENT '性别',
  `phone` varchar(11) NOT NULL COMMENT '电话号码',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `start_date` datetime(3) NOT NULL COMMENT '开始时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;