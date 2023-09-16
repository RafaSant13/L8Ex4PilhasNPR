package controller;

import javax.swing.JOptionPane;

import model.PilhaInt;

public class NPRControle {

	public NPRControle() {
		super();
	}
	
	public void insereValor(PilhaInt p , int valor) {
		p.push(valor);
	}
	
	public int npr(PilhaInt p, String op) {
		int res = 0;
		try {
			int a = p.pop(), b = 0;
			try { //Necess�rio para se caso haja s� um valor na pilha, ele n�o seja apagado no primeiro try
				b = p.pop();
				if (op.equals("+")) {
					res = b + a;
				}
				else if (op.equals("-")) {
					res = b - a;
				}
				else if (op.equals("*")) {
					res = b * a;
				}
				else if (op.equals("/")) {
					res = b / a;
				}
				else {
					JOptionPane.showMessageDialog(null, "Opera��o Inv�lida");
				}
				if (res != 0) { //Necess�rio para que n�o aconte�a push de res com valor 0
					System.out.println(b + " "+op+" "+ a);
					p.push(res);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				p.push(a);
			}		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return res;
		
	}

}
