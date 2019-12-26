package com.example.whyIsSameBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhyIsSameBeanApplicationTests {

	@Autowired
	ParentService parentService;
	@Autowired
	ParentService<String> stringParentService;
	@Autowired
	ChildService childService;

	@Test
	public void contextLoads() {
		System.out.println(parentService == stringParentService); // false
		System.out.println(childService == stringParentService);  //true
	}

}
