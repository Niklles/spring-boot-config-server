package ru.ufs.mas.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api")
public class ConfigClientApi {
	@Value("${name.app}")
	private String aConf;
	
	@GetMapping
	public String getConf() {
		return this.aConf;
	}
}
