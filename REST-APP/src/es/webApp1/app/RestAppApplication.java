package es.webApp1.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import es.back.restServices.RestApp;

public class RestAppApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestAppApplication() {
		singletons.add(new RestApp());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
