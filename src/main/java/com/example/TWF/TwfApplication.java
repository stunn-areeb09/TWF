package com.example.TWF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwfApplication implements HealthIndicator {

	private final long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		SpringApplication.run(TwfApplication.class, args);
	}

	@Override
	public Health getHealth(boolean includeDetails) {
		return HealthIndicator.super.getHealth(includeDetails);
	}

	@Override
	public Health health() {
		long uptime = System.currentTimeMillis() - startTime;
		return Health.up()
				.withDetail("Uptime", uptime + " ms")
				.build();
	}
}
