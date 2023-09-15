package metodos;

public class Pessoa {
	String nome;
	int idade;
	String sexo;
	int experiencia;
	
	public void ganharExp() {
		this.experiencia = experiencia + 1;
	}

	public Pessoa(String nome, int idade, String sexo, int experiencia) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa -> \n nome=" + nome 
				+ "\n idade=" + idade 
				+ "\n sexo=" + sexo 
				+ "\n experiencia=" + experiencia + "]";
	}
	
	
	
}
