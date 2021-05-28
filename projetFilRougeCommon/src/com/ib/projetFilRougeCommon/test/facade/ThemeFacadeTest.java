package com.ib.projetFilRougeCommon.test.facade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ib.projetFilRougeCommon.bo.Theme;
import com.ib.projetFilRougeCommon.facade.IThemeFacade;
import com.ib.projetFilRougeCommon.facade.ThemeFacade;

class ThemeFacadeTest {
	private static IThemeFacade themeFacade = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// demarrage de spring
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCommon.xml");

		themeFacade = context.getBean("themeFacade", ThemeFacade.class);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindAll() {
		List<Theme> themes = themeFacade.findAll();

		// on controle le bouchon
		assertNotNull(themes);
		assertEquals(1, themes.size());
	}

}
