package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
	
	@PostMapping
    public ResponseEntity<?> criaTurma(@RequestBody @Valid TurmaRequest request, UriComponentsBuilder builder) {
    	
		URI uri = UriComponentsBuilder.path("/turmas/{id}").build(id);
		return ResponseEntity.created(null).body(null);
    }

}
