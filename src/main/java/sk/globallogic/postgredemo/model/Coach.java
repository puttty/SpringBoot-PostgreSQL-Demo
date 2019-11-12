package sk.globallogic.postgredemo.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Coach {

	private long id;

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private int age;

	private String nationaility;

	private List<Team> formerTeams;

	public Coach() {
	}

	public Coach(Long id, String firstName, String lastName, LocalDate birthDate, String nationaility,
			List<Team> formerTeams) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationaility = nationaility;
		this.formerTeams = formerTeams;
		this.age = countAge(birthDate);
	}

	public Coach(Long id, String firstName, String lastName, LocalDate birthDate, String nationaility) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationaility = nationaility;
		this.age = countAge(birthDate);
	}

	private int countAge(LocalDate birthDate) {
		LocalDate today = LocalDate.now();
		return Period.between(birthDate, today).getYears();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationaility() {
		return nationaility;
	}

	public void setNationaility(String nationaility) {
		this.nationaility = nationaility;
	}

	public List<Team> getFormerTeams() {
		return formerTeams;
	}

	public void setFormerTeams(List<Team> formerTeams) {
		this.formerTeams = formerTeams;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Coach{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", birthDate=" + birthDate +
				", age=" + age +
				", nationaility='" + nationaility + '\'' +
				", formerTeams=" + formerTeams +
				'}';
	}
}
