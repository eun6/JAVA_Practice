package chap4;

import java.util.Scanner;


public class MonthSchedule {
	int day;
	int date;
	Day d[];
	
	public MonthSchedule(int day) {
		this.d = new Day[day]; //�迭����
		for (int i=0; i<day; i++) { //��ü ����
			d[i] = new Day();
		}
	}
	public int run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true) {
		System.out.print("����(�Է�:1, ����:2, ������3) >>");
		int toDo = sc.nextInt();
		
		switch (toDo) {
		case 1 :
			System.out.print("��¥(1~30)?");
			date = sc.nextInt();
			System.out.print("����(��ĭ�����Է�)?");
			String todo = sc.next();
			d[date].set(todo);
			break;
		case 2 :
			System.out.print("��¥(1~30)?");
			date = sc.nextInt();
			System.out.print(date + "���� �� ���� ");
			d[date].show();
			break;
		case 3 :
			System.out.println("���α׷��� �����մϴ�.");
			return 0;
		}}
		
		
		
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ �� ��
		april.run();
	}

}
