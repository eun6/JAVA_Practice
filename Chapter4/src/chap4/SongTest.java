package chap4;

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	//�⺻ ������
	Song() {}
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println("�뷡 ������ " + title + "�̰� ������ " + artist + "�̰�, ��ǥ�� ������ " + year + "�̸�, ������ ������ " + country);
	}
}

public class SongTest {
	public static void main(String[]args) {
		Song mySong=new Song("Dancing Queen","ABBA",1978,"������");
		mySong.show();
	}
}
