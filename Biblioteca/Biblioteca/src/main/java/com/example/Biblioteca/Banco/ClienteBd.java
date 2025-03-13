package com.example.Biblioteca.Banco;

import com.example.Biblioteca.Model.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteBd {

    private List<Cliente> clientes;

    public ClienteBd(){

        this.clientes = new ArrayList<>();

        //criando os clientes
        Cliente cliente1 = new Cliente("joao" , 12434545L,12343,"emaildaorinha",12244);
        Cliente cliente2 = new Cliente("paulinho", 12343443L,1599898989,"legalemail",879383 );

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(cliente1);
        clientes.add(cliente2);

        //busca todos clientes

        public List<Cliente> findAll(){
            return clientes.stream()
                    .sorted((cliente1, cliente2) -> double.compare(cliente2.getIdCliente()));
        }

    }
}
