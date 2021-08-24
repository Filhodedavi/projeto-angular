package net.javaguides.springdatarest;

import net.javaguides.springdatarest.model.User;
import net.javaguides.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{

		User user = User.builder()
				.firstName("Raishdia")
				.lastName("baobaobao")
				.email("aiosjdad@gmail.com")
				.build();

		userRepository.save(user);

		User user1 = User.builder()
				.firstName("john")
				.lastName("cena")
				.email("cenamagical@gmail.com")
				.build();

		userRepository.save(user1);

		User user2 = User.builder()
				.firstName("tony")
				.lastName("stark")
				.email("starksupreme@gmail.com")
				.build();

		userRepository.save(user2);

		User user3 = User.builder()
				.firstName("esterco")
				.lastName("de vaca")
				.email("esterco@gmail.com")
				.build();

		userRepository.save(user3);

		User user4 = User.builder()
				.firstName("pamonha")
				.lastName("assassina")
				.email("pamonhaassassina@gmail.com")
				.build();

		userRepository.save(user4);
	}
}
