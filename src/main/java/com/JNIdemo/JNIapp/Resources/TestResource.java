/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp.Resources;

import com.JNIdemo.JNIapp.Services.TestService;
import com.JNIdemo.JNIapp.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lakshan-Home
 */
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/tests")
public class TestResource {

    @Autowired
    private TestService testService;
    
    @GetMapping
    public int getTest() {
        return 10;
    }

    @GetMapping("{username}")
    public Test getNameTest(@PathVariable String username) {
        return testService.findByname(username);
    }
}
