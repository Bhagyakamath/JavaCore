package com.test.mavenproject1.p6;

public class Player1 extends Thread{
	TicToc ob;
	public Player1(TicToc ob) {
		this.ob=ob;
	}
	
	@Override
	public void run() {
		int i=0;
		for( i=0; i<20; i++) {
			if(i==0) {
				try {
					sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			ob.f2(i);
		}
	}
}
