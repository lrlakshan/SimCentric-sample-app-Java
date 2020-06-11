/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp.Resources;

import com.JNIdemo.JNIapp.CirclePainterWeb;
import com.JNIdemo.JNIapp.Figure8PainterWeb;
import com.JNIdemo.JNIapp.RaceTrackPainterWeb;
import com.JNIdemo.JNIapp.Services.Services;
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
//@RequestMapping("/circleDraw")
public class Resources {
    
    @Autowired
    private Services service;
    
    @GetMapping("circleDraw/{xValue}/{yValue}")
    public CirclePainterWeb drawCircle(@PathVariable double xValue, @PathVariable double yValue) {
        return service.circleParams(xValue,yValue);
    }
    
    @GetMapping("figure8Draw/{xValue}/{yValue}")
    public Figure8PainterWeb drawFigure8(@PathVariable double xValue, @PathVariable double yValue) {
        return service.drawFigure8Params(xValue,yValue);
    }
    
    @GetMapping("racTrackDraw/{xValue}/{yValue}")
    public RaceTrackPainterWeb drawRaceTrack(@PathVariable double xValue, @PathVariable double yValue) {
        return service.drawRaceTrackParams(xValue,yValue);
    }
}
