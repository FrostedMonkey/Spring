package com.cc.config;

import com.cc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName MainConfigOfPropertyValues
 * @Author chenchen
 * @Date 2019/9/18 22:33
 * @Version 1.0
 **/

/**
 *使用PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
 * @PropertySource可以写多个
 * 当然作用等同于@PropertySources
 */
@PropertySource(value={"classpath:person.properties"})
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Person person(){
        return new Person();
    }
}