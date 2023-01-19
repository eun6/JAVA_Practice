package chap3;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] n = {0, 1, 2, 3, 4, 5};
		for(int number : n) {
			System.out.print(number);
		}
		System.out.println();
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		for(char date : day) {
			System.out.print(date);
		}
	}

}
