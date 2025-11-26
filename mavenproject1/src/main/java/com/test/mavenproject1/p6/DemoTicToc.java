package com.test.mavenproject1.p6;

public class DemoTicToc {

	public static void main(String[] args) throws Exception{
		TicToc t1=new TicToc();
		Player p1=new Player(t1);
		Player1 p2=new Player1(t1);
		p1.start();
		p2.start();
		
		t1=null;
		System.gc();

	}

}
