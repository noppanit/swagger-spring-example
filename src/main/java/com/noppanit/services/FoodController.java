package com.noppanit.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created with IntelliJ IDEA.
 * User: ncharass
 * Date: 26/07/2013
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodController {

    @RequestMapping("/food")
    public String listOfFoods() {
        return "home";
    }
}
