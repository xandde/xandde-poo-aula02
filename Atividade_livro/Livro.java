package Atividade_livro;

public class Livro {
    
    private String titulo;
    private String autor;
    private int pages;
    private double price;

    public Livro(String titulo, String autor, int pages, double price) {
        this.titulo = titulo;
        this.autor = autor;
        this.pages = pages;
        this.price = price;
    }

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    
}
