package br.com.kvminformatica.reservas.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import br.com.kvminformatica.reservas.domain.converter.request.SalaRequestConverter;
import br.com.kvminformatica.reservas.domain.converter.response.SalaResponseConverter;
import br.com.kvminformatica.reservas.domain.dto.request.SalaRequestDTO;
import br.com.kvminformatica.reservas.domain.dto.response.SalaResponseDTO;
import br.com.kvminformatica.reservas.domain.model.Sala;
import br.com.kvminformatica.reservas.domain.repository.SalaRepository;

@Service
public class SalaService {
	
private static final String SALA_NAO_ENCONTRADA_GET_MSG = "A sala não foi encontrada ou não pode ser recuperada.";

	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private SalaResponseConverter salaResponseConverter;
	
	@Autowired
	private SalaRequestConverter salaRequestConverter;
	
	public List<SalaResponseDTO> getAll(){
		return salaRepository.findAll()
							 .stream()
							 .map(salaResponseConverter::convert)
							 .collect(Collectors.toList());
	}
	
	public SalaResponseDTO post(SalaRequestDTO request) {
		return salaResponseConverter.convert(salaRepository.save(salaRequestConverter.convert(request)));
	}
	
	public void delete(String id) {
		salaRepository.delete(getById(id));
	}
	
	private Sala getById(String id) {

		return salaRepository.findById(id)
							 .orElseThrow(this::generateNotFound);
	}
	
	private HttpClientErrorException generateNotFound() {
		return new HttpClientErrorException(HttpStatus.NOT_FOUND, SALA_NAO_ENCONTRADA_GET_MSG);
	}
}