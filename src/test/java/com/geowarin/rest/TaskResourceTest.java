package com.geowarin.rest;

import com.geowarin.config.JerseyConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;

/**
 * Date: 05/03/2014
 * Time: 22:33
 *
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
public class TaskResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        ApplicationContext context = new AnnotationConfigApplicationContext(RestTestConfig.class);
        return new JerseyConfig()
                .property("contextConfig", context);
    }

    @Test
    public void testMessages() throws JSONException {
        final String messages = target("task/list.json").request().get(String.class);
        String expected = "[ " +
                "{ 'authorLogin': 'geowarin'}," +
                "]";
        JSONAssert.assertEquals(expected, messages, JSONCompareMode.LENIENT);
    }
}
