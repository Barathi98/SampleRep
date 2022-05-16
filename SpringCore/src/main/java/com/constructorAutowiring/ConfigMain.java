package com.constructorAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.constructorAutowiring")
public class ConfigMain 
{
	

  @Bean
  public Pepsi getPepsi()
  {
	  Pepsi pepsi=new Pepsi(2,120);
	  return pepsi;
	  
	 
  }
}
