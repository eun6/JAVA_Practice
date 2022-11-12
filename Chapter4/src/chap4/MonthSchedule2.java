package chap4;

import java.util.Scanner;

public class MonthSchedule2 {
	int day;
	int date;
	int toDo;
	Day d[];
	Scanner sc = new Scanner(System.in);
	
	//생성자
	public MonthSchedule2(int day) {
		this.d = new Day[day]; //배열선언
		for (int i=0; i<day; i++) { //객체 선언
			d[i] = new Day();
		}
	}
	public void input() {
		System.out.print("할일(빈칸없이입력)?");
		String todo = sc.next();
		d[date].set(todo);
	}
	public void view() {
		System.out.print(date + "일의 할 일은 ");
		d[date].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(toDo != 3) {
		System.out.print("할일(입력:1, 보기:2, 끝내기3) >>");
		toDo = sc.nextInt();
		if (toDo == 3) {finish();}
		else {
			System.out.print("날짜(1~30)?");
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
		MonthSchedule2 april = new MonthSchedule2(30); // 4월달의 할 일
		april.run();
	}

}
