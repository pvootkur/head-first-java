package com.chap2;

public class DVDPlayer {
	boolean canRecord= false;
	
	void recorDVD(){
		System.out.println("DVD recording");
	}

	public void playDVD() {
		// TODO Auto-generated method stub
		System.out.println("DVD is playing");
	}
}
class DVDPlayerTestDrive{
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord=true;
		d.playDVD();
		
		if(d.canRecord == true){
			d.recorDVD();
		}
	}
}
