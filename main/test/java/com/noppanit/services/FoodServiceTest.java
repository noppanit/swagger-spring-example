package com.noppanit.services;

import com.noppanit.model.Food;
import org.junit.Test;
import org.junit.internal.matchers.IsCollectionContaining;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: ncharass
 * Date: 26/07/2013
 * Time: 13:15
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class FoodServiceTest {

    @Autowired
    private FoodServiceImpl foodService;

    @Test
    public void shouldGetListOfFoods() throws Exception {
        List<Food> foods = foodService.listOfFoods();

        assertThat(foods.size(), is(0));
    }
}
