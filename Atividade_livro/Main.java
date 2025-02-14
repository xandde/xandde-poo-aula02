package Atividade_livro;


public class Main {

    public static void main(String[] args) {
        
        Livro livro = new Livro("Sangue&Fogo", "GeorgeRRMartin", 581, 250.00);

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Paginas: " + livro.getPages());
        System.out.println("Preço: " + livro.getPrice());
        }
    }
