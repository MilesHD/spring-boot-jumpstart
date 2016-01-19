package com.readingList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Startup Spring Application using the ReadingListApplication as
// Application Context
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReadingListApplication.class)
// Run application in an embedded servlet container for Integration Testing
@WebAppConfiguration
public class ReadingListApplicationTests {

	@Test
	public void contextLoads() {
		// Tests that the application context loads
	}

}
