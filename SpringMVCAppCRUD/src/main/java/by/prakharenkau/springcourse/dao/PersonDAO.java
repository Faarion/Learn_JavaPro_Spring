package by.prakharenkau.springcourse.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import by.prakharenkau.springcourse.models.Person;

@Component
public class PersonDAO {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PersonDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Person> index() {
		return jdbcTemplate.query( "SELECT * FROM Person", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person show(int id) {
		return jdbcTemplate.queryForObject(
				"SELECT * FROM Person WHERE id = ?",
				new BeanPropertyRowMapper<Person>(Person.class), id);
	}

	public void save(Person person) {
		jdbcTemplate.update("INSERT INTO Person VALUES (1, ?, ?, ?)", 
				person.getName(), person.getAge(), person.getEmail());
	}

	public void update(int id, Person updatePerson) {
		jdbcTemplate.update("UPDATE Person SET name = ?, age = ?, email = ? WHERE id = ?",
				updatePerson.getName(), updatePerson.getAge(), 
				updatePerson.getEmail(), updatePerson.getId());
	}

	public void delete(int id) {
		jdbcTemplate.update("DELETE FROM Person WHERE id = ?", id);
	}
}
