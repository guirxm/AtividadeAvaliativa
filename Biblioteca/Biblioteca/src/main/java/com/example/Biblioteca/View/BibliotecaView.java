package com.example.Biblioteca.View;

import com.example.Biblioteca.Controller.BibliotecaController;
import com.example.Biblioteca.Model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class BibliotecaView {

    BibliotecaController bibliotecaController = new BibliotecaController();

    @GetMapping
    public List<Emprestimo> getAll() {return bibliotecaController.getAll();}

    @GetMapping("/{id}")
    public Emprestimo getById(@PathVariable int id) {return bibliotecaController.getById(id);}

    @PostMapping
    public boolean insert(@RequestBody Emprestimo emprestimo){
        return bibliotecaController.insertBanco(emprestimo);
    }

    @PutMapping("/{id}")
    public Emprestimo update(@RequestBody Emprestimo emprestimo, @PathVariable int id){
        return bibliotecaController.update(id, emprestimo);
    }


}
