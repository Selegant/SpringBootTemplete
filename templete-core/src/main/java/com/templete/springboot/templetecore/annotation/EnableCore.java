package com.templete.springboot.templetecore.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author WT
 * @CreateTime 2018/4/29
 * @Package com.templete.springboot.templetecore.annotation
 **/

@Target({ElementType.TYPE})
@Documented
@ComponentScan(basePackages = "com.templete.springboot")
@Configuration
public @interface EnableCore {
}
