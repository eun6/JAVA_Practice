package chap3;

public class ArrayTest3 {

	public static void main(String[] args) {
		//4���� ���� ���� �迭 ���� �� ����Ʈ
		boolean[] bool = {true, false, false, true};
		for(boolean trueFalse : bool) {
			System.out.print(trueFalse);
		}
		System.out.println();
		//5�� 4�� 2���� �Ǽ� �迭 d.
		double[][] d = new double[5][4];
		System.out.println("=========");
		
		//4�� 3�� 2���� �迭 val.
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
