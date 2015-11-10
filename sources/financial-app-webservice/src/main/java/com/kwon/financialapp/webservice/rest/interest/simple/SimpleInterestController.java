package com.kwon.financialapp.webservice.rest.interest.simple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kwon.financialapp.webservice.fincal.interest.simple.SimpleInterestCalculator;

/**
 * Simple Interest End Point
 * @author SEASHELL
 */
@RequestMapping("/interest/simple")
@RestController		// Use instead of @Controller for Rest Spring
public class SimpleInterestController {
	
	@RequestMapping(value = "/pv", method = RequestMethod.GET)
	public ResponseEntity<Double> calculatePV() {
		return new ResponseEntity<Double>(SimpleInterestCalculator.fv(100, 2, 0.1), HttpStatus.OK);
	}

}
