package sk.globallogic.postgredemo.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import sk.globallogic.postgredemo.model.Coach;

@Entity
@Table(name = "coach_data")
public class CoachData extends Coach {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Coach coach;

	public CoachData() {
	}

	public CoachData(Long id, String firstName, String lastName, LocalDate birthDate, String nationaility) {
		super(id, firstName, lastName, birthDate, nationaility);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}
}
