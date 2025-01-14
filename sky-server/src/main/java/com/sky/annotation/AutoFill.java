package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD) //表示注解可以应用于方法。
@Retention(RetentionPolicy.RUNTIME)   //注解会保留到字节码文件，并且在运行时可以通过反射访问。
public @interface AutoFill {
    //数据库操作类型： UPDATE INSERT
    OperationType value();
}