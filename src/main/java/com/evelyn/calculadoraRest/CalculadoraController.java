package com.evelyn.calculadoraRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

	@Autowired
	private OperacoesService calculadora;
	
	@GetMapping("/soma/{num1}/{num2}")
	public ResponseEntity<Double> soma(@PathVariable("num1") double num1,@PathVariable("num2") double num2){
	        return ResponseEntity.status(200).body(calculadora.somar(num1, num2));
	}
	
	@GetMapping("/subtrai/{num1}/{num2}")
	public ResponseEntity<Double> subtrai(@PathVariable("num1") double num1,@PathVariable("num2") double num2){
	        return ResponseEntity.status(200).body(calculadora.subtrair(num1, num2));
	}
	
	@GetMapping("/multiplica/{num1}/{num2}")
	public ResponseEntity<Double> multiplica(@PathVariable("num1") double num1,@PathVariable("num2") double num2){
	        return ResponseEntity.status(200).body(calculadora.multiplicar(num1, num2));
	}
	
	@GetMapping("/divide/{num1}/{num2}")
	public ResponseEntity<Double> divide(@PathVariable("num1") double num1,@PathVariable("num2") double num2){
	        return ResponseEntity.status(200).body(calculadora.dividir(num1, num2));
	}
}
