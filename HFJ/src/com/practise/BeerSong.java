package com.practise;

public class BeerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beerNum=99;
		String word="bottles";
		while (beerNum>0){
			if(beerNum>0){
				System.out.println(beerNum + " " + word + " of the beer on the wall" );
			
			if(beerNum==1){
				word="boottle";
			}
//			System.out.println(beerNum + " " + word + " of the beer on the wall" );
			System.out.println(beerNum + " " + word + " of the beer." );
			System.out.println("take one down");
			System.out.println("pass it around");
			beerNum= beerNum-1;
			}
			else{
				System.out.println(" no more bottles of the beer on the wall" );
				break;
			}
		}

	}

}
