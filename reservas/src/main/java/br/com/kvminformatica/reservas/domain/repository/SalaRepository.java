package br.com.kvminformatica.reservas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvminformatica.reservas.domain.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, String>{

}
