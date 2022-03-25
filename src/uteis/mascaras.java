package uteis;

import javax.swing.text.MaskFormatter;

public class mascaras {

	
	public static MaskFormatter mascaraCep() {
		MaskFormatter mascaraCep = null;
		try {	
			mascaraCep = new MaskFormatter("##.###-###");
		} catch (Exception e) {
			System.out.println(e);
		}
		mascaraCep.setPlaceholderCharacter('_');
		return mascaraCep;
	}
	
	public static MaskFormatter mascaraTelefoneFixo() {
		MaskFormatter mascaraTelefoneFixo = null;
		try {	
			mascaraTelefoneFixo = new MaskFormatter("(##) ####-####");
		} catch (Exception e) {
			System.out.println(e);
		}
		mascaraTelefoneFixo.setPlaceholderCharacter('_');
		return mascaraTelefoneFixo;
	}
	
	
	public static MaskFormatter mascaraWhatsapp() {
		MaskFormatter mascaraWhatsapp = null;
		try {	
			mascaraWhatsapp = new MaskFormatter("(##)# ####-####");
		} catch (Exception e) {
			System.out.println(e);
		}
		mascaraWhatsapp.setPlaceholderCharacter('_');
		
		return mascaraWhatsapp;
	}
	
	public static MaskFormatter mascaraNascimento() {
		MaskFormatter mascaraNascimento = null;
		try {	
			mascaraNascimento = new MaskFormatter("##/##/####");
		} catch (Exception e) {
			System.out.println(e);
		}
		mascaraNascimento.setPlaceholderCharacter('_');
		
		return mascaraNascimento;
	}
	
	public static MaskFormatter mascaraCpf() {
		MaskFormatter mascaraCpf = null;
		try {	
		mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return mascaraCpf;
	}
	
	
}
