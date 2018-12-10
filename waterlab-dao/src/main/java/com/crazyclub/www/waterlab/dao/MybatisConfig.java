package com.crazyclub.www.waterlab.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.crazyclub.www.waterlab.dao.mybatis")
public class MybatisConfig {
}
