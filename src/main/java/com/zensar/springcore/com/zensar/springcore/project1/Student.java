package com.zensar.springcore.com.zensar.springcore.project1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	
	private int id;
	private String name;
	private int age;
	private Address a;
	
	private List marks;
	private Set<Address> setAddress;
	
	private Map<String, String> certifications;
	
	private Map<Address, String> example;
	
	private String[] namesArray;
	

	public String[] getNamesArray() {
		return namesArray;
	}



	public void setNamesArray(String[] namesArray) {
		this.namesArray = namesArray;
	}



	public Map<Address, String> getExample() {
		return example;
	}
	
	
	
	public void setExample(Map<Address, String> example) {
		this.example = example;
	}
	public Map<String, String> getCertifications() {
		return certifications;
	}
	public void setCertifications(Map<String, String> certifications) {
		this.certifications = certifications;
	}
	public Set<Address> getSetAddress() {
		return setAddress;
	}
	public void setSetAddress(Set<Address> setAddress) {
		this.setAddress = setAddress;
	}
	public List getMarks() {
		return marks;
	}
	public void setMarks(List marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int age, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.a = a;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	public Student() {
		super();
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", a=" + a + ", marks=" + marks
				+ ", setAddress=" + setAddress + ", certifications=" + certifications + ", example=" + example
				+ ", namesArray=" + Arrays.toString(namesArray) + "]";
	}



	
	
	

}
