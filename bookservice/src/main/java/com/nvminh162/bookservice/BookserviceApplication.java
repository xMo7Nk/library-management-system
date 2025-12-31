package com.nvminh162.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.nvminh162.bookservice", "com.nvminh162.commonservice" }) // vì đã import common service vào book service => ngoài scan com.nvminh162.bookservice => muốn scan qua common service => để thấy exception advice để lắng nghe
public class BookserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

}