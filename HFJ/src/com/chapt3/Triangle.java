package com.chapt3;

class Triangle {
	double area;
	int height;
	int lengh;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Triangle[] ta = new Triangle[4];
		int x=0;
		while(x<4){
			ta[x]=new Triangle();
			ta[x].height=(x+1)*2;
			ta[x].lengh=x+4;
			ta[x].setArea();
			System.out.print("traingle "+x+", area");
			System.out.println("=" +ta[x].area);
			x=x+1;
		}
		int y=x;
		x=27;
		Triangle t5 =ta[2];
		ta[2].area=343;
		System.out.print("y=" + y);
		System.out.println(", t5 area = "+ t5.area);
	}

	 void setArea() {
		// TODO Auto-generated method stub
		 area=(height*lengh)/2;
	}
}
