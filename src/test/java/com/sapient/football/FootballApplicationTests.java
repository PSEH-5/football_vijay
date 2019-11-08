package com.sapient.football;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sapient.football.constants.FootBallConstants;
import com.sapient.football.model.FootBall;

@SpringBootTest
class FootballApplicationTests extends FootBallTest{

@Before
public void setUp() {
   super.setUp();
}
@Test
public void getProductsList() throws Exception {

   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(FootBallConstants.GET_POSITION)
      .accept(MediaType.ALL)).andReturn();
   
   int status = mvcResult.getResponse().getStatus();
   assertEquals(200, status);
   String content = mvcResult.getResponse().getContentAsString();
   String[] footBall = super.mapFromJson(content, String[].class);
   assertTrue(footBall.length > 0);
}


}