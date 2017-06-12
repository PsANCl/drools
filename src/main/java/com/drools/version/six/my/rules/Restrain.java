package com.drools.version.six.my.rules;

import org.junit.Test;

/**
 * restrain Ô¼Êødemo , && ||
 * @author yf
 *
 */
public class Restrain extends BaseKieRulesService{

	@Test
	public void testDemo1(){
		RestrainPojo pojo = new RestrainPojo();
		pojo.setAge(21);
		pojo.setName("ÕÅÈý");
		
		kieSession.insert(pojo);
		kieSession.fireAllRules();
		
	}
	
	public static class RestrainPojo{
		
		public int age;
		
		public String name;
		
		public String mail;
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

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
		
		
	}
	
}
