package es.back.testApp.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import es.back.testApp.rest.Rest;

public class RestApplication extends Application{
	
	private Set<Object> singletons = new HashSet<Object>();

	public RestApplication() {
		singletons.add(new Rest());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
