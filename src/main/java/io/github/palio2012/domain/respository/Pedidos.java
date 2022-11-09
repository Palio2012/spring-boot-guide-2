package io.github.palio2012.domain.respository;

import io.github.palio2012.domain.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository <Pedido, Integer> {
}
