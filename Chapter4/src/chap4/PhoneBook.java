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
			System.out.println(a + "의 번호는 " + tel);
		} else {System.out.println(a + "이 없습니다.");}
	}

}

public class PhoneBook {


	public static void main(String[] args) {
		String person = null;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int count = sc.nextInt();
		Phone p[] = new Phone[count]; //배열 생성
		
		for (int i = 0; i< count; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			int tel = sc.nextInt();
			p[i] = new Phone(name, tel); //객체 생성
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
		System.out.print("검색할 이름>>");
		person = sc.next();
		if (person.equals("그만")) break;
		else {
		for(int i=0; i<count; i++) {
			p[i].search(person);
		}}}
	}
}
