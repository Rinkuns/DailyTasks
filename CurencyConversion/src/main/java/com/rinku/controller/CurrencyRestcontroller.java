package com.rinku.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rinku.bean.CurencyConversionBean;

@RestController
public class CurrencyRestcontroller {

	@GetMapping("currency-conversion/from/{from}/to/{to}/{quantity}")
	public CurencyConversionBean getDetails(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity) {
		
		return new CurencyConversionBean(1001, from, to, quantity, BigDecimal.valueOf(89.51), quantity.multiply(BigDecimal.valueOf(89.51)),0);
		
	}
}
