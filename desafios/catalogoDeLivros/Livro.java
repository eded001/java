package desafios.catalogoDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String obterTitulo() {
        return titulo;
    }
    public String obterAutor() {
        return autor;
    }
    public int obterAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro { " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao + " '}'";
    }
}