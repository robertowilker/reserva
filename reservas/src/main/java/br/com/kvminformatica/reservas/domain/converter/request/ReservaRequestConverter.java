package br.com.kvminformatica.reservas.domain.converter.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestPostDTO;
import br.com.kvminformatica.reservas.domain.model.Reserva;
import br.com.kvminformatica.reservas.domain.model.Sala;
import br.com.kvminformatica.reservas.domain.repository.SalaRepository;

@Component
public class ReservaRequestConverter implements Converter<ReservaRequestPostDTO, Reserva>{

	@Autowired
	private SalaRepository salaRepository;
	
	@Override
	public Reserva convert(ReservaRequestPostDTO source) {

		Sala sala = salaRepository.getById(source.getNomeSala());
		
		return new Reserva(sala,
						   source.getData(),
						   source.getHorarioDeInicio(),
						   source.getHorariodeTermino(),
						   source.getNomeDaReuniao(),
						   source.getColaborador());
	}
}
