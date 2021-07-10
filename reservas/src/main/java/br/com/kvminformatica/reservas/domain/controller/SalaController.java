package br.com.kvminformatica.reservas.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kvminformatica.reservas.domain.dto.response.SalaResponseDTO;
import br.com.kvminformatica.reservas.domain.service.SalaService;

@RequestMapping("/sala")
@RestController
public class SalaController {
	
	@Autowired
	private SalaService service;

	@GetMapping
	public List<SalaResponseDTO> list() {
		
//		Sala sala = new Sala("risk pro", "17");
//		return Arrays.asList(sala, sala);
		return service.getAll();
	}
}
