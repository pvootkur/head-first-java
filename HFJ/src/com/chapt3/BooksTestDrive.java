package com.chapt3;

class Books{
	String title;
	String Author;

}

public class BooksTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books[] mybooks  = new Books[3];
		int x=0;
		mybooks[0]= new Books() ;
		mybooks[1] =new Books();
		mybooks[2] =new Books();
		
		mybooks[0].title = "the garpes of java";
		mybooks[0].Author= "Bob";
		mybooks[1].title = "the java Gatsby";
		mybooks[1].Author= "sue";
		mybooks[2].title = "the java cookbook";
		
		
		
		mybooks[2].Author= "eon";
		
		while(x<3){
			System.out.println(mybooks[x].title);
			System.out.println("by ");
			System.out.println(mybooks[x].Author);
			x=x+1;
		}

	}

}
