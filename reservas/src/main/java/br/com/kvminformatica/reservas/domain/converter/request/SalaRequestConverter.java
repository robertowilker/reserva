package br.com.kvminformatica.reservas.domain.converter.request;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import br.com.kvminformatica.reservas.domain.dto.request.SalaRequestDTO;
import br.com.kvminformatica.reservas.domain.model.Sala;

@Component
public class SalaRequestConverter implements Converter<SalaRequestDTO, Sala>{

	@Override
	public Sala convert(SalaRequestDTO source) {
		return new Sala(source.getNomeDaSala(),
						source.getAndar());
	}

}
