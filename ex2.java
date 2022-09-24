package Lista8;

import java.util.Scanner;

public class e2  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j == i) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
        ler.close();
	}
}
