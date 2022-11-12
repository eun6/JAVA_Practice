package chap4;

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	//기본 생성자
	Song() {}
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println("노래 제목은 " + title + "이고 가수는 " + artist + "이고, 발표된 연도는 " + year + "이며, 가수의 국적은 " + country);
	}
}

public class SongTest {
	public static void main(String[]args) {
		Song mySong=new Song("Dancing Queen","ABBA",1978,"스웨덴");
		mySong.show();
	}
}
