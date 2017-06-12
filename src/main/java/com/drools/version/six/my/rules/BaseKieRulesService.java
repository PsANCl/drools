package com.drools.version.six.my.rules;

import org.junit.Before;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class BaseKieRulesService {
	
	protected KieServices kieServices;
	
	protected KieContainer kieContainer;
	
	protected KieSession kieSession;
	
	@Before
	public void init(){
		System.setProperty("drools.dateformat", "yyyy-MM-dd");
		kieServices = KieServices.Factory.get();
		kieContainer = kieServices.getKieClasspathContainer();
		kieSession = kieContainer.newKieSession("ksession-rules");
	}
}
