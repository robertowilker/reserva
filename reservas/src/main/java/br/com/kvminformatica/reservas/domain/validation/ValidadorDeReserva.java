package br.com.kvminformatica.reservas.domain.validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestPostDTO;
import br.com.kvminformatica.reservas.domain.model.Reserva;
import br.com.kvminformatica.reservas.domain.repository.ReservaRepository;

@Component
public class ValidadorDeReserva {

	@Autowired
	private ReservaRepository repository;

	public boolean verificaSeJaExisteReservaNestaDataEHorario(ReservaRequestPostDTO request) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

//		String dataDaReserva = request.getData().format(formatter);
		
		List<Reserva> reservasExistentes = repository.findByData(request.getData());

		if(reservasExistentes == null) {
			return false;
		}else {
			return verificaSeJaExisteUmaReservaNesteHorario(request, reservasExistentes);
		}
		

	}

	private boolean verificaSeJaExisteUmaReservaNesteHorario(ReservaRequestPostDTO request, List<Reserva> reservasNestaData) {
		
		
		for(Reserva reserva : reservasNestaData) {
			
			boolean inicioBefore = request.getHorarioDeInicio().isBefore(reserva.getHorarioDeInicio()) &&
									 request.getHorariodeTermino().isBefore(reserva.getHorarioDeInicio());
			
			boolean terminoBefore = request.getHorariodeTermino().isBefore(reserva.getHorarioDeTermino()) &&
					 request.getHorariodeTermino().isBefore(reserva.getHorarioDeTermino());
			
			boolean inicioAfter = request.getHorarioDeInicio().isAfter(reserva.getHorarioDeInicio()) &&
					 request.getHorariodeTermino().isAfter(reserva.getHorarioDeInicio());

			boolean terminoAfter = request.getHorariodeTermino().isAfter(reserva.getHorarioDeTermino()) &&
	 				request.getHorariodeTermino().isAfter(reserva.getHorarioDeTermino());
					
					
			if(inicioBefore && terminoBefore && inicioAfter && terminoAfter == true) {
				return false;
			}else {
				return true;
			}
		}
		return false;
	}
}
