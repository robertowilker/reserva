package br.com.kvminformatica.reservas.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import br.com.kvminformatica.reservas.domain.converter.request.ReservaRequestConverter;
import br.com.kvminformatica.reservas.domain.converter.response.ReservaResponseConverter;
import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestPostDTO;
import br.com.kvminformatica.reservas.domain.dto.response.ReservaResponseDTO;
import br.com.kvminformatica.reservas.domain.model.Reserva;
import br.com.kvminformatica.reservas.domain.repository.ReservaRepository;
import br.com.kvminformatica.reservas.domain.validation.ValidadorDeReserva;

@Service
public class ReservaService {
	
	private static final String RESERVA_NAO_ENCONTRADA_GET_MSG = "A Reserva não foi encontrada ou não pode ser recuperada"; 

	@Autowired
	private ReservaRepository reservaRepository;
	
	@Autowired
	private ReservaResponseConverter reservaResponseConverter;
	
	@Autowired
	private ReservaRequestConverter reservaRequestConverter;
	
	@Autowired
	private ValidadorDeReserva valida;
	
	public List<ReservaResponseDTO> getAll(){
		return reservaRepository.findAll()
								.stream()
								.map(reservaResponseConverter::convert)
								.collect(Collectors.toList());
	}
	
	public ReservaResponseDTO post(ReservaRequestPostDTO request) {
		
		if(valida.verificaSeJaExisteReservaNestaDataEHorario(request) == true) {
			getAll();
		}
		
		return reservaResponseConverter.convert(
				reservaRepository.save(
						reservaRequestConverter.convert(request)));
	}

	public void delete(String id) {
		reservaRepository.delete(getById(id));
	}
	
	private Reserva getById(String id) {
		return reservaRepository.findById(id)
								.orElseThrow(this::generateNotFound);
	}
	
	private HttpClientErrorException generateNotFound() {
		return new HttpClientErrorException(HttpStatus.NOT_FOUND, RESERVA_NAO_ENCONTRADA_GET_MSG);
	}

	public ReservaResponseDTO getReservaById(String id) {
		return reservaResponseConverter.convert(getById(id));
	}
}
