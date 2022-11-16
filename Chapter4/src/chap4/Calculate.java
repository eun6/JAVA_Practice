package chap4;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		//피연산 값, 객체 내 저장.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//연산 결과값 리턴
		return a+b;
	}
}

class Sub {
	int a, b;
	void setValue(int a, int b) {
		//피연산 값, 객체 내 저장.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//연산 결과값 리턴
		return a-b;
	}
}

class Mul {
	int a, b;
	void setValue(int a, int b) {
		//피연산 값, 객체 내 저장.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//연산 결과값 리턴
		return a*b;
	}
}

class Div{
	int a, b;
	void setValue(int a, int b) {
		//피연산 값, 객체 내 저장.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//연산 결과값 리턴
		return a/b;
	}
}

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String z = sc.next();
		
		switch (z) {
		case "+" :
			add.setValue(x, y);
			System.out.println(add.calculate());
			break;
		case "-":
			sub.setValue(x, y);
			System.out.println(sub.calculate());
			break;
		case "*":
			mul.setValue(x, y);
			System.out.println(mul.calculate());
			break;
		case "/" :
			div.setValue(x, y);
			System.out.println(div.calculate());
			break;
		}
		
		
		
	}

}
