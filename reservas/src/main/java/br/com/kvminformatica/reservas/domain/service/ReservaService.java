package br.com.kvminformatica.reservas.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kvminformatica.reservas.domain.converter.request.ReservaRequestConverter;
import br.com.kvminformatica.reservas.domain.converter.response.ReservaResponseConverter;
import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestDTO;
import br.com.kvminformatica.reservas.domain.dto.response.ReservaResponseDTO;
import br.com.kvminformatica.reservas.domain.repository.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;
	
	@Autowired
	private ReservaResponseConverter reservaResponseConverter;
	
	@Autowired
	private ReservaRequestConverter reservaRequestConverter;
	
	public List<ReservaResponseDTO> getAll(){
		return reservaRepository.findAll()
								.stream()
								.map(reservaResponseConverter::convert)
								.collect(Collectors.toList());
	}
	
	public ReservaResponseDTO post(ReservaRequestDTO request) {
		return reservaResponseConverter.convert(
				reservaRepository.save(
						reservaRequestConverter.convert(request)));
	}
}
