package Controller;

public class MenorValor {

	public MenorValor() {
		super ();
	}
	
	public int Menor (int[] vetor, int tamanho, int menor) {
		if (tamanho==0) { // quando n�o tem mais posi��o no vetor
			return  menor;
		} else {
			if (menor>vetor[tamanho-1]) {
				menor=vetor[tamanho-1];
				}
			return Menor(vetor, tamanho-1, menor);
		
	}
}
}
