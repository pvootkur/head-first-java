package com.chap2;

public class Player {
	int number=0;
	public void guess() {
		number =(int)(Math.random()*100);
		System.out.println("im guessing" + number);
	}
}
