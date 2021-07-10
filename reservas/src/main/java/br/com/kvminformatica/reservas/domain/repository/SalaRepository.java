package br.com.kvminformatica.reservas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kvminformatica.reservas.domain.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, String>{

}
