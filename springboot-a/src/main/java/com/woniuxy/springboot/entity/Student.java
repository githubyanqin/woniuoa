package com.woniuxy.springboot.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//当前对象的属性值由配置文件来注入
@ConfigurationProperties(prefix="student")
//实体类需要
@Component
public class Student {
	@Value("huifugai")
	private Integer id;
	private String name;
	private List<Object> lists;
	private Map<String,Object> maps;
	private School school;
	private int hehehe;
	private int ii;
}
