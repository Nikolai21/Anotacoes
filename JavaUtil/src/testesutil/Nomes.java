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
	
	/* O m�todo .equals, assim como o m�todo .toString abaixo, est� contido na 
	 * superclasse Object. Para que possam ser utilizadas conforme a regra de neg�cio
	 * precisamos sobreescrever o m�todo na subclasse que possui a necessidade desses
	 * m�todos espec�ficos 
	 */
	
	//compara o argumento com o valor definido do c�digo e retorna um booleano
	@Override
	public boolean equals(Object obj) {
		Nomes nome = (Nomes) obj;
		
		if (this.nome.toString() != nome.toString()) {
			return false;
		}
		return true;
	}
	
	//faz com que seja impresso no console o resultado do c�digo definido no m�todo
	@Override
	public String toString() {
		return this.nome;
	}

}
