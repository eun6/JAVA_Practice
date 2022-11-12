package chap4;

import java.util.Scanner;


public class CircleManger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
	      for(int i=0; i < 3; i ++) {
	         System.out.print("x, y, radius >>");
	         double x = sc.nextDouble(); // x값 읽기.
	         double y = sc.nextDouble(); // y값 읽기.
	         int radius = sc.nextInt(); // radius값 읽기.
	         c[i] = new Circle(x, y, radius); // Circle 객체 생성
	      }
	      for(int i=0; i<c.length; i++) {
	      	 if(c[i].cal() > c[i++].cal()) {c[i].showCal();}
	      	 else {c[i++].showCal();}
	      		 
	      }
	      sc.close();
	   }
}
