package chap4;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		//�ǿ��� ��, ��ü �� ����.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//���� ����� ����
		return a+b;
	}
}

class Sub {
	int a, b;
	void setValue(int a, int b) {
		//�ǿ��� ��, ��ü �� ����.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//���� ����� ����
		return a-b;
	}
}

class Mul {
	int a, b;
	void setValue(int a, int b) {
		//�ǿ��� ��, ��ü �� ����.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//���� ����� ����
		return a*b;
	}
}

class Div{
	int a, b;
	void setValue(int a, int b) {
		//�ǿ��� ��, ��ü �� ����.
		this.a=a;
		this.b=b;
	}
	int calculate() {
		//���� ����� ����
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
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
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
