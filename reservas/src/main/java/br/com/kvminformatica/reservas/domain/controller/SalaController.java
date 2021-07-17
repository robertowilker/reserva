package br.com.kvminformatica.reservas.domain.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kvminformatica.reservas.domain.dto.request.SalaRequestDTO;
import br.com.kvminformatica.reservas.domain.dto.request.SalaRequestPutDTO;
import br.com.kvminformatica.reservas.domain.dto.response.SalaResponseDTO;
import br.com.kvminformatica.reservas.domain.service.SalaService;

@RequestMapping("/sala")
@RestController
public class SalaController {
	
	@Autowired
	private SalaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<SalaResponseDTO> getId(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getSalaById(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<SalaResponseDTO>> list() {
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<SalaResponseDTO> putNomeDaSala(@PathVariable String id, @RequestBody @Valid SalaRequestPutDTO request) {
		
		return new ResponseEntity<>(service.put(id, request), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<SalaResponseDTO> post(@RequestBody @Valid SalaRequestDTO request) {
		return new ResponseEntity<>(service.post(request), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) throws Exception{
		service.delete(id);
	}
}
