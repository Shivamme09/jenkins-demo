package com.practice.jenkinsdemo.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;

@WebMvcTest
public class TestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("Test Controller1")
    void testWelcomeMessage() throws Exception {

        mockMvc.perform(get("/test/welcome"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World !!"));

    }

    @Test
    @DisplayName("Test Controller2")
    void testExitMessage() throws Exception {

        mockMvc.perform(get("/test/bye"))
                .andExpect(status().isOk())
                .andExpect(content().string("Bye !!"));

    }

}
