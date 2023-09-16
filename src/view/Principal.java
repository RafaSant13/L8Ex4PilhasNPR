package view;

import javax.swing.JOptionPane;

import controller.NPRControle;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		NPRControle npr = new NPRControle();
		int X = 0;
		while(X!=9) {
			X = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Insere Valor\n2 - Realiza Opera��es\n9 - Fim"));
			switch (X) {
				case 1:
					int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor: "));
					npr.insereValor(p, valor);
					break;
				case 2:
					String op = JOptionPane.showInputDialog("Insira a opera��o: ");
					System.out.println(npr.npr(p, op));
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Valor Inv�lido");
					break;
			}
			System.out.println("N�mero de valores na pilha: "+p.size());
		}
	}

}
