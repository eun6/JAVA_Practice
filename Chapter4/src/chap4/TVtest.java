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
		System.out.println(madeBy + "에서 만든 " + year + "년 " + inch+ "인치");
	}
}

public class TVtest {
	public static void main(String[]args){
		TV myTV=new TV("LG", 2017, 32);//LG에서 만든 2017년 32인치
	    myTV.show();
	}
}