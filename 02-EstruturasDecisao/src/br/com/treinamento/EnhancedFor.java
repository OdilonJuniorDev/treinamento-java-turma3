package br.com.treinamento;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] arrayList = {10,20,30,40,100};
		
		int contador = 0;
		System.out.println("Lista de números");
		
		for (int array: arrayList){
			System.out.println(array);
			contador ++;
		}
		System.err.println("quantidade de registros:" + contador); 
	}

}
