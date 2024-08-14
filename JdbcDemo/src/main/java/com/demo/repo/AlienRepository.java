package com.demo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.demo.model.Alien;

@Repository
public class AlienRepository {
	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void save(Alien alien) {
		System.out.println("save()");
		String sql = "insert into ALIEN(id, name, tech) values(?,?,?)";
		int i = template.update(sql, alien.getId(), alien.getName(), alien.getTech());
		System.out.println("no of rows affected " + i);
	}

	public List<Alien> findAll() {
		System.out.println("findAll()");
		String sql = "select * from ALIEN";
		org.springframework.jdbc.core.RowMapper<Alien> rowMapper = new org.springframework.jdbc.core.RowMapper<Alien>() {
			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setTech(rs.getString(3));
				return a;
			}
		};
		/* for mapping rows of a
		 * {java.sql.ResultSet} on a per-row basis.
		 */
		List<Alien> aliens = template.query(sql, rowMapper);
		System.out.println(aliens.toString());
		return aliens;
	}
}
