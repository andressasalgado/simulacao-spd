package com.example.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class ControllerExample {

	private static final Logger log = LogManager.getLogger(ControllerExample.class);

	//METODO PARA CALCULAR AREA DO TRIANGULO
	@PostMapping(path= "/calculate-rectangle-area")
	public ResponseEntity<ResponseArea> calculateRectangleArea(@RequestBody Rectangle rectangle) throws Exception {
		StopWatch watch = new StopWatch();
		watch.start();
		var area = rectangle.lenght * rectangle.widht;
		watch.stop();
		var timeInMilis = watch.getTotalTimeMillis();
		log.info("The time or execution for the method calculateRectangleArea was {} ms", timeInMilis);
		return ResponseEntity.ok(new ResponseArea(area, timeInMilis));
	}

	//METODO NADA EFICAZ PARA GERAR NUMEROS PRIMOS
	@PostMapping(path= "/generate-prime")
	public ResponseEntity<ResponsePrime> generatePrimeNumbers(@RequestParam Long size) throws Exception {
		StopWatch watch = new StopWatch();
		watch.start();
		var i = 0L;
		List<Long> primeNumbers = new ArrayList<>();
		while(i < size){
			var randomLong = new Random().nextLong();
			if(isPrime(randomLong)) {
				primeNumbers.add(randomLong);
				i++;
			}
		}

		watch.stop();
		var timeInMilis = watch.getTotalTimeMillis();
		log.info("The time or execution for the method generatePrimeNumbers was {} ms", timeInMilis);
		return ResponseEntity.ok(new ResponsePrime(primeNumbers, timeInMilis));
	}


	public static boolean isPrime(Long number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
