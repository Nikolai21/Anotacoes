package serializacao;

public class Cachorro extends Animais {

	private static final long serialVersionUID = 1;

	public Cachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	public void latir() {
		System.out.println("AuAuAuAu!");
	}

}
