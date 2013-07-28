package com.noppanit.services;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created with IntelliJ IDEA.
 * User: ncharass
 * Date: 26/07/2013
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Api(value = "Food operations", listingClass = "FoodController", basePath = "/food", description = "All operations for food")
public class FoodController {

    @RequestMapping(value = "/food", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "List food", notes = "No note", responseClass = "com.noppanit.model.Food")
    public String listOfFoods() {
        return "home";
    }
}
