package com.firstProjectoKotlinSpringBoot.domain
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Pessoa(
    var login: String,
    var name: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null) {
	constructor(): this("","");
}