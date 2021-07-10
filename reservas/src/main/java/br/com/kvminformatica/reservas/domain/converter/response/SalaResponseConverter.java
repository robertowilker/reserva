package br.com.kvminformatica.reservas.domain.converter.response;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.kvminformatica.reservas.domain.dto.response.SalaResponseDTO;
import br.com.kvminformatica.reservas.domain.model.Sala;

@Component
public class SalaResponseConverter implements Converter<Sala, SalaResponseDTO>{

	@Override
	public SalaResponseDTO convert(Sala source) {
		return new SalaResponseDTO(source.getId(),
								   source.getNomeDaSala(),
								   source.getAndar());
	}
	
}
