package chap4;

class TV {
	int year;
	int inch;
	String madeBy;
	
	TV(String madeBy, int year, int inch) {
		this.madeBy= madeBy;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(madeBy + "���� ���� " + year + "�� " + inch+ "��ġ");
	}
}

public class TVtest {
	public static void main(String[]args){
		TV myTV=new TV("LG", 2017, 32);//LG���� ���� 2017�� 32��ġ
	    myTV.show();
	}
}