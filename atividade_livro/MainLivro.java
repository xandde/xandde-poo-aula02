package atividade_livro;

import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o titulo do livro: ");
        String titulo = ler.next();

        System.out.println("Digite o nome do autor: ");
        String autor = ler.next();
        
        Livro livro1 = new Livro(titulo, autor, 30, 350.00, "45");

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());

        
        }
    }
