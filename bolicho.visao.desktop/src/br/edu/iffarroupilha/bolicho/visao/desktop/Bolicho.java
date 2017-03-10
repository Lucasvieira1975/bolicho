package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * <p>
 * classe principal do projeto, contempla classe inicial
 * </p>
 * @author Usuario
 *
 */

public class Bolicho extends JFrame {
	public Bolicho() {
		setTitle("::Bolicho::");
		setSize(640,480);
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						
		setVisible(true);
	}
private void desenhaComponentes() {
	//cria a barra de menus
		JMenuBar menu = new JMenuBar();
		// cria menu cadastro
		JMenu cadastro = new JMenu("Cadastro");
		// cria os sub itens
		menu.add(cadastro);
		JMenuItem cliente = new JMenuItem("Clientes");
		JMenuItem produto = new JMenuItem("Produtos");
		JMenuItem venda = new JMenuItem("Vendas");
		//vincula ao menu cadastro
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		//vincula as açoes aos itens
		cliente.addActionListener( new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Bolicho.this,"Voce clicou");
				
			}
		} );
		produto.addActionListener( new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new FrmCliente(Bolicho.this);
				
			}
		} );
              venda.addActionListener( new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Bolicho.this,"o que vender"
						);
				
			}
		} );
		
		//adiciona o menu em tela
		setJMenuBar(menu);
	}
public static void main(String[] args) {
   new Bolicho();	
}
}
