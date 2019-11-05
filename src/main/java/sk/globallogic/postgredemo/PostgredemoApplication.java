package sk.globallogic.postgredemo;

import java.time.LocalDate;
import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.globallogic.postgredemo.entity.PlayerData;
import sk.globallogic.postgredemo.repository.PlayerDataRepository;

@SpringBootApplication
public class PostgredemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PostgredemoApplication.class);

	@Autowired
	private PlayerDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PostgredemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

		repository.save(new PlayerData("Palo", "Habera", LocalDate.of(1969, Month.OCTOBER, 5)));
		repository.save(new PlayerData("Meky", "Zbirka", LocalDate.of(1959, Month.OCTOBER, 5)));
		repository.save(new PlayerData("Marika", "Gombitova", LocalDate.of(1949, Month.OCTOBER, 5)));

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
