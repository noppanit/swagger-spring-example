package com.saelors.services;

import com.wordnik.swagger.annotations.*;
//import com.wordnik.swagger.annotations.Api;
//import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.saelors.model.Menu;

/**
 * Created with IntelliJ IDEA.
 * User: saelors
 * Date: 26/07/2013
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/menu")
@Api(value = "Menu operations", listingClass = "MenuController", basePath = "/menu", description = "All operations for menu")
public class MenuController {

//	@ApiOperation(value = "Get menu item", notes = "No note", httpMethod = "GET", responseClass = "Menu")
//    @RequestMapping(value = "/{menuID}", method = RequestMethod.GET, produces = "application/json")
//    public
//    @ResponseBody
//    Menu getMenuItem(String test,
//    		@ApiParam(name = "menuID", value = "int")
//    		@PathVariable int menuID) {
//        return new Menu();
//    }
		
//	@ApiOperation(value = "List menu items", notes = "No note", httpMethod = "GET", responseClass = "List<Menu>")
//    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
//    public
//    @ResponseBody
//    List<Menu> getMenuItemList() {
//        return new ArrayList<Menu>();
//    }

	@ApiOperation(value = "Test date", notes = "No note", httpMethod = "GET", responseClass = "Date")
    @RequestMapping(value = "/date", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Date getDate() {
        return new Date();
    }



}
