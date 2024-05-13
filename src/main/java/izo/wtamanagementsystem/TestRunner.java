package izo.wtamanagementsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
@Slf4j
public class TestRunner implements ApplicationRunner{

	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Connection connection = dataSource.getConnection();

		jdbcTemplate.execute("INSERT INTO professor(name, birth, tel, gender, address, id_user)" +
				"VALUES ('김교수', '950320', '010-1234-1234', 'F', '경기도 고양시 어쩌구', '1')");

		//JdbcTemplete
		//member
//		jdbcTemplate.execute("INSERT INTO member (user_Id, password, name, email, point, role) " +
//				"VALUES ('asd', '$2a$10$X9wa1a5pOcJ7rnkWgDmuceEX8ZYqojJv31qPyA7uRPfVU0C6x.QXm', '테스트01', 'test@naver.com', 100, 'ROLE_ADMIN')");
//		jdbcTemplate.execute("INSERT INTO member (user_Id, password, name, email, point, role) " +
//				"VALUES ('asd2', '$2a$10$lLJDifm5WvqkXOSrZlZZ6.NQyqek/ku4RAUf5lzAx/DvyPPoBLgB2', '테스트02', 'test2@naver.com', 200, 'ROLE_USER')");
	}

}
