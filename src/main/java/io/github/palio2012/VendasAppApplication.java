package io.github.palio2012;


import io.github.palio2012.domain.entities.Cliente;
import io.github.palio2012.domain.respositorios.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasAppApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Daniel"));
            clientes.save(new Cliente("Roberto"));

            List <Cliente> result = clientes.encontrarPorNome("Daniel");
            result.forEach(System.out :: println);

        };
    }
            public static void main(String[]args){
                SpringApplication.run(VendasAppApplication.class, args);
            }

}
