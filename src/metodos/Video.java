package metodos;

public class Video implements AcoesVideo{

	private String titulo;
	private int avaliacao;
	private long views;
	private int likes;
	private int deslikes;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.likes = 0;
		this.deslikes = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	// Média de avaliações que o video vai ter
	public void setAvaliacao(int avaliacao) {
		int nova;
		
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public int getDeslikes() {
		return deslikes;
	}

	public void setDeslikes(int deslikes) {
		this.deslikes = deslikes;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.likes = likes + 1;
		
	}

	@Override
	public void deslike() {
		this.deslikes = deslikes - 1;
		
	}

	@Override
	public String toString() {
		return "Video [\n titulo=" + titulo 
				+ "\n avaliacao=" + avaliacao 
				+ "\n views=" + views 
				+ "\n likes=" + likes
				+ "\n deslikes=" + deslikes 
				+ "\n reproduzindo=" + reproduzindo + "]";
	}
	
	
	
}
