package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;
import uteis.validarInput;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import uteis.mascaras;

public class tela_cadastro {

	private JFrame frame;
	private JTextField input_novo_usuario;
	private JPasswordField input_nova_senha;
	private JComboBox input_novo_sexo;
	private JComboBox input_uf;
	private JTextField input_endereco;
	private JTextField input_numero;
	private JTextField input_complemento;
	private JFormattedTextField input_bairro;
	private JTextField input_email;
	private JTextField input_novo_nome;
	private JTextField input_novo_sobrenome;
	private JFormattedTextField input_novo_cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_cadastro window = new tela_cadastro();
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
	public tela_cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 16));
		frame.setResizable(false);
		frame.setBounds(100, 100, 520, 562);
		frame.setTitle("Agenda - JAVA");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programa\u00E7\u00E3o\\Java\\BD - Java\\icones\\motor-de-pesquisa.png"));
		frame.setLocationRelativeTo(null);
		
		JLabel t_novo_usuario = new JLabel("Usu\u00E1rio");
		t_novo_usuario.setForeground(Color.WHITE);
		t_novo_usuario.setBounds(22, 76, 87, 24);
		t_novo_usuario.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel t_nova_senha = new JLabel("Senha");
		t_nova_senha.setForeground(Color.WHITE);
		t_nova_senha.setBounds(182, 76, 87, 24);
		t_nova_senha.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel t_novo_sexo = new JLabel("Sexo");
		t_novo_sexo.setForeground(Color.WHITE);
		t_novo_sexo.setBounds(341, 76, 87, 24);
		t_novo_sexo.setFont(new Font("Arial", Font.PLAIN, 16));
		
		input_novo_usuario = new JTextField();
		input_novo_usuario.setBorder(null);
		input_novo_usuario.setBounds(22, 98, 150, 30);
		input_novo_usuario.setFont(new Font("Arial", Font.PLAIN, 16));
		input_novo_usuario.setColumns(10);
		
		input_nova_senha = new JPasswordField();
		input_nova_senha.setBorder(null);
		input_nova_senha.setBounds(181, 98, 150, 30);
		input_nova_senha.setEchoChar('*');
		input_nova_senha.setFont(new Font("Arial", Font.PLAIN, 16));
		input_nova_senha.setColumns(10);
		
		input_novo_sexo = new JComboBox();
		input_novo_sexo.setBounds(341, 97, 150, 30);
		input_novo_sexo.setFont(new Font("Arial", Font.PLAIN, 16));
		input_novo_sexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Não Informar"}));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(t_novo_usuario);
		frame.getContentPane().add(t_nova_senha);
		frame.getContentPane().add(t_novo_sexo);
		frame.getContentPane().add(input_novo_usuario);
		frame.getContentPane().add(input_nova_senha);
		frame.getContentPane().add(input_novo_sexo);
		
		JLabel t_endereco = new JLabel("Endere\u00E7o");
		t_endereco.setForeground(Color.WHITE);
		t_endereco.setFont(new Font("Arial", Font.PLAIN, 16));
		t_endereco.setBounds(22, 138, 87, 24);
		frame.getContentPane().add(t_endereco);
		
		input_endereco = new JTextField();
		input_endereco.setBorder(null);
		input_endereco.setFont(new Font("Arial", Font.PLAIN, 16));
		input_endereco.setColumns(10);
		input_endereco.setBounds(22, 160, 309, 30);
		frame.getContentPane().add(input_endereco);
		
		JLabel t_numero = new JLabel("N\u00FAmero");
		t_numero.setForeground(Color.WHITE);
		t_numero.setFont(new Font("Arial", Font.PLAIN, 16));
		t_numero.setBounds(341, 138, 87, 24);
		frame.getContentPane().add(t_numero);
		
		input_numero = new JTextField();
		input_numero.setBorder(null);
		input_numero.setFont(new Font("Arial", Font.PLAIN, 16));
		input_numero.setColumns(10);
		input_numero.setBounds(341, 160, 150, 30);
		frame.getContentPane().add(input_numero);
		
		JLabel t_complemento = new JLabel("Complemento");
		t_complemento.setForeground(Color.WHITE);
		t_complemento.setFont(new Font("Arial", Font.PLAIN, 16));
		t_complemento.setBounds(22, 200, 111, 24);
		frame.getContentPane().add(t_complemento);
		
		input_complemento = new JTextField();
		input_complemento.setBorder(null);
		input_complemento.setFont(new Font("Arial", Font.PLAIN, 16));
		input_complemento.setColumns(10);
		input_complemento.setBounds(22, 224, 309, 30);
		frame.getContentPane().add(input_complemento);
		
		input_bairro = new JFormattedTextField();
		input_bairro.setBorder(null);
		input_bairro.setName("Bairro\r\n");
		input_bairro.setFont(new Font("Arial", Font.PLAIN, 16));
		input_bairro.setColumns(10);
		input_bairro.setBounds(341, 224, 150, 30);
		frame.getContentPane().add(input_bairro);
		
		JLabel t_bairro = new JLabel("Bairro");
		t_bairro.setForeground(Color.WHITE);
		t_bairro.setFont(new Font("Arial", Font.PLAIN, 16));
		t_bairro.setBounds(341, 200, 87, 24);
		frame.getContentPane().add(t_bairro);
		
		JLabel t_cep = new JLabel("CEP");
		t_cep.setForeground(Color.WHITE);
		t_cep.setFont(new Font("Arial", Font.PLAIN, 16));
		t_cep.setBounds(22, 264, 111, 24);
		frame.getContentPane().add(t_cep);
		
		JFormattedTextField input_cep = new JFormattedTextField(mascaras.mascaraCep());
		input_cep.setBorder(null);
		input_cep.setName("");
		input_cep.setFont(new Font("Arial", Font.PLAIN, 16));
		input_cep.setColumns(10);
		input_cep.setBounds(22, 285, 150, 30);
		frame.getContentPane().add(input_cep);
		
		JButton btn_buscar_cep = new JButton("Buscar");
		btn_buscar_cep.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_buscar_cep.setBounds(182, 285, 87, 30);
		frame.getContentPane().add(btn_buscar_cep);
		
		JLabel t_telefone = new JLabel("Celular");
		t_telefone.setForeground(Color.WHITE);
		t_telefone.setFont(new Font("Arial", Font.PLAIN, 16));
		t_telefone.setBounds(341, 264, 111, 24);
		frame.getContentPane().add(t_telefone);
		
		JFormattedTextField input_telefone = new JFormattedTextField(mascaras.mascaraWhatsapp());
		input_telefone.setBorder(null);
		input_telefone.setName("");
		input_telefone.setFont(new Font("Arial", Font.PLAIN, 16));
		input_telefone.setColumns(10);
		input_telefone.setBounds(341, 285, 150, 30);
		frame.getContentPane().add(input_telefone);
		
		JButton btn_cadastrar = new JButton("Cadastrar novo usuario");
		btn_cadastrar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_cadastrar.setBounds(22, 471, 200, 30);
		frame.getContentPane().add(btn_cadastrar);
		
		JFormattedTextField input_nascimento = new JFormattedTextField(mascaras.mascaraNascimento());
		input_nascimento.setBorder(null);
		input_nascimento.setName("");
		input_nascimento.setFont(new Font("Arial", Font.PLAIN, 16));
		input_nascimento.setColumns(10);
		input_nascimento.setBounds(22, 353, 150, 30);
		frame.getContentPane().add(input_nascimento);
		
		JLabel t_nascimento = new JLabel("Data de Nascimento");
		t_nascimento.setForeground(Color.WHITE);
		t_nascimento.setFont(new Font("Arial", Font.PLAIN, 16));
		t_nascimento.setBounds(22, 326, 150, 24);
		frame.getContentPane().add(t_nascimento);
		
		JLabel t_email = new JLabel("E-mail");
		t_email.setForeground(Color.WHITE);
		t_email.setFont(new Font("Arial", Font.PLAIN, 16));
		t_email.setBounds(182, 326, 150, 24);
		frame.getContentPane().add(t_email);
		
		input_email = new JTextField();
		input_email.setBorder(null);
		t_email.setLabelFor(input_email);
		input_email.setFont(new Font("Arial", Font.PLAIN, 16));
		input_email.setColumns(10);
		input_email.setBounds(182, 353, 309, 30);
		frame.getContentPane().add(input_email);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				tela_login.main(null);
			}
		});
		btn_cancelar.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_cancelar.setBounds(291, 471, 200, 30);
		frame.getContentPane().add(btn_cancelar);
		
		JLabel t_novo_nome = new JLabel("Nome");
		t_novo_nome.setForeground(Color.WHITE);
		t_novo_nome.setFont(new Font("Arial", Font.PLAIN, 16));
		t_novo_nome.setBounds(22, 11, 87, 24);
		frame.getContentPane().add(t_novo_nome);
		
		input_novo_nome = new JTextField();
		input_novo_nome.setBorder(null);
		input_novo_nome.setFont(new Font("Arial", Font.PLAIN, 16));
		input_novo_nome.setColumns(10);
		input_novo_nome.setBounds(22, 36, 220, 30);
		frame.getContentPane().add(input_novo_nome);
		
		JLabel t_novo_sobrenome = new JLabel("Sobrenome");
		t_novo_sobrenome.setForeground(Color.WHITE);
		t_novo_sobrenome.setFont(new Font("Arial", Font.PLAIN, 16));
		t_novo_sobrenome.setBounds(252, 11, 87, 24);
		frame.getContentPane().add(t_novo_sobrenome);
		
		input_novo_sobrenome = new JTextField();
		input_novo_sobrenome.setBorder(null);
		input_novo_sobrenome.setFont(new Font("Arial", Font.PLAIN, 16));
		input_novo_sobrenome.setColumns(10);
		input_novo_sobrenome.setBounds(252, 36, 239, 30);
		frame.getContentPane().add(input_novo_sobrenome);
		
		JLabel t_obrigatório = new JLabel("*");
		t_obrigatório.setForeground(Color.RED);
		t_obrigatório.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório.setBounds(72, 81, 22, 14);
		frame.getContentPane().add(t_obrigatório);
		
		JLabel t_obrigatório_1 = new JLabel("*");
		t_obrigatório_1.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_1.setForeground(Color.RED);
		t_obrigatório_1.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_1.setBounds(59, 12, 22, 14);
		frame.getContentPane().add(t_obrigatório_1);
		
		JLabel t_obrigatório_2 = new JLabel("*");
		t_obrigatório_2.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_2.setForeground(Color.RED);
		t_obrigatório_2.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_2.setBounds(331, 11, 22, 14);
		frame.getContentPane().add(t_obrigatório_2);
		
		JLabel t_obrigatório_3 = new JLabel("*");
		t_obrigatório_3.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_3.setForeground(Color.RED);
		t_obrigatório_3.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_3.setBounds(223, 76, 22, 14);
		frame.getContentPane().add(t_obrigatório_3);
		
		JLabel t_obrigatório_4 = new JLabel("*");
		t_obrigatório_4.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_4.setForeground(Color.RED);
		t_obrigatório_4.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_4.setBounds(374, 76, 22, 14);
		frame.getContentPane().add(t_obrigatório_4);
		
		JLabel t_obrigatório_5 = new JLabel("*");
		t_obrigatório_5.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_5.setForeground(Color.RED);
		t_obrigatório_5.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_5.setBounds(87, 138, 22, 14);
		frame.getContentPane().add(t_obrigatório_5);
		
		JLabel t_obrigatório_6 = new JLabel("*");
		t_obrigatório_6.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_6.setForeground(Color.RED);
		t_obrigatório_6.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_6.setBounds(390, 137, 22, 14);
		frame.getContentPane().add(t_obrigatório_6);
		
		JLabel t_obrigatório_7 = new JLabel("*");
		t_obrigatório_7.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_7.setForeground(Color.RED);
		t_obrigatório_7.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_7.setBounds(380, 200, 22, 14);
		frame.getContentPane().add(t_obrigatório_7);
		
		JLabel t_obrigatório_8 = new JLabel("*");
		t_obrigatório_8.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_8.setForeground(Color.RED);
		t_obrigatório_8.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_8.setBounds(59, 261, 22, 14);
		frame.getContentPane().add(t_obrigatório_8);
		
		JLabel t_obrigatório_9 = new JLabel("*");
		t_obrigatório_9.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_9.setForeground(Color.RED);
		t_obrigatório_9.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_9.setBounds(390, 264, 22, 14);
		frame.getContentPane().add(t_obrigatório_9);
		
		JLabel t_obrigatório_10 = new JLabel("*");
		t_obrigatório_10.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_10.setForeground(Color.RED);
		t_obrigatório_10.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_10.setBounds(162, 325, 22, 14);
		frame.getContentPane().add(t_obrigatório_10);
		
		JLabel t_obrigatório_11 = new JLabel("*");
		t_obrigatório_11.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_11.setForeground(Color.RED);
		t_obrigatório_11.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_11.setBounds(220, 325, 22, 14);
		frame.getContentPane().add(t_obrigatório_11);
		
		JLabel t_cpf = new JLabel("CPF");
		t_cpf.setForeground(Color.WHITE);
		t_cpf.setFont(new Font("Arial", Font.PLAIN, 16));
		t_cpf.setBounds(22, 394, 45, 24);
		frame.getContentPane().add(t_cpf);
		
		JLabel t_obrigatório_10_1 = new JLabel("*");
		t_obrigatório_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_10_1.setForeground(Color.RED);
		t_obrigatório_10_1.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_10_1.setBounds(59, 393, 22, 14);
		frame.getContentPane().add(t_obrigatório_10_1);
	
		input_novo_cpf = new JFormattedTextField(mascaras.mascaraCpf());
		input_novo_cpf.setBorder(null);
		input_novo_cpf.setFont(new Font("Arial", Font.PLAIN, 16));
		input_novo_cpf.setColumns(10);
		input_novo_cpf.setBounds(22, 417, 200, 30);
		frame.getContentPane().add(input_novo_cpf);
		
		JLabel t_profissao = new JLabel("Profiss\u00E3o");
		t_profissao.setForeground(Color.WHITE);
		t_profissao.setFont(new Font("Arial", Font.PLAIN, 16));
		t_profissao.setBounds(234, 393, 81, 24);
		frame.getContentPane().add(t_profissao);
		
		JComboBox input_nova_profissao = new JComboBox();
		input_nova_profissao.setModel(new DefaultComboBoxModel(new String[] {"Desempregado", "Estudante", "Professor", "Programador", "BioM\u00E9dica", "M\u00E9dico", "Veterin\u00E1rio", "Estoquista", "Caixa", "Servidor Publico", "Outros"}));
		input_nova_profissao.setFont(new Font("Arial", Font.PLAIN, 16));
		input_nova_profissao.setBounds(232, 417, 259, 30);
		frame.getContentPane().add(input_nova_profissao);
		
		JLabel t_obrigatório_10_1_1 = new JLabel("*");
		t_obrigatório_10_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_10_1_1.setForeground(Color.RED);
		t_obrigatório_10_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_10_1_1.setBounds(297, 390, 22, 14);
		frame.getContentPane().add(t_obrigatório_10_1_1);
		
		JLabel t_obrigatório_8_1 = new JLabel("*");
		t_obrigatório_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		t_obrigatório_8_1.setForeground(Color.RED);
		t_obrigatório_8_1.setFont(new Font("Arial", Font.PLAIN, 18));
		t_obrigatório_8_1.setBounds(306, 261, 9, 14);
		frame.getContentPane().add(t_obrigatório_8_1);
		
		JLabel t_uf = new JLabel("UF");
		t_uf.setForeground(Color.WHITE);
		t_uf.setFont(new Font("Arial", Font.PLAIN, 16));
		t_uf.setBounds(278, 264, 46, 24);
		frame.getContentPane().add(t_uf);
		
		input_uf = new JComboBox();
		input_uf.setFont(new Font("Arial", Font.PLAIN, 15));
		input_uf.setModel(new DefaultComboBoxModel(new String[] {"RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF"}));
		input_uf.setBounds(278, 285, 53, 30);
		frame.getContentPane().add(input_uf);
	}
}
