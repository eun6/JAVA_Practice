package example;

import java.util.Scanner;

class Grade {
	int math;
	int english;
	int science;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.english = english;
		this.science = science;
	}
	
	int avg() {
		int sum = 0;
		sum = math + english + science;
		return sum/3;
	}
}

public class GradeTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=scan.nextInt();
		int science=scan.nextInt();
		int english=scan.nextInt();
		Grade me=new Grade(math, science, english);
		System.out.println("����� "+me.avg());
		
		scan.close();
	}
}
