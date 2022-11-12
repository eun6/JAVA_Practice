package chap4;

import java.util.Scanner;


public class MonthSchedule {
	int day;
	int date;
	Day d[];
	
	public MonthSchedule(int day) {
		this.d = new Day[day]; //배열선언
		for (int i=0; i<day; i++) { //객체 선언
			d[i] = new Day();
		}
	}
	public int run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
		System.out.print("할일(입력:1, 보기:2, 끝내기3) >>");
		int toDo = sc.nextInt();
		
		switch (toDo) {
		case 1 :
			System.out.print("날짜(1~30)?");
			date = sc.nextInt();
			System.out.print("할일(빈칸없이입력)?");
			String todo = sc.next();
			d[date].set(todo);
			break;
		case 2 :
			System.out.print("날짜(1~30)?");
			date = sc.nextInt();
			System.out.print(date + "일의 할 일은 ");
			d[date].show();
			break;
		case 3 :
			System.out.println("프로그램을 종료합니다.");
			return 0;
		}}
		
		
		
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}

}
