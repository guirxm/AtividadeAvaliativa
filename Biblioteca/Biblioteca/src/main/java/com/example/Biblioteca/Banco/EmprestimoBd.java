package com.example.Biblioteca.Banco;

import com.example.Biblioteca.Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoBd {


    private List<Emprestimo> emprestimos;

    public  EmprestimoBd(){ this.emprestimos = new ArrayList<>();}

    //busca todos emprestimos
    public List<Emprestimo> findAll(){return new ArrayList<Emprestimo>();}

    //BUSCA UM EMPRESTIMO
    public Emprestimo getById(int id){
        return emprestimos.stream()
                .filter(e -> e.getIdEmpre() == id )
                .findFirst()
                .orElse(null);
    }
    //insere um emprestimo
    public boolean insert(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        return true;
    }
    //atualiza a data do emprestimo com base no id
    public boolean update(int idempre, Emprestimo emprestimo) {
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(f -> f.getIdEmpre() == idempre)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }

        emprestimoBd.setIni(emprestimo.getIni());
        return true;
    }









}
