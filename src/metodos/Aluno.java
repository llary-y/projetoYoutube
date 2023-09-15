package metodos;

public class Aluno extends Pessoa {

	private String login;
	private int totalAssistido;
	
	public void viuMaisUm() {
		this.totalAssistido = totalAssistido + 1;
	}
	
	public Aluno(String nome, int idade, String sexo, int experiencia, 
			String login) {
		super(nome, idade, sexo, experiencia);
		this.login = login;
		this.totalAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	@Override
	public String toString() {
		return "Aluno {\n " + super.toString() 
			+ "\n login=" + login 
			+ "\n totalAssistido=" + totalAssistido + "]";
	}
	
	
	
}
