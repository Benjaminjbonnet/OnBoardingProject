package com.onboarding.currencycalculation.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.onboarding.currencycalculation.model.CalculatedAmount;
@CrossOrigin(origins="*")
@RestController
public class CurrencyCalculationController {

		@GetMapping("/currency-exchange/from/{from}/to/{to}/{quantity}")
		public CalculatedAmount calculateAmount(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
			
			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("from", from);
			uriVariables.put("to", to);
			ResponseEntity<CalculatedAmount> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CalculatedAmount.class,uriVariables);
			CalculatedAmount calculatedAmount =responseEntity.getBody();
			
			
			return new CalculatedAmount(calculatedAmount.getId(),calculatedAmount.getFrom(),calculatedAmount.getTo(),calculatedAmount.getConversionMultiple(), quantity, quantity.multiply(calculatedAmount.getConversionMultiple()),calculatedAmount.getPort());
		}

}
