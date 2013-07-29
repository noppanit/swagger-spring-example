package com.saelors.controllers;

import com.saelors.serializer.DateSerializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ncharass
 * Date: 30/07/2013
 * Time: 00:20
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BootstrapController implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        new DateSerializer();
    }
}
