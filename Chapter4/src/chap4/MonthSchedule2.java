package chap4;

import java.util.Scanner;

public class MonthSchedule2 {
	int day;
	int date;
	int toDo;
	Day d[];
	Scanner sc = new Scanner(System.in);
	
	//������
	public MonthSchedule2(int day) {
		this.d = new Day[day]; //�迭����
		for (int i=0; i<day; i++) { //��ü ����
			d[i] = new Day();
		}
	}
	public void input() {
		System.out.print("����(��ĭ�����Է�)?");
		String todo = sc.next();
		d[date].set(todo);
	}
	public void view() {
		System.out.print(date + "���� �� ���� ");
		d[date].show();
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(toDo != 3) {
		System.out.print("����(�Է�:1, ����:2, ������3) >>");
		toDo = sc.nextInt();
		if (toDo == 3) {finish();}
		else {
			System.out.print("��¥(1~30)?");
			date = sc.nextInt();
			switch (toDo) {
			case 1 :
				input();
				break;
			case 2 :
				view();
				break;
		}}}
	}

	public static void main(String[] args) {
		MonthSchedule2 april = new MonthSchedule2(30); // 4������ �� ��
		april.run();
	}

}
