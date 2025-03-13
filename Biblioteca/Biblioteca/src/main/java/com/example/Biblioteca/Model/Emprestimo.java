package com.example.Biblioteca.Model;

public class Emprestimo {

    private int Ini;
    private int  Fim;
    private int livrosempres;
    private int idEmpre;

    public Emprestimo(int ini, int fim, int livrosempres, int idEmpre) {
        Ini = ini;
        Fim = fim;
        this.livrosempres = livrosempres;
        this.idEmpre = idEmpre;
    }

    public int getIni() {
        return Ini;
    }

    public void setIni(int ini) {
        Ini = ini;
    }

    public int getFim() {
        return Fim;
    }

    public void setFim(int fim) {
        Fim = fim;
    }

    public int getLivrosempres() {
        return livrosempres;
    }

    public void setLivrosempres(int livrosempres) {
        this.livrosempres = livrosempres;
    }

    public int getIdEmpre() {
        return idEmpre;
    }

    public void setIdEmpre(int idEmpre) {
        this.idEmpre = idEmpre;
    }





}
