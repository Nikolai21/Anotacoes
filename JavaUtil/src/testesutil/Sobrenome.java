package testesutil;

public class Sobrenome extends Nomes {
	
	private String sobrenome;
	
	public Sobrenome (String nome, String sobrenome) {
		super(nome);
		setSobrenome(sobrenome);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto () {
		return super.getNome() + " " + sobrenome;
	}
}
