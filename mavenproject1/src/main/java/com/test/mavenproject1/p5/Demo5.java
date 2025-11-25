package com.test.mavenproject1.p5;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import com.test.mavenproject1.p1.Read;



public class Demo5 {

	public static void main(String[] args) {
		try {
//			Connection con=DbConnector.getConnection();
//			System.out.println("Connection successful");
			StudentDao dao=new StudentDao();
			int ch=0;
			do {
				System.out.println("Enter 0 to exit and 1 for display and 2 for Id and 3 for insertion and 4 for deletion");
				ch=Read.sc.nextInt();
				switch(ch) {
				case 0: System.out.println("Thank you for using the service");
						dao=null;
						break;
				default: System.out.println("Please enter correct input");
						break;
						
				case 1: List<StudentDto> l1=dao.getAllStudents();
						l1.forEach(System.out :: println);
						break;
						
				case 2: StudentDto ob=new StudentDto();
						System.out.println("Enter roll no: ");
						ob.setSroll(Read.sc.nextInt());
						System.out.println(dao.getById(ob));
						break;
						
				case 3: StudentDto ob1=new StudentDto();
						System.out.println("Enter roll no: ");
						ob1.setSroll(Read.sc.nextInt());
						System.out.println("Enter first name: ");
						ob1.setFirstname(Read.sc.next());
						System.out.println("Enter last name: ");
						ob1.setLname(Read.sc.next());
						System.out.println("Enter date of birth(yyyy-mm-dd): ");
						
						java.util.Date UtilDate=new java.util.Date();
						ob1.setDob(new java.sql.Date(UtilDate.getTime()));
						ob1.setDob(Date.valueOf(Read.sc.next()));

						System.out.println("Enter gender: ");
						ob1.setGender(Read.sc.next());
						dao.insertStudents(ob1);
						break;
						
				case 4: StudentDto ob2=new StudentDto();
						System.out.println("Enter roll no: ");
						ob2.setSroll(Read.sc.nextInt());
						dao.deleteStudent(ob2);
						break;


				}
			}while(ch!=0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
