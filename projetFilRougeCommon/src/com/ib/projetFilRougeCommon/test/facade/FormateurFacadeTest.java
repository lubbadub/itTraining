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

import com.ib.projetFilRougeCommon.bo.Formateur;
import com.ib.projetFilRougeCommon.facade.FormateurFacade;
import com.ib.projetFilRougeCommon.facade.IFormateurFacade;

class FormateurFacadeTest {
	private static IFormateurFacade formateurFacade = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// demarrage de spring
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCommon.xml");

		formateurFacade = context.getBean("formateurFacade", FormateurFacade.class);
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
		List<Formateur> formateurs = formateurFacade.findAll();

		// on controle le bouchon
		assertNotNull(formateurs);
		assertEquals(1, formateurs.size());
	}

}
