package view;
import controller.VetorNegativo;
public class Principal {

	public static void main(String[] args) {
		VetorNegativo vn = new VetorNegativo();
		
		int[] vetorSoma = {7, -4, 0, -1, -6, 47, -12};
		int negativoSize = vetorSoma.length -1;
		
		int somaNegativo = vn.somaVetor(vetorSoma, negativoSize);
		System.out.println("o vetor possui "+somaNegativo+" números negativos.");

	}

}
