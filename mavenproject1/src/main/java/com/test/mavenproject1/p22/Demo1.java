package com.test.mavenproject1.p22;

public class Demo1 {
	public static void main(String[] args) {
		AddDto dto=new AddDto();
		dto.setNum1(30);
		dto.setNum2(40);
		
		ArithmeticClass2 obj=new Add();
		obj.setData(dto);
		obj.cal();
		obj.display();
		
		obj=new Subtract();
		obj.setData(dto);     //We can reuse the data. Data is loosely binded
		obj.cal();
		obj.display();
	}
}
