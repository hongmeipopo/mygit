package org.lanqiao.test;

import org.lanqiao.entity.Student;
import org.lanqiao.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService =(IStudentService)context.getBean("studentService");
		Student student = new Student();
		student.setStuAge(88);
		student.setStuName("zds");
		student.setStuNo(10);
		studentService.addStudent(student);
	}
}
