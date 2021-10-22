package io.github.woukies.ex8_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo server = new ServerInfo();
		server.setIpNum("213.186.229.29");
		server.setPortNum("80");

		return server;
	}
}
