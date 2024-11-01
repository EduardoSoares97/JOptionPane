package cursoJava;

import javax.swing.JOptionPane;

public class primeiraClasseJava {
	
	public static void main(String[] args) {
	
	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero;
	
	int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");
	
	if(resposta == 0) {
	
		JOptionPane.showInputDialog(null, "Divisao de pessoas deu " + divisao); 
	}
	
	resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao?");
	
	if(resposta == 0) {
		
		JOptionPane.showInputDialog(null, "sobrou " + resto + " carros"); 
		
		}
	}
}
