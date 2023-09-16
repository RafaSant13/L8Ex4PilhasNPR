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
			try { //Necessário para se caso haja só um valor na pilha, ele não seja apagado no primeiro try
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
					JOptionPane.showMessageDialog(null, "Operação Inválida");
				}
				if (res != 0) { //Necessário para que não aconteça push de res com valor 0
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
