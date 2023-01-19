package chap3;

public class ArrayTest3 {

	public static void main(String[] args) {
		//4개의 논리값 가진 배열 선언 후 프린트
		boolean[] bool = {true, false, false, true};
		for(boolean trueFalse : bool) {
			System.out.print(trueFalse);
		}
		System.out.println();
		//5행 4열 2차원 실수 배열 d.
		double[][] d = new double[5][4];
		System.out.println("=========");
		
		//4행 3열 2차원 배열 val.
		int[][] val = new int[4][3];
		int num = 1;
		for(int i=0; i<val.length; i++) {
			for(int j=0; j<val[i].length; j++, num++) {
				val[i][j] = num;
				System.out.print(val[i][j]);
			}
			System.out.println();
		}
	}

}
