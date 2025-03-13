package com.example.Biblioteca.Controller;

import com.example.Biblioteca.Banco.EmprestimoBd;
import com.example.Biblioteca.Model.Emprestimo;

import java.util.List;

public class BibliotecaController {

    EmprestimoBd repository = new EmprestimoBd();

    public List<Emprestimo> getAll() {return repository.findAll();}

    public Emprestimo getById(int id) {return repository.getById(id);}

    public boolean insertBanco(Emprestimo emprestimo) {return repository.insert(emprestimo);}

    public Emprestimo update(int id, Emprestimo emprestimo){
        boolean result = repository.update(id, emprestimo);

        if (result){
            return emprestimo;
        }
        return null;
    }

}
