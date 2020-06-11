/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JNIdemo.JNIapp;

/**
 *
 * @author Lakshan-Home
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CirclePainter extends JPanel implements ActionListener {

    Timer t = new Timer(5, this);
    double x = 400, y = 400, velocity = 0.005, rad = 0;

    private native void circleMove();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 10, 10);
        g2.fill(circle);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {

        circleMove();
        repaint();
        Toolkit.getDefaultToolkit().sync();
    }
}
