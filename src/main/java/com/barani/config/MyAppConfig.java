package com.barani.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.barani.beans.MyColor;
import com.barani.beans.RedColor;

@Configuration
public class MyAppConfig {
	@Bean(name="myColorBean")
	public MyColor getMyColor(){
		return new RedColor();
	}
}
