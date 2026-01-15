package models;

import java.util.List;

public class Livro {

    private int id;
    private String titulo;
    private int anoPublicacao;

    private List<Autor> autores;
    private Editora editora;
    private List<Exemplar> exemplares;
}
