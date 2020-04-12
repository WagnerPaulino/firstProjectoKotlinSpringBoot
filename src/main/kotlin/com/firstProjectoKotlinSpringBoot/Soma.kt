package com.firstProjectoKotlinSpringBoot

class Soma(val id: Long, values: List<Int>) {
	val soma: Int = values.sum();
}