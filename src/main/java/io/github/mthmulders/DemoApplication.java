package io.github.mthmulders;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import io.github.mthmulders.endpoints.DemoEndpoint;

@ApplicationPath("resources")
public class DemoApplication extends Application {
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JacksonJaxbJsonProvider());
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(DemoEndpoint.class);
		return classes;
	}
}
