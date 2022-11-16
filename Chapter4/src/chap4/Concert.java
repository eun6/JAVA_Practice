package chap4;

import java.util.Scanner;

class Reserve {
	Scanner sc = new Scanner(System.in);
	String[] S = new String[40];
	String[] A = new String[40];
	String[] B = new String[40];
	
	int chooseLine() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int line = sc.nextInt();
		return line;
	}
	void Line(int line) {
		int i=0;
		switch (line) {
		case 1:
			System.out.print("S>>");
			for(; i<S.length; i++) {
				if (i%4 ==0) {
					if (S[i] == null) {
						System.out.print(" ");
					}
				} else System.out.print("_");
			}
			break;
		case 2:
			System.out.print("A>>");
			for(; i<A.length; i++) {
				if (i%4 ==0) {
					if (A[i] == null) {
						System.out.print(" ");
					}
				} else System.out.print("_");
			}
			break;
		case 3:
			System.out.print("B>>");
			for(; i<B.length; i++) {
				if (i%4 ==0) {
					if (B[i] == null) {
						System.out.print(" ");
					}
				} else System.out.print("_");
			}
			break;
		}
	}
	void chooseSeat() {
		System.out.println("");
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int seatNum = sc.nextInt();
		Seat(seatNum);
	}
	void Seat(int seatNum) {
		
	}
}
class Search {
	
}
class Cancel {
	
}

public class Concert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while (num != 4) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				Reserve reserve = new Reserve();
				reserve.Line(reserve.chooseLine());
				reserve.chooseSeat();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

}
