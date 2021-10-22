package io.github.woukies.ex8_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo server = new ServerInfo();
		server.setIpNum("localhost");
		server.setPortNum("8181");

		return server;
	}
}
