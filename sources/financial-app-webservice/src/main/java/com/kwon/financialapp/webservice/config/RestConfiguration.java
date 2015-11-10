package com.kwon.financialapp.webservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author SEASHELL
 */
@EnableWebMvc
@ComponentScan("com.kwon.financialapp.webservice.rest")
@Configuration
public class RestConfiguration {

}
