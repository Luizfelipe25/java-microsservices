package br.com.luiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	
	Cambio findByFromAndTo(String from, String to);

}
