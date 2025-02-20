package atividade_veiculo;

public class Livro1 {

    String titulo;
    String autor;
    String isbn;
    int pages;
    double valor;

    // Constructor
    public Livro1(String titulo, String autor, String isbn, int pages, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.pages = pages;
        this.valor = valor;
    }

    // Gatters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", isbn=").append(isbn);
        sb.append(", pages=").append(pages);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

}
