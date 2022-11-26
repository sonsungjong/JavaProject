package _03_array;

public class Array5 {
	public static void main(String[] args) {
		int numbers[][] = {{0,0},{0,0}};
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[1][0] = 3;
		numbers[1][1] = 4;
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]);
			}
			System.out.println();
		}
	}
}
