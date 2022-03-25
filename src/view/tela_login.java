package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import uteis.validarInput;
import javax.swing.JPasswordField;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Component;

public class tela_login {

	private JFrame frame;
	private JTextField input_usuario;
	private JButton btn_entrar;
	private JPasswordField input_senha;
	private JButton btn_sair;
	private JButton btn_cadastrarUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_login window = new tela_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 316, 174);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setTitle("Agenda - JAVA");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programa\u00E7\u00E3o\\Java\\BD - Java\\icones\\motor-de-pesquisa.png"));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel t_usuario = new JLabel("Usu\u00E1rio");
		t_usuario.setForeground(Color.WHITE);
		t_usuario.setBounds(10, 11, 70, 14);
		frame.getContentPane().add(t_usuario);
		
		input_usuario = new JTextField();
		input_usuario.setHorizontalAlignment(SwingConstants.CENTER);
		input_usuario.setBounds(90, 8, 200, 20);
		frame.getContentPane().add(input_usuario);
		input_usuario.setColumns(10);
		
		JLabel t_senha = new JLabel("Senha");
		t_senha.setForeground(Color.WHITE);
		t_senha.setBounds(10, 39, 70, 14);
		frame.getContentPane().add(t_senha);
		
		btn_entrar = new JButton("Entrar");
		btn_entrar.setBounds(90, 70, 89, 23);
		frame.getContentPane().add(btn_entrar);
		
		input_senha = new JPasswordField();
		input_senha.setHorizontalAlignment(SwingConstants.CENTER);
		input_senha.setEchoChar('*');
		input_senha.setBounds(90, 39, 200, 20);
		frame.getContentPane().add(input_senha);
		
		btn_sair = new JButton("Sair");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_sair.setBounds(202, 70, 89, 23);
		frame.getContentPane().add(btn_sair);
		
		btn_cadastrarUsuario = new JButton("Cadastrar Usu\u00E1rio");
		btn_cadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				tela_cadastro.main(null);
			}
		});
		btn_cadastrarUsuario.setBounds(90, 103, 200, 23);
		frame.getContentPane().add(btn_cadastrarUsuario);
		
		JLabel i_logo = new JLabel("New label");
		i_logo.setIcon(new ImageIcon("D:\\Programa\u00E7\u00E3o\\Java\\BD - Java\\icones\\bicho-de-estimacao.png"));
		i_logo.setBounds(13, 61, 62, 62);
		frame.getContentPane().add(i_logo);
	}
}
