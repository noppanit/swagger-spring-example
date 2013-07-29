package com.saelors.model;

import com.wordnik.swagger.annotations.ApiClass;
import com.wordnik.swagger.annotations.ApiProperty;

/**
 * Created with IntelliJ IDEA.
 * User: saelors
 * Date: 26/07/2013
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
@ApiClass(value = "Food", description = "Food Class")
public class Food {
	@ApiProperty(value = "name", dataType = "String")
    private String name;
	@ApiProperty(value = "description", dataType = "String")
	private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
