package br.com.kvminformatica.reservas.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kvminformatica.reservas.domain.converter.response.SalaResponseConverter;
import br.com.kvminformatica.reservas.domain.dto.response.SalaResponseDTO;
import br.com.kvminformatica.reservas.domain.repository.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private SalaResponseConverter salaResponseConverter;
	
	public List<SalaResponseDTO> getAll(){
		return salaRepository.findAll()
							 .stream()
							 .map(salaResponseConverter::convert)
							 .collect(Collectors.toList());
	}
}