package pvictor.executavel;

import javax.swing.JOptionPane;

public class MediaFinal {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4"));

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		JOptionPane.showMessageDialog(null, "As 4 notas digitadas s?o:  " + "\n Nota 1 = " + nota1 + "\n Nota 2 = "
				+ nota2 + "\n Nota 3 = " + nota3 + "\n Nota 4 = " + nota4);
		JOptionPane.showMessageDialog(null, "Media das notas ? = " + media);

	}

}
