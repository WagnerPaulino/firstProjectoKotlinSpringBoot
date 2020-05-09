package com.firstProjectoKotlinSpringBoot.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired
import com.firstProjectoKotlinSpringBoot.repository.PessoaRepository
import com.firstProjectoKotlinSpringBoot.domain.Pessoa
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PutMapping

@RestController
@RequestMapping("api/pessoas")
class PessoaRest(@Autowired private val repository: PessoaRepository) {

	@GetMapping()
	fun findAll(): List<Pessoa> {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	fun findById(@PathVariable(name = "id") id: Long): Pessoa {
		return repository.getOne(id);
	}

	@PostMapping
	fun insert(@RequestBody pessoa: Pessoa): Pessoa {
		return repository.save(pessoa);
	}

	@PutMapping
	fun update(@RequestBody pessoa: Pessoa): Pessoa {
		return repository.save(pessoa);
	}

}