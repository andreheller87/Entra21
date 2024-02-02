package SwingJavaAula30012024;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Simples {

	public static void main(String[] args) {
	JFrame frame = new JFrame("Swing Application");
JButton btn = new JButton("Clique");
JLabel texto = new JLabel("Numero");
JPanel painel = new JPanel();
painel.add(btn);
painel.add(texto);
frame.getContentPane().add(painel);
frame.pack();
frame.show();

	}

}
