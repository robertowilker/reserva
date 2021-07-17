package br.com.kvminformatica.reservas.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kvminformatica.reservas.domain.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, String>{

	public List<Reserva> findByData(String dataDaReserva);

}
