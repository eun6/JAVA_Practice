package chap4;

import java.util.Scanner;


class Reserve {
	Scanner sc = new Scanner(System.in);
	String[] S = new String[10];
	String[] A = new String[10];
	String[] B = new String[10];
	
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
				S[i] = "___ ";
				System.out.print(S[i]);
			}
			chooseSeat(1);
			break;
		case 2:
			System.out.print("A>>");
			for(; i<A.length; i++) {
				A[i] = "___ ";
				System.out.print(A[i]);
			}
			chooseSeat(2);
			break;
		case 3:
			System.out.print("B>>");
			for(; i<B.length; i++) {
				B[i] = "___ ";
				System.out.print(B[i]);
			}
			chooseSeat(3);
			break;
		}
	}
	void chooseSeat(int line) {
		System.out.println("");
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int seatNum = sc.nextInt();
		seatNum--;

		switch(line) {
		case 1:
			if (S[seatNum].equals("___ "))
			S[seatNum] = name; 
			break;
		case 2:
			if (A[seatNum].equals("___ ")) 
			A[seatNum] = name;
			break;
		case 3:
			if (B[seatNum].equals("___ ")) 
			B[seatNum] = name;
			break;
		}
	}
	void search () {	
		System.out.print("S>>");
		for(int i=0; i<S.length; i++) {
			if (S[i] == null) {
				S[i] = "___ ";
			}
			System.out.print(S[i]);
		}
		System.out.println();
		System.out.print("A>>");
		for(int i=0; i<A.length; i++) {
			if (A[i] == null) {
				A[i] = "___ ";
			}
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.print("B>>");
		for(int i=0; i<B.length; i++) {
			if (B[i] == null) {
				B[i] = "___ ";
			}
			System.out.print(B[i]);
		}
	}
	
	void cancel(int line) {
		switch (line) {
		case 1:
			System.out.print("S>>");
			for(int i=0; i<S.length; i++) {
				if (S[i] == null) {
					S[i] = "___ ";
				}
				System.out.print(S[i]);
			}
			delete();
			break;
		case 2:
			System.out.print("A>>");
			for(int i=0; i<A.length; i++) {
				if (A[i] == null) {
					A[i] = "___ ";
				}
				System.out.print(A[i]);
			}
			delete();
			break;
		case 3:
			System.out.print("B>>");
			for(int i=0; i<B.length; i++) {
				if (B[i] == null) {
					B[i] = "___ ";
				}
				System.out.print(B[i]);
			}
			delete();
			break;
		}
		
	}
	void delete () {
		System.out.println();
		System.out.print("이름>>");
		String name = sc.next();
		
		for(int i=0; i<S.length; i++) {
			if(name.equals(S[i])) {
				S[i] = "___ ";
			}else if(name.equals(A[i])) {
				A[i] = "___ ";
			}else if(name.equals(B[i])) {
				B[i] = "___ ";
			}
		}
	}

}

public class Concert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reserve reserve = new Reserve();
		int num = 0;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while (num != 4) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				reserve.Line(reserve.chooseLine());
				break;
			case 2:
				reserve.search();
				System.out.println();
				System.out.println("<<<조회를 완료하였습니다.>>>");
				break;
			case 3:
				reserve.cancel(reserve.chooseLine());
				break;
			case 4:
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

}
