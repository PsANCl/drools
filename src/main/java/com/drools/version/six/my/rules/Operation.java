package com.drools.version.six.my.rules;

import org.junit.Test;

public class Operation extends BaseKieRulesService{

	@Test
	public void testDemo() {
		OperationPojo operation = new OperationPojo();
		operation.setAge(21);
		operation.setName("����");

		kieSession.insert(operation);
		kieSession.fireAllRules();

		OperationPojo operation3 = new OperationPojo();
		operation3.setName("����");
		operation3.setAge(18);
		kieSession.insert(operation3);
		
		OperationPojo operation6 = new OperationPojo();
		operation6.setName("Ǯ��");
		operation6.setAge(18);
		String [] arr = { "����", "����", "����", "Ǯ��" };
		setGolbal("arr", arr);
		kieSession.insert(operation6);
		kieSession.fireAllRules();
	}
	
	public void setGolbal(String key, Object value){
		kieSession.setGlobal(key, value);
	}

	public static class OperationPojo {

		public int age;

		public String name;

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

	}

}
