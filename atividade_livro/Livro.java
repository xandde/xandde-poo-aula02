package atividade_livro;

public class Livro {
    
    private String titulo;
    private String autor;
    private int pages;
    private double price;
    private String isbn;

// Constructor
    public Livro(String autor, String isbn, int pages, double price, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;
        this.titulo = titulo;
    }

// Gathers and Setters
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

    public String getIsbm() {
        return isbn;
    }

    public void setIsbm(String isbn) {
        this.isbn = isbn;
    }
    
}
