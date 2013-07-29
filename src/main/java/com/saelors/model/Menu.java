package com.saelors.model;

import com.wordnik.swagger.annotations.ApiClass;
import com.wordnik.swagger.annotations.ApiProperty;

/**
 * Created with IntelliJ IDEA.
 * User: saelors
 * Date: 29/07/2013
 * Time: 00:35
 * To change this template use File | Settings | File Templates.
 */
@ApiClass(value = "Menu", description = "Menu Class")
public class Menu {
	@ApiProperty(value = "food", dataType = "Food")
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
