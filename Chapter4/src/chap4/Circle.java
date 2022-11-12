package chap4;

public class Circle {
	private double x, y;
	   private int radius;
	   public Circle(double x, double y, int radius) {
	     this.x = x; //x, y, radius �ʱ�ȭ
	     this.y = y;
	     this.radius = radius;
	   }
	   
	   public double cal() {
		   return 3.14*radius*radius;
	   }
	   
	   public void showCal() {
		   System.out.println("���� ������ ū ���� (" + x+", "+ y+")"+ radius);
	   }
	   
	   public void show() {
	      System.out.println("("+x+", "+y+")"+radius);
	   }
}
