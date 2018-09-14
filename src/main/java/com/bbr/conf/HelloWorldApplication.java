package com.bbr.conf;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Obligatoire en Reasteasy > 3.0 (Servlet 3.0) sans la conf avec le web.xml
 *
 */
@ApplicationPath("rest")
public class HelloWorldApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public HelloWorldApplication() {
//        singletons.add(new HomeResource());
    }

//    @Override
//    public Set<Object> getSingletons() {
//        return singletons;
//    }
//
//    @Override
//    public Set<Class<?>> getClasses() {
//        return empty;
//    }
}
