//package com.test.mavenproject1.p7;
//
//import java.sql.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//import com.test.mavenproject1.p1.Read;
//	
//public class Demo2 extends TemplateD{
//	static	Student head = null;
//	static	Student tail = null;
//	static	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	public static void main(String[] args) throws Exception {
//		
//		int ch = 0;
//		
//		do {
//			System.out.println("Enter 0 to exit , 1 to add & 2 to display");
//			ch = Read.sc.nextInt();
//			switch (ch) {
//			case 0:
//				
//				break;
//			case 1:
//				Student x = new Student();
//				System.out.println("Enter Id, NAME & Date of Birth");
//				x.sid = Read.sc.nextInt();
//				x.name = Read.sc.next();
//				x.dob = sdf.parse(Read.sc.next());
//				if(head==null) {
//					head = tail = x;
//				}
//				else {
//					tail.next = x;
//					tail = x;
//				}
//				break;
//			case 2:
//				Demo2 ob = new Demo2();
//				ob.header();
//				ob.printData();
//				ob.footer();
//				break;
//			default:
//				System.out.println("Invalid Entry, Please try again");
//				break;
//			}
//		} while (ch!=0);
//	}
//
//	private static void display(Student head) {
//		if(head==null)return;
//		String data = """
//				%-10d %-30s %-15s
//				""";
//		System.out.println(data.formatted(head.sid, head.name, sdf.format(head.dob)));
//		display(head.next);
//	}
//
//	@Override
//	public void header() {
////		TEXT BLOCK
//		String h1 = """
//				Xysis Mini Project
//				%s				
//				%-10s %-30s %-15s
//				%s
//				""";
//				System.out.println(h1.formatted("=".repeat(60), "studId","studentName","dateOfBirth","=".repeat((60))));
//	}
//
//	@Override
//	public void printData() {
//		// TODO Auto-generated method stub
//		display(head);
//	}
//
//	@Override
//	public void footer() {
//		// TODO Auto-generated method stub
//		String f1 = """
//				%s
//				""";
//		System.out.println(f1.formatted("=".repeat(60)));
//	}
//
//	@Override
//	public void consolidation() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
