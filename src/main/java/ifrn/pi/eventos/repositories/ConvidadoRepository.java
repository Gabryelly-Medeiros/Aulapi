package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.models.convidado;

public interface ConvidadoRepository extends JpaRepository<convidado, Long> {

	
}
