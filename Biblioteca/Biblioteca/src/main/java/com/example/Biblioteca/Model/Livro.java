package com.example.Biblioteca.Model;

public class Livro {

    private String autor;
    private String nome;
    private String genero;
    private Long idLivro;


    public Livro(String autor, String nome, String genero, Long idLivro) {
        this.autor = autor;
        this.nome = nome;
        this.genero = genero;
        this.idLivro = idLivro;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }




}
