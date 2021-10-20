package io.github.woukies.q6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:q6_1/employeeCTX.xml", "classpath:q6_1/employeeCTX2.xml");

		Employee employee1 = ctx.getBean("employee1", Employee.class);
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getLicense());

		System.out.println("---------------------------");

		EmployeeInfo employeeInfo = ctx.getBean("employeeInfo1", EmployeeInfo.class);
		Employee employee2 = employeeInfo.getEmployee();
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());
		System.out.println(employee2.getLicense());

		System.out.println("---------------------------");
		
		Employee employee3 = ctx.getBean("employee3", Employee.class);
		System.out.println(employee3.getName());
		System.out.println(employee3.getSalary());
		System.out.println(employee3.getLicense());
		
		ctx.close();
	}
}
