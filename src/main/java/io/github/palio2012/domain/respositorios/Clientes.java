package io.github.palio2012.domain.respositorios;


import io.github.palio2012.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Clientes extends JpaRepository <Cliente, Integer> {


    // select c from Cliente c where c.nome like :nome
    List <Cliente> findByNomeLike(String nome);

    List <Cliente> findByNomeOrId (String nome, Integer id);

    boolean existsByNome (String nome);
}