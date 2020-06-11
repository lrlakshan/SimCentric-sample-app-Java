/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp.Services;

import com.JNIdemo.JNIapp.Test;
import java.util.Arrays;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lakshan-Home
 */
@Service
public class TestService {

    public Test findByname(String name) {
        Test t = new Test();
        
        System.out.println("before :" + Arrays.toString(t.getArr()));
        t.setName(name);
        t.run();
//        t.setNum(10);
        System.out.println("after :" + Arrays.toString(t.getArr()));
        return t;
    }
}
