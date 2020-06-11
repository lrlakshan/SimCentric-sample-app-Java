package com.JNIdemo.JNIapp;

import java.awt.BorderLayout;
import javax.swing.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application implements CommandLineRunner {

    static {
        System.load("G:/Simcentric/Sample App/Netbeans/JNIappCdl/dist/libJNIappCdl.dll");
    }
    
    private native void nativePrint();

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        new SpringApplicationBuilder(Application.class).headless(false).run(args);
////        System.out.println(System.getProperty("java.library.path"));
//
//        Figure8Painter figure8 = new Figure8Painter();
        CirclePainter circle = new CirclePainter();
//        RaceTrackPainter RT = new RaceTrackPainter();
//        PathDraw PD = new PathDraw();
        JFrame frame = new JFrame();
        frame.add(circle);
        frame.setVisible(true);
        frame.setSize(120, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ball movement");
//        new Test();
//        test.nativePrint();
    }

    @Override
    public void run(String... strings) throws Exception {
////        Figure8Painter figure8 = new Figure8Painter();
//        CirclePainter circle = new CirclePainter();
////        RaceTrackPainter RT = new RaceTrackPainter();
////        PathDraw PD = new PathDraw();
//        JFrame frame = new JFrame();
//        frame.add(circle);
//        frame.setVisible(true);
//        frame.setSize(1200, 800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Ball movement");
    }

}
