package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Want to know who was Doctor ? " +
				"<ul>" +
					"<li><a href='http://localhost:8080/doctor/3'>The third !</a></li>" +
					"<li><a href='http://localhost:8080/doctor/7'>The seventh !</a></li>" +
					"<li><a href='http://localhost:8080/doctor/8'>The eighth !</a></li>" +
					"<li><a href='http://localhost:8080/doctor/13'>The thirteenth !</a></li>" +
				"</ul>";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String thirteenth() {
		return "The thirteenth Doctor was <a href='https://en.wikipedia.org/wiki/Jodie_Whittaker'>Jodie Whittaker !</a></br>" +
				"<a href='http://localhost:8080'>Index</a>";
	}

	@RequestMapping("/doctor/7")
	@ResponseBody
	public String seventh() {
		return "The seventh Doctor was <a href='https://en.wikipedia.org/wiki/Sylvester_McCoy'>Sylvester McCoy !</a></br>" +
				"<a href='http://localhost:8080'>Index</a>";
	}

	@RequestMapping("/doctor/8")
	@ResponseBody
	public String eighth() {
		return "The eighth Doctor was <a href='https://en.wikipedia.org/wiki/Paul_McGann'>Paul McGann !</a></br>" +
				"<a href='http://localhost:8080'>Index</a>";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String third() {
		return "The third Doctor was <a href='https://en.wikipedia.org/wiki/Jon_Pertwee'>Jon Pertwee</a></br>" +
				"<a href='http://localhost:8080'>Index</a>";
	}

}
