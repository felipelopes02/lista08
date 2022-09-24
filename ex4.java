package Lista8;

import java.util.Scanner;

public class e4  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int maiorValor = 0;
		int x=0;
		int y=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o número "+(j+1)+" da "+(i+1)+" linha:");
				matriz[i][j] = ler.nextInt();
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("O maior número se encontra em matriz["+x+"]["+y+"] e é igual a "+maiorValor);
		
        ler.close();
	}
}
