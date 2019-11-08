package com.sapient.football.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.football.constants.FootBallConstants;
import com.sapient.football.model.FootBall;



/**
 * Handles requests for the FootBall service.
 */
@Controller
public class FootBallController {
	
	private static final Logger logger = LoggerFactory.getLogger(FootBallController.class);
	ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	//Map to store employees, ideally we should use database
	Map<Integer, FootBall> footBallData = new HashMap<Integer, FootBall>();

	
	@RequestMapping(value = FootBallConstants.GET_POSITION, method = RequestMethod.GET)
	public @ResponseBody List<FootBall> getPosition() {
		
		
		 final String uri = "https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		 FootBall[] footBall = null;
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(FootBallConstants.URL, String.class);
		    try {
			footBall = mapper.readValue(result, FootBall[].class);
				logger.info("--------------");
				logger.info("Start getFootBall. ID="+footBall[0]);
				String prettyfootBall= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(footBall[0]);
				logger.info("========================");
				logger.info("Start getFootBall pretty="+prettyfootBall);
		    } catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //System.out.println(result);
		
		//logger.info("Start getFootBall. ID="+result);
		
		return Arrays.asList(footBall);
	}
	
	
}

