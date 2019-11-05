package sk.globallogic.postgredemo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import sk.globallogic.postgredemo.model.Coach;

@Entity
@Table(name = "team_data")
public class TeamData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String secondName;

	private String thirdName;

	private String city;

	private String nation;

	private int numberOfPlayers;

	private String league;

	private List<PlayerData> listOfPlayers;

	private int leagueStanding;

	private Coach coach;

	public TeamData() {
	}

	public TeamData(String firstName, String secondName, String thirdName, String city, String nation) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.city = city;
		this.nation = nation;
	}

	public TeamData(Long id, String firstName, String secondName, String thirdName, String city, String nation, int numberOfPlayers,
			String league, List<PlayerData> listOfPlayers, int leagueStanding, Coach coach) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.city = city;
		this.nation = nation;
		this.numberOfPlayers = numberOfPlayers;
		this.league = league;
		this.listOfPlayers = listOfPlayers;
		this.leagueStanding = leagueStanding;
		this.coach = coach;
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

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public List<PlayerData> getListOfPlayers() {
		return listOfPlayers;
	}

	public void setListOfPlayers(List<PlayerData> listOfPlayers) {
		this.listOfPlayers = listOfPlayers;
	}

	public int getLeagueStanding() {
		return leagueStanding;
	}

	public void setLeagueStanding(int leagueStanding) {
		this.leagueStanding = leagueStanding;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "TeamData{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + secondName + '\'' +
				", thirdName='" + thirdName + '\'' +
				", city='" + city + '\'' +
				", nation='" + nation + '\'' +
				", numberOfPlayers=" + numberOfPlayers +
				", league='" + league + '\'' +
				", listOfPlayers=" + listOfPlayers +
				", leagueStanding=" + leagueStanding +
				", coach=" + coach +
				'}';
	}
}
