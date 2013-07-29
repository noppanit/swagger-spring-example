package com.saelors.serializer;

import com.wordnik.swagger.core.ApiPropertiesReader;
import com.wordnik.swagger.core.DocumentationObject;
import com.wordnik.swagger.core.util.JsonUtil;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ncharass
 * Date: 30/07/2013
 * Time: 00:21
 * To change this template use File | Settings | File Templates.
 */
public class DateSerializer {

    public DateSerializer() {
        try {
            String jsonString = "\n" +
                    "{\n" +
                    "  \"name\": \"Date\",\n" +
                    "  \"fields\": [\n" +
                    "    {\n" +
                    "      \"name\": \"value\",\n" +
                    "      \"description\": \"Date in milliseconds since epoch\",\n" +
                    "      \"notes\": \"Add any notes you like here\",\n" +
                    "      \"paramType\": \"long\",\n" +
                    "      \"required\": true,\n" +
                    "      \"allowMultiple\": false\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}\n";

            DocumentationObject m = JsonUtil.getJsonMapper().readValue(jsonString, DocumentationObject.class);
            String className = java.util.Date.class.getName();
            ApiPropertiesReader.add(className, "Date", m);
            System.out.println("Date Serializer... started");
        } catch (IOException e) {
            // handle this, of course!
            e.printStackTrace();
        }
    }
}