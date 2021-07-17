package br.com.kvminformatica.reservas.domain.converter.response;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.kvminformatica.reservas.domain.dto.response.ReservaResponseDTO;
import br.com.kvminformatica.reservas.domain.model.Reserva;

@Component
public class ReservaResponseConverter implements Converter<Reserva, ReservaResponseDTO>{

	@Override
	public ReservaResponseDTO convert(Reserva source) {
		
		return new ReservaResponseDTO(source.getSala().toString(),
									  source.getData().toString(),
									  source.getHorarioDeInicio().toString(),
									  source.getNomeDaReunião(),
									  source.getColaborador(),
									  source.getStatus().toString());
	}

	public ReservaResponseDTO convert(ReservaResponseDTO reservaById) {
		// TODO Auto-generated method stub
		return null;
	}

}
