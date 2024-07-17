package com.alura.literalura;

import org.springframework.boot.SpringApplication;
import com.alura.literalura.menu.Menu;
import com.alura.literalura.repository.BookRepository;
import com.alura.literalura.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Menu menu = new Menu(bookRepository, personRepository);
		menu.exibirMenu();
	}
}
