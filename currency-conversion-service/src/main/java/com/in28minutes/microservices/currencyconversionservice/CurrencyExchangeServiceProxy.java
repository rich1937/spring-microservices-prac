package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	// I.) If there are multiple methods need to be called on a rest service/api,
	// without this proxy, the caller will have all the spaghetti mix of the
	// individual URIs and other rest service metadata.
	// II.) With this proxy, all such complexities have been moved here, actually
	// the complexities of those
	// metadata declarations have reduced.
	// III.) Also multiple clients can use this proxy without any change. All such
	// clients dont need to know anything about the remote rest API service.
	// IV.) Since all the remote methods are managed here making it the central
	// point, it is easier to maintain this whole arrangement.
	// V.) Also making the client calls much simpler.

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
