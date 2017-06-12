package com.drools.version.six.my.rules;

import org.junit.Test;

public class Curd extends BaseKieRulesService {
	
	@Test
	public void test3(){
		kieSession.fireAllRules();
	}
	
	public static class User{
		public String name;
		
		public String mail;
		
		public int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
	}
	
}
