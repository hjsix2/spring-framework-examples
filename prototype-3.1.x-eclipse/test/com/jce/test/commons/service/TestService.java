package com.jce.test.commons.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jce.joycity.sample.service.SampleService;
import com.jce.mvc.commons.annotation.OnlyTestComponent;
import com.jce.test.AbstractContextTest;

@OnlyTestComponent
public class TestService extends AbstractContextTest {
	
	@Autowired 
	private SampleService sampleService;
	
	@Test
	public void test() throws Exception {
		
		boolean expected = true;
		boolean isConn = sampleService.checkDBConn(1);
		assertThat(isConn, is(expected));
	}

}