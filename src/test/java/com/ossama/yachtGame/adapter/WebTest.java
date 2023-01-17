package com.ossama.yachtGame.adapter;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class WebTest {

    private MockMvc mockMvc;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public WebTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }
    @Test
    public void getOfHomePage() throws Exception {
        mockMvc.perform(get("/index.html"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string(containsString("<button>roll the dice</button>")));
    }
    @Test
    public  void postOfRollDice() throws Exception {
        mockMvc.perform(post("/rolldice"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/rollresult"));
    }
}
