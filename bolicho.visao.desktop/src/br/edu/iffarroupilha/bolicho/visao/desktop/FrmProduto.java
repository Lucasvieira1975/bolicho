package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bolicho.controle.ProdutoControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * classe que representa a interface para produto.
 * </p>
 * @author fernando
 *
 */
public class FrmProduto  extends JFrame {

	public FrmProduto(Bolicho principal) {
		setTitle("Bolicho -> Produto");
		setSize(320,240);
		setLocationRelativeTo(principal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria os componentes para a tela
		JLabel jblDescricao = new JLabel("Descricao:");
		JLabel jblPreco = new JLabel("Preço:");
		final JTextField jtfDescricao = new JTextField(30);
		final JTextField jtfPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ProdutoControle controle = new ProdutoControle();				
				// pegar os dados da tela
				Produto p = new Produto();
				p.setDescricao(jtfDescricao.getText() );
				float preco = controle.converteFlutuante(jtfPreco.getText());
				p.setPreco(preco);
				
				// valida os dados
				
				String erro = controle.validarProduto(p);
				if (erro == null) {
					// realiza gravação
					controle.gravar(p);
					
					JOptionPane.showMessageDialog(null, "Feitooooo!!!");
				} else{
					JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		
		// adiciona em tela
		add(jblDescricao);
		add(jtfDescricao);
		add(jblPreco);
		add(jtfPreco);
		add(btnGravar);
		
	}
}