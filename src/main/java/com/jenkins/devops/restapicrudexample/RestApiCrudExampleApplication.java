package com.jenkins.devops.restapicrudexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCrudExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCrudExampleApplication.class, args);
	}

//	@Autowired
//	ItemRepository itemRepository;
//
//	public RestApiCrudExampleApplication(ItemRepository itemRepository) {
//		this.itemRepository = itemRepository;
//	}

	@Override
	public void run(String... args) throws Exception {
//			itemRepository.save(new Item(null, "Item 1"));
//			itemRepository.save(new Item(null, "Item 2"));

	}
}
