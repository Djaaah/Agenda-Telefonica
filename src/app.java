import view.tela_login;

import java.sql.*;

import model.conexaoBanco;



public class app {
	public static void main(String[] args) {
		//Iniciar o Projeto
		tela_login.main(args);
		
		System.out.println(conexaoBanco.conectar());
		
		}
}
