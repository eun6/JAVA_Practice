package chap4;

import java.util.Scanner;


public class CircleManger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
	      for(int i=0; i < 3; i ++) {
	         System.out.print("x, y, radius >>");
	         double x = sc.nextDouble(); // x�� �б�.
	         double y = sc.nextDouble(); // y�� �б�.
	         int radius = sc.nextInt(); // radius�� �б�.
	         c[i] = new Circle(x, y, radius); // Circle ��ü ����
	      }
	      for(int i=0; i<c.length; i++) {
	      	 if(c[i].cal() > c[i++].cal()) {c[i].showCal();}
	      	 else {c[i++].showCal();}
	      		 
	      }
	      sc.close();
	   }
}
