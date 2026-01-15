package models;

import java.util.List;

public class Exemplar {

    private int id;
    private String codigo;

    private Biblioteca biblioteca;
    private Livro livro;

    private List<Reserva> reservas;
    private List<Emprestimo> emprestimos;
}
