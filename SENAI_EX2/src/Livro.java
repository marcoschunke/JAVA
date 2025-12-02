public class Livro {
	
	// Atributos
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	// Construtor
	public Livro(String titulo, String autor, int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	// Método para exibir as informações do livro
	public void exibirInformacoes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numeroDePaginas);
	}
	// Getters e Setters (opcionais)
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
}