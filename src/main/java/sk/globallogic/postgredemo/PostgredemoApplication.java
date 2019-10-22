package sk.globallogic.postgredemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.globallogic.postgredemo.model.UserData;
import sk.globallogic.postgredemo.repository.UserDataRepository;

@SpringBootApplication
public class PostgredemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PostgredemoApplication.class);

	@Autowired
	private UserDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PostgredemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

		repository.save(new UserData("Palo", "Habera", 50));
		repository.save(new UserData("Meky", "Zbirka", 60));
		repository.save(new UserData("Marika", "Gombitova", 70));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByFirstName('Meky')");
		repository.findByFirstName("Meky").forEach(x -> System.out.println(x));

		System.out.println("\nfindByLastName('Gombitova')");
		repository.findByLastName("Gombitova").forEach(x -> System.out.println(x));

		System.out.println("\nfindByAge('50')");
		repository.findByAge(50).forEach(x -> System.out.println(x));

	}
}
