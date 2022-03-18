package com.onboarding.currencycalculation.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.currencycalculation.model.CalculatedAmount;

@RestController
public class CurrencyCalculationController {

		@GetMapping("/currency-exchange/from/{from}/to/{to}/{quantity}")
		public CalculatedAmount calculatedAmount(@PathVariable String from, @PathVariable String to, @PathVariable String quantity) {
			
			return new CalculatedAmount(100L, from,to,BigDecimal.ONE, quantity, BigDecimal.ONE,8100);
		}

}
