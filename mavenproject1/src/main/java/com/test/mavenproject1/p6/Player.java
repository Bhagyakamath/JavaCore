package com.test.mavenproject1.p6;

public class Player extends Thread{
	TicToc ob;
	public Player(TicToc ob) {
		this.ob=ob;
	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			ob.f1();
		}
	}
}
