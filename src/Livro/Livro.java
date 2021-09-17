package Livro;

public class Livro {
    private String titulo;
    private int qtdePaginas;

    public Livro(String titulo, int qtdePaginas) {
        this.titulo = titulo;
        this.qtdePaginas = qtdePaginas;
    }

    @Override
    public String toString() {
        return ("Título : " + titulo + "  ||  Quantidade de páginas: " + qtdePaginas);
    }
}
