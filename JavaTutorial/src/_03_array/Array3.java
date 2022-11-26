package _03_array;

public class Array3 {
	public static void main(String[] args) {
		int num[][] = new int[4][4];
		
		//num[0][0] = 1;
		//num[1][1] = 1;
		//num[2][2] = 1;
		//num[3][3] = 1;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(i == j) {
					num[i][j] = 1;
				}
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
