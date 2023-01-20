package teste;

public class Teste {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrarNome(String n) {
		this.setNome(n);
	}
	
	public void status() {
		System.out.println("Hello World, " + this.nome);
	}
}
