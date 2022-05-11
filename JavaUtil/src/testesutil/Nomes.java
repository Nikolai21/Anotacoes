package testesutil;

public class Nomes {
	
	private String nome;
	
	public Nomes() {}
	
	public Nomes(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/* O método .equals, assim como o método .toString abaixo, está contido na 
	 * superclasse Object. Para que possam ser utilizadas conforme a regra de negócio
	 * precisamos sobreescrever o método na subclasse que possui a necessidade desses
	 * métodos específicos 
	 */
	
	//compara o argumento com o valor definido do código e retorna um booleano
	@Override
	public boolean equals(Object obj) {
		Nomes nome = (Nomes) obj;
		
		if (this.nome.toString() != nome.toString()) {
			return false;
		}
		return true;
	}
	
	//faz com que seja impresso no console o resultado do código definido no método
	@Override
	public String toString() {
		return this.nome;
	}

}
