package sk.globallogic.postgredemo.entity;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_data")
public class PlayerData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private String birthPlace;

	private String nationality;

	private int age;

	private String team;

	private int goalsNumber;

	private int yellowCardsNumber;

	private int redCardsNumber;


	public PlayerData() {

	}

	public PlayerData(String firstName, String lastName, LocalDate birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.age = countAge(birthDate);

	}

	public PlayerData(long id, String firstName, String lastName, LocalDate birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.age = countAge(birthDate);
	}

	public PlayerData(Long id, String firstName, String lastName, LocalDate birthDate, String birthPlace, String nationality, String club,
			int goalsNumber, int yellowCardsNumber, int redCardsNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.nationality = nationality;
		this.age = countAge(birthDate);
		this.team = club;
		this.goalsNumber = goalsNumber;
		this.yellowCardsNumber = yellowCardsNumber;
		this.redCardsNumber = redCardsNumber;
	}

	private int countAge(LocalDate birthDate) {
		LocalDate today = LocalDate.now();
		return Period.between(birthDate, today).getYears();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getGoalsNumber() {
		return goalsNumber;
	}

	public void setGoalsNumber(int goalsNumber) {
		this.goalsNumber = goalsNumber;
	}

	public int getYellowCardsNumber() {
		return yellowCardsNumber;
	}

	public void setYellowCardsNumber(int yellowCardsNumber) {
		this.yellowCardsNumber = yellowCardsNumber;
	}

	public int getRedCardsNumber() {
		return redCardsNumber;
	}

	public void setRedCardsNumber(int redCardsNumber) {
		this.redCardsNumber = redCardsNumber;
	}

	@Override
	public String toString() {
		return "PlayerData{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", birthDate=" + birthDate +
				", birthPlace='" + birthPlace + '\'' +
				", nationality='" + nationality + '\'' +
				", age=" + age +
				", team='" + team + '\'' +
				", goalsNumber=" + goalsNumber +
				", yellowCardsNumber=" + yellowCardsNumber +
				", redCardsNumber=" + redCardsNumber +
				'}';
	}
}
