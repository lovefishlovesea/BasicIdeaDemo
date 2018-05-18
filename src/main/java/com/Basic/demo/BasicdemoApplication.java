package com.Basic.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BasicdemoApplication {

	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;

	@Autowired
	private AuthorSettings authorSettings;

	@Autowired
	private EmploysSetting employsSetting;
//	@Autowired
//	private HelpSettings helpSettings;

	@Autowired
	private CompanyEmployee companyEmployee;

	@RequestMapping("/")
	String index()
	{
		return "book name is:"+bookName+" and book author is:"+bookAuthor;
	}

	@RequestMapping("/author")
	public String index2()
	{
		return "author name is "+authorSettings.getName()+" and author age is "+authorSettings.getAge();
	}

	@RequestMapping("/company")
	public String index4()
	{
		return "employs:"+employsSetting.getEmploys();
	}

	@RequestMapping("/employ")
	public String index5()
	{
		return "Company Employee han:"+companyEmployee.getEmployhan()+",Liu:"+
				companyEmployee.getEmployliu();
	}
//	@RequestMapping("/help")
//	public String index3()
//	{
//		return "help name is "+helpSettings.getName()+" and age is "+helpSettings.getAge();
//	}

	public static void main(String[] args) {
		SpringApplication.run(BasicdemoApplication.class, args);
//		SpringApplication applicaiton=new SpringApplication(BasicdemoApplication.class);
//		applicaiton.setBannerMode(Banner.Mode.OFF);
//		applicaiton.run(args);

	}

}
