package org.shadow.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class LoginServiceTest {

	@Autowired
	private LoginService loginService;

	@Test
	public void testVerify() {
		String name = "admin";
		String password = "admin";

		boolean result = loginService.verity(name, password);
		System.err.println("verify result:" + result);
	}

}
