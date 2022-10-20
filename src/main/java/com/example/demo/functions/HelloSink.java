package com.example.demo.functions;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Configuration
@Slf4j
public class HelloSink 
{
	@Bean
	public Function<Flux<String>, Flux<String> > processHello()
	{
		return str ->
		{
			return str.map(theString -> 
			{
				log.info("Got the string: {}", theString);
				
				return theString;
			});
			
		};
	}
}
