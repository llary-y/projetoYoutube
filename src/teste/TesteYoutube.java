package teste;

import metodos.Aluno;
import metodos.Video;
import metodos.Visualizacao;

public class TesteYoutube {

	public static void main(String[] args) {
		
		Video v1 = new Video("Aula de POO");
		Video v2 = new Video("Aula de Spring boot");
		
		Aluno a1 = new Aluno("Paula", 19, "F", 2, "paula.rsf");
		Aluno a2 = new Aluno("Lucas", 15, "M", 5, "luquita_ss");
		Aluno a3 = new Aluno("Marta", 25, "M", 1, "martinha.123");
		
		
		Visualizacao vis1 = new Visualizacao(a2, v2);
		a1.viuMaisUm();
		a1.ganharExp();
		v2.play();
		v2.like();		
		vis1.avaliar(7);
		
		System.out.println(v2.toString());
		System.out.println(a1.toString());
	
		Visualizacao vis2 = new Visualizacao(a2, v2);
		v2.play();
		v2.like();
		a2.ganharExp();
		a2.ganharExp();
		vis2.avaliar(80.0f);
		a2.viuMaisUm();
		v2.pause();
			
		System.out.println("\n---------------");
		System.out.println(v2.toString());
		System.out.println(a2.toString());
		
		Visualizacao vis3 = new Visualizacao(a3, v1);
		v1.play();
		v1.deslike();
		a3.ganharExp();
		a3.ganharExp();
		vis3.avaliar(3.0f);
		
		System.out.println("\n---------------");
		System.out.println(v1.toString());
		System.out.println(a3.toString());
	}
}
