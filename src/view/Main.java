package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		int[] vetor = {30, 15, 60, 10, 20, 40, 80};
		
		for(int index : vetor) {
			a.insert(index);
		}
		
		try {
			a.infixSearch(); //Atravessamento que apresenta os dados da árvore em ordem crescente
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
