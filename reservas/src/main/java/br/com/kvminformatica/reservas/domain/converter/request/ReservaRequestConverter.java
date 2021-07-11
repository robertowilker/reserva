package br.com.kvminformatica.reservas.domain.converter.request;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestDTO;
import br.com.kvminformatica.reservas.domain.model.Reserva;

@Component
public class ReservaRequestConverter implements Converter<ReservaRequestDTO, Reserva>{

	@Override
	public Reserva convert(ReservaRequestDTO source) {

		return new Reserva(source.getSala(),
						   source.getHorarioDeInicio(),
						   source.getHorariodeTermino(),
						   source.getNomeDaReunião(),
						   source.getColaborador(),
						   source.getStatus());
	}
}
