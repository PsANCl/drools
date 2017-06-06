package com.drools.version.five;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.junit.Test;

import com.drools.version.five.pojo.Message;

import junit.framework.TestCase;

public class Demo extends TestCase {
	
	@Test
	public void testDemo() throws Exception{
		RuleBase ruleBase = readRule();
		
		WorkingMemory workingMemory = ruleBase.newStatefulSession();
		
		Message message = new Message();
		message.setStatus(Message.HELLO);
		message.setMessage( "Hello World" );
		
		workingMemory.insert(message);
		workingMemory.fireAllRules();
		
		assertEquals(message.getMessage(), "Good Bye");
		
	}
	
	private static RuleBase readRule() throws DroolsParserException, IOException {
		//��дdrl�ļ�
		Reader reader = new InputStreamReader(
					Demo.class.getResourceAsStream("/five/demo1.drl"));
		
		//���DRLԴ��PackageBuilder��������Ӷ��
		PackageBuilder builder = new PackageBuilder();
		builder.addPackageFromDrl(reader);
		
		//���package��RuleBase��������򼯣�  
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(builder.getPackage());
		return ruleBase;
	}
}
