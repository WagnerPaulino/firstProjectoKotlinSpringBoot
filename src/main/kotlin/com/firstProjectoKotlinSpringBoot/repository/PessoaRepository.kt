package com.firstProjectoKotlinSpringBoot.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import com.firstProjectoKotlinSpringBoot.domain.Pessoa

@Repository
interface PessoaRepository : JpaRepository<Pessoa, Long>, JpaSpecificationExecutor<Pessoa> {

  fun findByLogin(login: String): Pessoa?
  
}