package com.test.mavenproject1.p22;

public abstract class ArithmeticClass2 implements Arithmetic2{
	AddDto ob;
	
	@Override
	public void setData(AddDto ob) {
		this.ob=ob;
		
	}

	@Override
	public void display() {
		System.out.println("Num1= "+ob.getNum1()+", Num2= "+ob.getNum2()+", Num3= "+ob.getNum3());
		
	}

}
