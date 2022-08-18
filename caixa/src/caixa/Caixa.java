package caixa;

import javax.swing.JOptionPane;

public class Caixa {

	public static void main(String[] args) {
		//Variavel das quantidades de cada nota
		int[] qtd = {0, 0, 0, 0, 0, 0, 0, 0};
		
		//notas disponiveis
		int[] dsp = {10, 10, 10, 10, 10, 10, 10, 10};
		
		//notas disponiveis
		int[] nts = {200, 100, 50, 20, 10, 5, 1};
		
		//variavel que guarda o valor do saque
		int valor;
		
		//variavel que armazenda a string que sera mostrada
		String str = "";
		
		/* execução */
		
		valor = Integer.parseInt(
				JOptionPane.showInputDialog(null, "digite o valor")
				);
		
		/* loop pra gerar a string */
		
		int resto = valor;
		
		for (int i = 0; i < qtd.length - 1; i++) {
			qtd[i] = resto / nts[i];
			
			resto = resto % nts[i];
			
			if (qtd[i] > 0) {
				str += "\n" + qtd[i] + " notas de " + nts[i];
			}
		}
		
		/* output */
		
		JOptionPane.showMessageDialog(null, str);
	}

}
