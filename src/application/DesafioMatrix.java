package application;

import java.util.Scanner;



public class DesafioMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i < mat.length; i++) {
			if(i==0) System.out.println();
			for(int j=0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("procurar numero?");
		int proc = sc.nextInt();
		
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				if(mat[i][j] == proc){ 											//valida se existe espaço acima
					System.out.println("Posição " + i + "," + j);
					
					
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					
					if(j > mat[i].length-1) {
						//System.out.println("Direita mat[i].length " + mat[i].length + " j vale " + j);
						System.out.println("Direita: " + mat[i][j+1]);
					}
					
					
					if(i > 0 ) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					
					if(i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
