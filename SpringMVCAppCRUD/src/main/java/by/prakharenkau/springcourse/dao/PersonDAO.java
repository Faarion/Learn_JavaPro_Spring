package by.prakharenkau.springcourse.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
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

	
	////////////////////////////////
	/// Тестируем производительность пакетной вставки
	/// ////////////////////////
	public void testMultipleUpdate() {
		
		List<Person> people = create1000People();
		long before = System.currentTimeMillis();
		
		for (Person person : people) {
			jdbcTemplate.update("INSERT INTO Person VALUES (?, ?, ?, ?)",
					person.getId(), person.getName(), 
					person.getAge(), person.getEmail());
		}
		
		long after = System.currentTimeMillis();
		System.out.println("Time 1000 sql comand: " + (after - before));
	}
	
	public void testBatchUpdate() {
		List<Person> people = create1000People();
		
		long before = System.currentTimeMillis();
		
		jdbcTemplate.batchUpdate("INSERT INTO Person VALUES (?, ?, ?, ?)",
				new BatchPreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						ps.setInt(1, people.get(i).getId());
						ps.setString(2, people.get(i).getName());
						ps.setInt(3, people.get(i).getAge());
						ps.setString(4, people.get(i).getEmail());
					}
					
					@Override
					public int getBatchSize() {
						return people.size();
					}
				});
		
		long after = System.currentTimeMillis();
		System.out.println("Time batch update: " + (after - before));
	}

	private List<Person> create1000People() {
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 1000; i++) {
			people.add(new Person(i, "Name " + i, 30, "test" + i + "@mail.ruf"));
		}
		return people;
	}
}
