package io.github.palio2012;

import io.github.palio2012.domain.entities.Cliente;
import io.github.palio2012.domain.respositorios.ClienteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@SpringBootApplication
public class VendasAppApplication {

    @Bean
    public CommandLineRunner init (@Autowired ClienteRep clientes) {
        return args -> {
            clientes.salvar(new Cliente("Daniel"));
            clientes.salvar(new Cliente("Roberto"));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out :: println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasAppApplication.class, args);
    }

}
