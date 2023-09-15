package metodos;

public class Visualizacao {

	private Aluno espectador;
	private Video video;
	
	public Visualizacao(Aluno espectador, Video video) {
		this.espectador = espectador;
		this.video = video;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
		this.video.setViews(this.video.getViews() + 1);
	}
	
	public void avaliar() {
		this.video.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.video.setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		int total = 0;
		
		if (porcentagem <= 20) {
			total = 3;
		} else if (porcentagem <= 50){
			total = 5;
		} else if (porcentagem <= 90) {
			total = 8;
		} else {
			total = 10;
		}
		this.video.setAvaliacao(total);
	}
	
}
