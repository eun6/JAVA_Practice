package chap4;

import java.util.Scanner;

class Phone {
	private String name;
	private int tel;
	
	Phone(String name, int tel) {
		this.name = name;
		this.tel = tel;
	}
	public void search(String a) {
		if (name.equals(a)) {
			System.out.println(a + "�� ��ȣ�� " + tel);
		} else {System.out.println(a + "�� �����ϴ�.");}
	}

}

public class PhoneBook {


	public static void main(String[] args) {
		String person = null;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο���>>");
		int count = sc.nextInt();
		Phone p[] = new Phone[count]; //�迭 ����
		
		for (int i = 0; i< count; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			int tel = sc.nextInt();
			p[i] = new Phone(name, tel); //��ü ����
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
		System.out.print("�˻��� �̸�>>");
		person = sc.next();
		if (person.equals("�׸�")) break;
		else {
		for(int i=0; i<count; i++) {
			p[i].search(person);
		}}}
	}
}
