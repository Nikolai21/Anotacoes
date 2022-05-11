package testesutil;

public class GuardadorDeObjetos {
	
	private int tamanhoInicial;
	private Object[] guardador;
	private int contadorPosicao;
	
	public GuardadorDeObjetos (int tamanhoInicial) {
		this.tamanhoInicial = tamanhoInicial;
		this.guardador = new Object[this.tamanhoInicial];
	}
	
	public void setObjeto(Object ref) {
		guardador[contadorPosicao] = ref;
		this.contadorPosicao += 1;
	}
	
	public Object getObjeto(int posicao) {
		return guardador[posicao];
	}
	
	public int getTamanhoGuardador () {
		return guardador.length;
	}
	
}
