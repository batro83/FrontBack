package es.restApp.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import es.restApp.rest.RestTest;

public class RestAppApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestAppApplication() {
		singletons.add(new RestTest());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
