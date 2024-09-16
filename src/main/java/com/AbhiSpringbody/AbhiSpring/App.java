package com.AbhiSpringbody.AbhiSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Laptop1  obj = new Dell();
//        obj.disp();
        
//      ApplicationContext context=new ClassPathXmlApplicationContext("College.xml");
      
//      Laptop1 obj =(Laptop1)context.getBean("dell");  
//      obj.disp();
      
//     College obj =(College)context.getBean("faculty");  
//    obj.disp();
      
//      Subject obj=(Subject)context.getBean("subject");
//  	System.out.println(obj);
  	
	
//  	Dell d=(Dell)context.getBean("dell");
//  	d.disp();
      
//      Student s=(Student)context.getBean("student");
//      s.disp();
      
//      College obj =(College)context.getBean("student");  
//     obj.disp();
     
     ApplicationContext context=new AnnotationConfigApplicationContext(CollegeCon.class);
//      Student s=(Student)context.getBean(Student.class);
//      s.disp();
//      Faculty F=(Faculty)context.getBean(Faculty.class);
//      F.disp();
      
//      College c=(College)context.getBean(College.class);
//      c.disp();
     
     Admin adm = context.getBean(Admin.class);
     adm.manage();


    }
}