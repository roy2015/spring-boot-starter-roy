package com.gdy.roy.spring.boot.configuration;

import com.gdy.roy.spring.boot.annotation.EnableRoyConfiguration;
import com.gdy.roy.spring.boot.bean.Student;
import com.gdy.roy.spring.boot.bean.StudentProperties;
import com.gdy.roy.spring.boot.bean.StudentWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * Created by apple on 2019/6/30.
 */

@Configuration
@ConditionalOnBean(annotation = EnableRoyConfiguration.class)
@EnableConfigurationProperties(StudentProperties.class)
public class RoyAutoConfiguration {
    @Autowired
    private StudentProperties studentProperties;

    @Bean
    @ConditionalOnMissingBean
    public Student getStudentWrapperBean() {
        StudentWrapper studentWrapper = new StudentWrapper();
        studentWrapper.setName(studentProperties.getName());
        studentWrapper.setAge(studentProperties.getAge());
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        studentWrapper.setSno(uuid);
        return studentWrapper;
    }


}
