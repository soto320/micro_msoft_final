package ec.edu.ups.facturacion_backend.repository;

import ec.edu.ups.facturacion_backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
