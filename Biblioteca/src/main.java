import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ===== Biblioteca =====
        Biblioteca biblioteca = new Biblioteca();

        // ===== Editora =====
        Editora editora = new Editora();

        // ===== Autor =====
        Autor autor = new Autor();

        // ===== Livro =====
        Livro livro = new Livro();

        // ===== Exemplares =====
        Exemplar exemplar1 = new Exemplar();
        Exemplar exemplar2 = new Exemplar();

        List<Exemplar> exemplares = new ArrayList<>();
        exemplares.add(exemplar1);
        exemplares.add(exemplar2);

        // ===== Usuário =====
        Usuario usuario = new Usuario();

        // ===== Reserva =====
        Reserva reserva = new Reserva();

        // ===== Empréstimo =====
        Emprestimo emprestimo = new Emprestimo();

        System.out.println("Sistema de Biblioteca iniciado.");
        System.out.println("Usuário realizou uma reserva de um exemplar.");
        System.out.println("Empréstimo registrado com sucesso.");
    }
}
