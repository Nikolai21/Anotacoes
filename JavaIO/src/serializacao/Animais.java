package serializacao;

import java.io.Serializable;

public class Animais implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	
	public Animais(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public static long getSerial() {
		return serialVersionUID;
	}
	
	public static int getHash() {
		return Animais.class.hashCode();
	}

}
