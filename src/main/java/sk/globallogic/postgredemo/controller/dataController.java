package sk.globallogic.postgredemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.globallogic.postgredemo.entity.PlayerData;
import sk.globallogic.postgredemo.repository.PlayerDataRepository;

@RestController
@RequestMapping("/postgre")
public class dataController {

	@Autowired
	private PlayerDataRepository repository;

	@GetMapping(value = "/all")
	public List<PlayerData> getAllUserData() {
		Iterable<PlayerData> iterable = repository.findAll();
		List<PlayerData> result = StreamSupport.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
		return result;
	}

	@GetMapping(value = "/{id}")
	public List<PlayerData> getUserDataById(@PathVariable("id") Long id) {
		ArrayList<PlayerData> list = new ArrayList<>();
		repository.findById(id).ifPresent(list::add);
		return list;
	}

	@GetMapping(value = "/firstName")
	public List<PlayerData> getUserDataByFirstName(@PathVariable("firstName") String firstName) {
		return repository.findByFirstName(firstName);
	}

	@GetMapping(value = "/lastName")
	public List<PlayerData> getUserDataByLastName(@PathVariable("lastName") String lastName) {
		return repository.findByLastName(lastName);
	}

	@PostMapping(value = "/post")
	public PlayerData postUserData(@Valid @RequestBody PlayerData user) {
		return repository.save(user);
	}

	@PutMapping(value = "/put/{id}")
	public PlayerData modifyUserData(@PathVariable("id") Long id, @Valid @RequestBody PlayerData user) {
		user.setId(id);
		return repository.save(user);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteUserData(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}




}
