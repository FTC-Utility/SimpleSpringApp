package com.simplespring.web.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import javax.swing.text.View;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Eyuel Tadesse on 12/16/2016.
 */
public class HomeControllerTest {
    @Test
    public void getHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/home")).andExpect(view().name("home"));

    }

}