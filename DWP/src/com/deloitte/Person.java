package com.deloitte;

import java.util.List;

public class Person {
	private String name;
	private String gender;
	private List<String> langs;
	private String country;
	
	
	public Person() {
		
	}
	public Person(String name, String gender, List<String> langs, String country) {
		
		this.name = name;
		this.gender = gender;
		this.langs = langs;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getLangs() {
		return langs;
	}
	public void setLangs(List<String> langs) {
		this.langs = langs;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
