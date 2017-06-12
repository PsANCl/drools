package com.drools.version.six.my.rules;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class Property extends BaseKieRulesService {
	
	@Test
	public void property(){
		
		kieSession.fireAllRules();
		
	}
	
	public static void main(String[] args) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date dat = format.parse("12-Ê®Ò»ÔÂ-2017");
		System.out.println(format1.format(dat));
	}
	
	public static class PropertyPojo {
		
		private String name;
		
		private String mail;

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
