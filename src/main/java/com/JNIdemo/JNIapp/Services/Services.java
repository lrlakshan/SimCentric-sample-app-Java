/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp.Services;

import com.JNIdemo.JNIapp.CirclePainterWeb;
import com.JNIdemo.JNIapp.Figure8PainterWeb;
import com.JNIdemo.JNIapp.RaceTrackPainterWeb;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lakshan-Home
 */
@Service
public class Services {

    //circle draw service
    public CirclePainterWeb circleParams(double xValue, double yValue) {
        CirclePainterWeb circle = new CirclePainterWeb();
        circle.setX(xValue);
        circle.setY(yValue); 
        circle.run();
        return circle;
    }
    
    //Figure 8 draw service
    public Figure8PainterWeb drawFigure8Params(double xValue, double yValue) {
        Figure8PainterWeb fig8 = new Figure8PainterWeb();
        fig8.setX(xValue);
        fig8.setY(yValue); 
        fig8.run();
        return fig8;
    }
    
    //Race track draw service
    public RaceTrackPainterWeb drawRaceTrackParams(double xValue, double yValue) {
        RaceTrackPainterWeb raceTrack = new RaceTrackPainterWeb();
        raceTrack.setX(xValue);
        raceTrack.setY(yValue); 
        raceTrack.run();
        return raceTrack;
    }
}
