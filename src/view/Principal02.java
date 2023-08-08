package view;

import Controller.MenorValor;

public class Principal02 {

	public static void main(String[] args) {
		int [] vetor = {1,6,7,45,22,9,2};
		int tamanho = vetor.length;
		int menor = vetor [tamanho-1];
		MenorValor MV = new MenorValor();
		
		int res= MV.Menor(vetor, tamanho, menor);
		System.out.println(res);
	}

}
