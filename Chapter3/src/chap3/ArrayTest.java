package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		char[] c = new char[10];
		char ch = 'A';
		for(int i=0; i<c.length; i++, ch++) {
			c[i] = ch;
		}
		for(char cha : c) {
			System.out.print(cha);
		}
	}

}
