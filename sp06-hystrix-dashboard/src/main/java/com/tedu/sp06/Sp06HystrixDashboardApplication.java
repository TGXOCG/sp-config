package com.tedu.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class Sp06HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp06HystrixDashboardApplication.class, args);
	}

}
