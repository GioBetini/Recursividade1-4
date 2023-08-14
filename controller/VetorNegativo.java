package controller;

public class VetorNegativo {

	public VetorNegativo() {
		super();
	}

	public int somaVetor(int[] vet, int size) {
		if (size == 0) { // ao chegar na primeira posição do vetor encerramos a recursão
			return vet[size];
		}
		// Chamamos a recursão subtraindo o size para percorrer o vetor
		int num = somaVetor(vet, size - 1);

		if (vet[size] < 0) {
			return 1 + num;
		}
		return 0 + num;

	}
}
