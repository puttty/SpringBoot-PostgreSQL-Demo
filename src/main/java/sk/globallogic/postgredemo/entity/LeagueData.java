package sk.globallogic.postgredemo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import sk.globallogic.postgredemo.model.Team;

@Entity
@Table(name = "league_data")
public class LeagueData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String nation;

	private int numberOfTeams;

	private List<Team> listOfTeams;

	public LeagueData() {
	}

	public LeagueData(String name, String nation, int numberOfTeams) {
		this.name = name;
		this.nation = nation;
		this.numberOfTeams = numberOfTeams;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}

	public List<Team> getListOfTeams() {
		return listOfTeams;
	}

	public void setListOfTeams(List<Team> listOfTeams) {
		this.listOfTeams = listOfTeams;
	}

	@Override
	public String toString() {
		return "LeagueData{" +
				"id=" + id +
				", name='" + name + '\'' +
				", nation='" + nation + '\'' +
				", numberOfTeams=" + numberOfTeams +
				", listOfTeams=" + listOfTeams +
				'}';
	}
}
