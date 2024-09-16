package com.AbhiSpringbody.AbhiSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.AbhiSpringbody.AbhiSpring")
public class CollegeCon {
    
   //@Bean
//    public Student getdisp() {
//        return new Student();
//    }
//	public Subject getsubject() {
//        return new Subject("Advanced Java");
//    }
//	@Bean
//    public Subject subject() {
//        return new Subject("Advance Java");
//    }
	
	
//	@Bean
//    public College getCollege() {
//        return new Student(); // Student implements College
//    }
//    
    @Bean
    public Subject subject() {
        return new Subject("Advanced Java");
    }
    
    @Bean
    public Student student() {
        Student student = new Student();
        student.setSub(subject());  // Injecting dependency
      return student;
    }
//	
//	
//	@Bean
//    @Primary
//    public Subject subject() {
//        return new Subject("Advanced Java");
//    }
//
//    // If you have other subjects, define them with @Qualifier
//    @Bean
//    public Subject secondarySubject() {
//        return new Subject("Mathematics");
//    }
}