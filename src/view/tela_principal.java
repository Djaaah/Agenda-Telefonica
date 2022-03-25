package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.Box;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DebugGraphics;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import java.awt.Canvas;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import java.awt.Scrollbar;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import uteis.mascaras;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class tela_principal {

	private JFrame frame;
	private JTextField input_usuario;
	private JTextField input_celular_proprio;
	private JTextField input_registros_totais;
	private JFormattedTextField input_telefoneFixo1;
	private JFormattedTextField input_telefoneFixo2;
	private JFormattedTextField input_whatsapp1;
	private JFormattedTextField input_whatsapp2;
	private JFormattedTextField input_cep;
	private JTextField input_nomeCompleto;
	private JTextField input_conhecoDe;
	private JTextField input_endereco;
	private JTextField input_bairro;
	private JTextField input_numero;
	private JTextField input_complemento;
	private JTextField id_contato_escolhido_edit;
	private JComboBox input_uf;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_principal window = new tela_principal();
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
	public tela_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 644);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setTitle("Agenda - JAVA");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programa\u00E7\u00E3o\\Java\\BD - Java\\icones\\motor-de-pesquisa.png"));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel del_contato = new JPanel();
		del_contato.setVisible(false);
		
		JPanel edit_contato = new JPanel();
		edit_contato.setBackground(Color.DARK_GRAY);
		edit_contato.setVisible(false);
		
		JPanel adc_contato = new JPanel();
		adc_contato.setVisible(false);
		adc_contato.setLayout(null);
		adc_contato.setToolTipText("");
		adc_contato.setBackground(Color.DARK_GRAY);
		adc_contato.setBounds(10, 135, 616, 468);
		frame.getContentPane().add(adc_contato);
		
		JLabel t_adc_contato = new JLabel("Adicionar Contato");
		t_adc_contato.setBackground(Color.WHITE);
		t_adc_contato.setFont(new Font("Arial", Font.PLAIN, 20));
		t_adc_contato.setHorizontalTextPosition(SwingConstants.CENTER);
		t_adc_contato.setHorizontalAlignment(SwingConstants.CENTER);
		t_adc_contato.setForeground(Color.WHITE);
		t_adc_contato.setBounds(10, 28, 594, 33);
		adc_contato.add(t_adc_contato);
		
		JLabel t_nomeCompleto = new JLabel("Nome Completo");
		t_nomeCompleto.setForeground(Color.WHITE);
		t_nomeCompleto.setHorizontalTextPosition(SwingConstants.CENTER);
		t_nomeCompleto.setHorizontalAlignment(SwingConstants.LEFT);
		t_nomeCompleto.setFont(new Font("Arial", Font.PLAIN, 20));
		t_nomeCompleto.setBounds(20, 83, 152, 24);
		adc_contato.add(t_nomeCompleto);
		
		input_nomeCompleto = new JTextField();
		input_nomeCompleto.setForeground(Color.BLACK);
		input_nomeCompleto.setDisabledTextColor(Color.WHITE);
		input_nomeCompleto.setBackground(Color.WHITE);
		input_nomeCompleto.setFont(new Font("Arial", Font.PLAIN, 15));
		input_nomeCompleto.setColumns(10);
		input_nomeCompleto.setBorder(null);
		input_nomeCompleto.setBounds(20, 112, 293, 24);
		adc_contato.add(input_nomeCompleto);
		
		JLabel t_conhecoDe = new JLabel("Conhe\u00E7o de");
		t_conhecoDe.setForeground(Color.WHITE);
		t_conhecoDe.setHorizontalTextPosition(SwingConstants.CENTER);
		t_conhecoDe.setHorizontalAlignment(SwingConstants.LEFT);
		t_conhecoDe.setFont(new Font("Arial", Font.PLAIN, 20));
		t_conhecoDe.setBounds(323, 83, 152, 24);
		adc_contato.add(t_conhecoDe);
		
		input_conhecoDe = new JTextField();
		input_conhecoDe.setForeground(Color.BLACK);
		input_conhecoDe.setDisabledTextColor(Color.WHITE);
		input_conhecoDe.setBackground(Color.WHITE);
		input_conhecoDe.setFont(new Font("Arial", Font.PLAIN, 15));
		input_conhecoDe.setColumns(10);
		input_conhecoDe.setBorder(null);
		input_conhecoDe.setBounds(323, 112, 261, 24);
		adc_contato.add(input_conhecoDe);
		
		JLabel t_telefone_fixo = new JLabel("Telefone Fixo");
		t_telefone_fixo.setForeground(Color.WHITE);
		t_telefone_fixo.setHorizontalTextPosition(SwingConstants.CENTER);
		t_telefone_fixo.setHorizontalAlignment(SwingConstants.LEFT);
		t_telefone_fixo.setFont(new Font("Arial", Font.PLAIN, 20));
		t_telefone_fixo.setBounds(20, 146, 152, 24);
		adc_contato.add(t_telefone_fixo);
		
		input_telefoneFixo1 = new JFormattedTextField(mascaras.mascaraTelefoneFixo());
		input_telefoneFixo1.setForeground(Color.BLACK);
		input_telefoneFixo1.setDisabledTextColor(Color.WHITE);
		input_telefoneFixo1.setBackground(Color.WHITE);
		input_telefoneFixo1.setFont(new Font("Arial", Font.PLAIN, 15));
		input_telefoneFixo1.setColumns(10);
		input_telefoneFixo1.setBorder(null);
		input_telefoneFixo1.setBounds(20, 175, 152, 24);
		adc_contato.add(input_telefoneFixo1);
		
		input_telefoneFixo2 = new JFormattedTextField(mascaras.mascaraTelefoneFixo());
		input_telefoneFixo2.setForeground(Color.BLACK);
		input_telefoneFixo2.setDisabledTextColor(Color.WHITE);
		input_telefoneFixo2.setBackground(Color.WHITE);
		input_telefoneFixo2.setFont(new Font("Arial", Font.PLAIN, 15));
		input_telefoneFixo2.setColumns(10);
		input_telefoneFixo2.setBorder(null);
		input_telefoneFixo2.setBounds(20, 203, 152, 24);
		adc_contato.add(input_telefoneFixo2);
		
		JLabel t_telefone_celular = new JLabel("Celular");
		t_telefone_celular.setForeground(Color.WHITE);
		t_telefone_celular.setHorizontalTextPosition(SwingConstants.CENTER);
		t_telefone_celular.setHorizontalAlignment(SwingConstants.LEFT);
		t_telefone_celular.setFont(new Font("Arial", Font.PLAIN, 20));
		t_telefone_celular.setBounds(266, 146, 72, 24);
		adc_contato.add(t_telefone_celular);
		
		JRadioButton radio_whatsapp1 = new JRadioButton("\u00C9 Whatsapp ?");
		radio_whatsapp1.setBorder(null);
		radio_whatsapp1.setForeground(Color.WHITE);
		radio_whatsapp1.setFont(new Font("Arial", Font.PLAIN, 20));
		radio_whatsapp1.setBackground(Color.DARK_GRAY);
		radio_whatsapp1.setBounds(424, 175, 160, 24);
		adc_contato.add(radio_whatsapp1);
		
		input_whatsapp1 = new JFormattedTextField(mascaras.mascaraWhatsapp());
		input_whatsapp1.setForeground(Color.BLACK);
		input_whatsapp1.setDisabledTextColor(Color.WHITE);
		input_whatsapp1.setBackground(Color.WHITE);
		input_whatsapp1.setFont(new Font("Arial", Font.PLAIN, 15));
		input_whatsapp1.setColumns(10);
		input_whatsapp1.setBorder(null);
		input_whatsapp1.setAutoscrolls(false);
		input_whatsapp1.setBounds(266, 175, 152, 24);
		adc_contato.add(input_whatsapp1);
		
		JRadioButton radio_whatsapp2 = new JRadioButton("\u00C9 Whatsapp ?");
		radio_whatsapp2.setBorder(null);
		radio_whatsapp2.setForeground(Color.WHITE);
		radio_whatsapp2.setFont(new Font("Arial", Font.PLAIN, 20));
		radio_whatsapp2.setBackground(Color.DARK_GRAY);
		radio_whatsapp2.setBounds(424, 203, 160, 24);
		adc_contato.add(radio_whatsapp2);
		
		input_whatsapp2 = new JFormattedTextField(mascaras.mascaraWhatsapp());
		input_whatsapp2.setForeground(Color.BLACK);
		input_whatsapp2.setDisabledTextColor(Color.WHITE);
		input_whatsapp2.setBackground(Color.WHITE);
		input_whatsapp2.setFont(new Font("Arial", Font.PLAIN, 15));
		input_whatsapp2.setColumns(10);
		input_whatsapp2.setBorder(null);
		input_whatsapp2.setBounds(266, 203, 152, 24);
		adc_contato.add(input_whatsapp2);
		
		JLabel t_endereco = new JLabel("Endere\u00E7o");
		t_endereco.setForeground(Color.WHITE);
		t_endereco.setHorizontalTextPosition(SwingConstants.CENTER);
		t_endereco.setHorizontalAlignment(SwingConstants.LEFT);
		t_endereco.setFont(new Font("Arial", Font.PLAIN, 20));
		t_endereco.setBounds(20, 237, 152, 24);
		adc_contato.add(t_endereco);
		
		input_endereco = new JTextField();
		input_endereco.setForeground(Color.BLACK);
		input_endereco.setDisabledTextColor(Color.WHITE);
		input_endereco.setBackground(Color.WHITE);
		input_endereco.setFont(new Font("Arial", Font.PLAIN, 15));
		input_endereco.setColumns(10);
		input_endereco.setBorder(null);
		input_endereco.setBounds(20, 266, 293, 24);
		adc_contato.add(input_endereco);
		
		JLabel t_bairro = new JLabel("Bairro");
		t_bairro.setForeground(Color.WHITE);
		t_bairro.setHorizontalTextPosition(SwingConstants.CENTER);
		t_bairro.setHorizontalAlignment(SwingConstants.LEFT);
		t_bairro.setFont(new Font("Arial", Font.PLAIN, 20));
		t_bairro.setBounds(318, 237, 130, 24);
		adc_contato.add(t_bairro);
		
		input_bairro = new JTextField();
		input_bairro.setForeground(Color.BLACK);
		input_bairro.setDisabledTextColor(Color.WHITE);
		input_bairro.setBackground(Color.WHITE);
		input_bairro.setFont(new Font("Arial", Font.PLAIN, 15));
		input_bairro.setColumns(10);
		input_bairro.setBorder(null);
		input_bairro.setBounds(318, 266, 130, 24);
		adc_contato.add(input_bairro);
		
		JLabel t_numero = new JLabel("N\u00FAmero");
		t_numero.setForeground(Color.WHITE);
		t_numero.setHorizontalTextPosition(SwingConstants.CENTER);
		t_numero.setHorizontalAlignment(SwingConstants.LEFT);
		t_numero.setFont(new Font("Arial", Font.PLAIN, 20));
		t_numero.setBounds(454, 237, 130, 24);
		adc_contato.add(t_numero);
		
		input_numero = new JTextField();
		input_numero.setForeground(Color.BLACK);
		input_numero.setDisabledTextColor(Color.WHITE);
		input_numero.setBackground(Color.WHITE);
		input_numero.setFont(new Font("Arial", Font.PLAIN, 15));
		input_numero.setColumns(10);
		input_numero.setBorder(null);
		input_numero.setBounds(454, 266, 130, 24);
		adc_contato.add(input_numero);
		
		JLabel t_cep = new JLabel("CEP");
		t_cep.setForeground(Color.WHITE);
		t_cep.setHorizontalTextPosition(SwingConstants.CENTER);
		t_cep.setHorizontalAlignment(SwingConstants.LEFT);
		t_cep.setFont(new Font("Arial", Font.PLAIN, 20));
		t_cep.setBounds(454, 310, 130, 24);
		adc_contato.add(t_cep);
		
		input_cep = new JFormattedTextField(mascaras.mascaraCep());
		input_cep.setForeground(Color.BLACK);
		input_cep.setDisabledTextColor(Color.WHITE);
		input_cep.setBackground(Color.WHITE);
		input_cep.setFont(new Font("Arial", Font.PLAIN, 15));
		input_cep.setColumns(10);
		input_cep.setBorder(null);
		input_cep.setBounds(454, 339, 130, 24);
		adc_contato.add(input_cep);
		
		JLabel t_complemento = new JLabel("Complemento");
		t_complemento.setForeground(Color.WHITE);
		t_complemento.setHorizontalTextPosition(SwingConstants.CENTER);
		t_complemento.setHorizontalAlignment(SwingConstants.LEFT);
		t_complemento.setFont(new Font("Arial", Font.PLAIN, 20));
		t_complemento.setBounds(20, 310, 152, 24);
		adc_contato.add(t_complemento);
		
		input_complemento = new JTextField();
		input_complemento.setForeground(Color.BLACK);
		input_complemento.setDisabledTextColor(Color.WHITE);
		input_complemento.setBackground(Color.WHITE);
		input_complemento.setFont(new Font("Arial", Font.PLAIN, 15));
		input_complemento.setColumns(10);
		input_complemento.setBorder(null);
		input_complemento.setBounds(20, 339, 371, 24);
		adc_contato.add(input_complemento);
		
		JButton btn_salvar_novoContato = new JButton("Salvar Contato");
		
		btn_salvar_novoContato.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_salvar_novoContato.setBounds(10, 386, 584, 33);
		adc_contato.add(btn_salvar_novoContato);
		
		JButton btn_limpar_campos = new JButton("Limpar Campos");
		btn_limpar_campos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_endereco.setText(""); input_bairro.setText(""); input_cep.setValue(null); input_complemento.setText(""); input_numero.setText(""); input_uf.setSelectedIndex(0);
				input_nomeCompleto.setText(""); input_conhecoDe.setText("");
				input_whatsapp1.setValue(null); input_whatsapp2.setValue(null); 
				radio_whatsapp1.setSelected(false); radio_whatsapp2.setSelected(false);
				input_telefoneFixo1.setValue(null); input_telefoneFixo2.setValue(null);
			}
		});
		btn_limpar_campos.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_limpar_campos.setBounds(10, 425, 584, 33);
		adc_contato.add(btn_limpar_campos);
		
		JLabel t_uf = new JLabel("UF");
		t_uf.setForeground(Color.WHITE);
		t_uf.setFont(new Font("Arial", Font.PLAIN, 16));
		t_uf.setBounds(395, 318, 46, 24);
		adc_contato.add(t_uf);
		
		input_uf = new JComboBox();
		input_uf.setModel(new DefaultComboBoxModel(new String[] {"RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF"}));
		input_uf.setSelectedIndex(0);
		input_uf.setFont(new Font("Arial", Font.PLAIN, 15));
		input_uf.setBounds(395, 339, 53, 24);
		adc_contato.add(input_uf);
		edit_contato.setLayout(null);
		edit_contato.setBounds(10, 135, 616, 468);
		frame.getContentPane().add(edit_contato);
		
		JLabel t_edit_contato = new JLabel("Editar Contato");
		t_edit_contato.setHorizontalTextPosition(SwingConstants.CENTER);
		t_edit_contato.setHorizontalAlignment(SwingConstants.CENTER);
		t_edit_contato.setForeground(Color.WHITE);
		t_edit_contato.setFont(new Font("Arial", Font.PLAIN, 20));
		t_edit_contato.setBackground(Color.WHITE);
		t_edit_contato.setBounds(10, 28, 594, 33);
		edit_contato.add(t_edit_contato);
		
		JPanel escolher_contato_edit = new JPanel();
		escolher_contato_edit.setBackground(Color.DARK_GRAY);
		escolher_contato_edit.setBounds(10, 75, 595, 383);
		edit_contato.add(escolher_contato_edit);
		escolher_contato_edit.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setBounds(10, 53, 575, 320);
		escolher_contato_edit.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 10, 32, 33);
		escolher_contato_edit.add(lblNewLabel);
		
		id_contato_escolhido_edit = new JTextField();
		id_contato_escolhido_edit.setFont(new Font("Arial", Font.PLAIN, 15));
		id_contato_escolhido_edit.setBorder(null);
		id_contato_escolhido_edit.setBounds(157, 13, 123, 25);
		escolher_contato_edit.add(id_contato_escolhido_edit);
		id_contato_escolhido_edit.setColumns(10);
		
		JButton btn_contato_escolhido = new JButton("Pesquisar Contato");
		btn_contato_escolhido.setBackground(Color.BLUE);
		btn_contato_escolhido.setForeground(Color.WHITE);
		btn_contato_escolhido.setFont(new Font("Arial", Font.PLAIN, 15));
		btn_contato_escolhido.setBounds(290, 13, 188, 25);
		escolher_contato_edit.add(btn_contato_escolhido);
		del_contato.setLayout(null);
		del_contato.setBounds(10, 135, 616, 468);
		frame.getContentPane().add(del_contato);
		
		JLabel t_del_contato = new JLabel("Deletar Contato");
		t_del_contato.setHorizontalTextPosition(SwingConstants.CENTER);
		t_del_contato.setHorizontalAlignment(SwingConstants.CENTER);
		t_del_contato.setForeground(Color.BLACK);
		t_del_contato.setFont(new Font("Arial", Font.PLAIN, 20));
		t_del_contato.setBackground(Color.WHITE);
		t_del_contato.setBounds(10, 28, 594, 33);
		del_contato.add(t_del_contato);
		
		JPanel ver_contato = new JPanel();
		ver_contato.setVisible(false);
		ver_contato.setBounds(10, 135, 616, 468);
		frame.getContentPane().add(ver_contato);
		ver_contato.setLayout(null);
		
		JLabel t_ver_contato = new JLabel("Contatos Salvos");
		t_ver_contato.setHorizontalTextPosition(SwingConstants.CENTER);
		t_ver_contato.setHorizontalAlignment(SwingConstants.CENTER);
		t_ver_contato.setForeground(Color.BLACK);
		t_ver_contato.setFont(new Font("Arial", Font.PLAIN, 20));
		t_ver_contato.setBackground(Color.WHITE);
		t_ver_contato.setBounds(10, 28, 594, 33);
		ver_contato.add(t_ver_contato);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 120, 616, 5);
		frame.getContentPane().add(separator_1);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		
		JToolBar menuPrincipal = new JToolBar();
		menuPrincipal.setBounds(10, 10, 616, 100);
		menuPrincipal.setFloatable(false);
		frame.getContentPane().add(menuPrincipal);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(new Rectangle(0, 0, 10, 0));
		horizontalStrut_1.setMaximumSize(new Dimension(10, 32767));
		horizontalStrut_1.setMinimumSize(new Dimension(10, 0));
		menuPrincipal.add(horizontalStrut_1);
		
		JButton btn_adc_contato = new JButton("");
		btn_adc_contato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (adc_contato.isVisible()) {
					adc_contato.setVisible(false);
					input_endereco.setText(""); input_bairro.setText(""); input_cep.setValue(null); input_complemento.setText(""); input_numero.setText(""); input_uf.setSelectedIndex(0);
					input_nomeCompleto.setText(""); input_conhecoDe.setText("");
					input_whatsapp1.setValue(null); input_whatsapp2.setValue(null); 
					radio_whatsapp1.setSelected(false); radio_whatsapp2.setSelected(false);
					input_telefoneFixo1.setValue(null); input_telefoneFixo2.setValue(null);
				} else {
					adc_contato.setVisible(true);
					edit_contato.setVisible(false);
					del_contato.setVisible(false);
					ver_contato.setVisible(false);
				}
				
			}
		});
		btn_adc_contato.setToolTipText("Novo Contato");
		btn_adc_contato.setIcon(new ImageIcon("D:\\Programa\u00E7\u00E3o\\Java\\Agenda-Telefonica\\icones\\adicionar-contato.png"));
		menuPrincipal.add(btn_adc_contato);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		menuPrincipal.add(horizontalStrut);
		
		JButton btn_edit_contato = new JButton("");
		btn_edit_contato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (edit_contato.isVisible()) {
					edit_contato.setVisible(false);
				} else {
					edit_contato.setVisible(true);
					adc_contato.setVisible(false);
					del_contato.setVisible(false);
					ver_contato.setVisible(false);
				}
			}
		});
		btn_edit_contato.setIcon(new ImageIcon("D:\\Programa\u00E7\u00E3o\\Java\\Agenda-Telefonica\\icones\\forma.png"));
		btn_edit_contato.setToolTipText("Editar Contato");
		menuPrincipal.add(btn_edit_contato);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		menuPrincipal.add(horizontalStrut_2);
		
		JButton btn_contatos_salvos = new JButton("");
		btn_contatos_salvos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ver_contato.isVisible()) {
					ver_contato.setVisible(false);
				} else {
					ver_contato.setVisible(true);
					adc_contato.setVisible(false);
					edit_contato.setVisible(false);
					del_contato.setVisible(false);			
				}
			}
		});
		btn_contatos_salvos.setIcon(new ImageIcon("D:\\Programa\u00E7\u00E3o\\Java\\Agenda-Telefonica\\icones\\agenda.png"));
		btn_contatos_salvos.setToolTipText("Contatos Salvos");
		menuPrincipal.add(btn_contatos_salvos);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		menuPrincipal.add(horizontalStrut_3);
		
		JButton btn_del_contato = new JButton("");
		btn_del_contato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (del_contato.isVisible()) {
					del_contato.setVisible(false);
				} else {
					del_contato.setVisible(true);
					adc_contato.setVisible(false);
					edit_contato.setVisible(false);
					ver_contato.setVisible(false);
				}
			}
		});
		btn_del_contato.setIcon(new ImageIcon("D:\\Programa\u00E7\u00E3o\\Java\\Agenda-Telefonica\\icones\\ligar.png"));
		btn_del_contato.setToolTipText("Excluir Contatos");
		menuPrincipal.add(btn_del_contato);
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setMinimumSize(new Dimension(10, 0));
		horizontalStrut_1_1.setMaximumSize(new Dimension(10, 32767));
		horizontalStrut_1_1.setBounds(new Rectangle(0, 0, 10, 0));
		menuPrincipal.add(horizontalStrut_1_1);
		
		JPanel dados_utilizador = new JPanel();
		menuPrincipal.add(dados_utilizador);
		dados_utilizador.setLayout(null);
		
		JLabel t_usuario = new JLabel("Usuario");
		t_usuario.setBounds(10, 11, 92, 19);
		dados_utilizador.add(t_usuario);
		t_usuario.setFont(new Font("Arial", Font.PLAIN, 16));
		
		input_usuario = new JTextField();
		input_usuario.setBounds(74, 13, 114, 19);
		dados_utilizador.add(input_usuario);
		input_usuario.setHorizontalAlignment(SwingConstants.CENTER);
		input_usuario.setEditable(false);
		input_usuario.setColumns(10);
		
		JLabel t_contatos_salvos = new JLabel("Contatos Salvos");
		t_contatos_salvos.setBounds(10, 40, 114, 19);
		dados_utilizador.add(t_contatos_salvos);
		t_contatos_salvos.setFont(new Font("Arial", Font.PLAIN, 16));
		
		input_registros_totais = new JTextField();
		input_registros_totais.setBounds(134, 40, 54, 19);
		dados_utilizador.add(input_registros_totais);
		input_registros_totais.setEditable(false);
		input_registros_totais.setHorizontalAlignment(SwingConstants.CENTER);
		input_registros_totais.setColumns(10);
		
		input_celular_proprio = new JTextField();
		input_celular_proprio.setBounds(74, 69, 114, 19);
		dados_utilizador.add(input_celular_proprio);
		input_celular_proprio.setEditable(false);
		input_celular_proprio.setColumns(10);
		
		JLabel tp_contato = new JLabel("Celular");
		tp_contato.setBounds(10, 69, 60, 19);
		dados_utilizador.add(tp_contato);
		tp_contato.setFont(new Font("Arial", Font.PLAIN, 16));
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
