package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * Classe que representa a view para gerir clientes
 * @author Usuario
 *
 */
public class FrmCliente extends JFrame{
	
  private Bolicho telaPrincipal;

public FrmCliente( Bolicho telaPrincipal ){
	  this.telaPrincipal = telaPrincipal;
	  setTitle("Bolicho-> Clientes");
	  setSize(320,240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);		
  }

private void desenhaComponentes() {
	JLabel lblCPF = new JLabel("CPF:");
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtCPF = new JTextField(30);
	JTextField txtNome = new JTextField(30);
	JButton btnGravar = new JButton("Gravar");
	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	
	// addiciona os componentes em tela
	add(lblCPF);
	add(txtCPF);
	add(lblNome);
	add(txtNome);
	add(btnGravar);
}


}
