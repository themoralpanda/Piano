package com.Piano;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EnterButton extends JButton {

    private Polygon shape;
    int width , height;
    int p1_x, p1_y , p2_x, p2_y, p3_x, p3_y, p4_x, p4_y, p5_x, p5_y , p6_x , p6_y;
    public EnterButton(int width, int height, int p1_x,int p1_y ,int p2_x,int p2_y,int p3_x,int p3_y,int p4_x,int  p4_y,int p5_x,int p5_y ,int p6_x ,int p6_y) {
        this.shape = new Polygon();
        
        this.p1_x = p1_x;
        this.p1_y = p1_y;
        this.p2_x = p2_x;
        this.p2_y = p2_y;
        this.p3_x = p3_x;
        this.p3_y = p3_y;
        this.p4_x = p4_x;
        this.p4_y = p4_y;
        this.p5_x = p5_x;
        this.p5_y = p5_y;
        this.p6_x = p6_x;
        this.p6_y = p6_y;
        
        // initialisiere Form
        this.initialize();
    }

    protected void initialize() {
        Point p1, p2, p3, p4, p5, p6;

        this.setSize(100, 250);

        p1 = new Point(p1_x, p1_y);
        p2 = new Point(p2_x, p2_y);
        p3 = new Point(p3_x, p3_y);
        p4 = new Point(p4_y, p4_y);
        p5 = new Point(p5_x, p5_y);
        p6 = new Point(p6_x, p6_y);

        this.shape.addPoint((int) Math.round(p1.getX()),
                (int) Math.round(p1.getY()));
        this.shape.addPoint((int) Math.round(p2.getX()),
                (int) Math.round(p2.getY()));
        this.shape.addPoint((int) Math.round(p3.getX()),
                (int) Math.round(p3.getY()));
        this.shape.addPoint((int) Math.round(p4.getX()),
                (int) Math.round(p4.getY()));
        this.shape.addPoint((int) Math.round(p5.getX()),
                (int) Math.round(p5.getY()));
        this.shape.addPoint((int) Math.round(p6.getX()),
                (int) Math.round(p6.getY()));
        this.setMinimumSize(this.getSize());
        this.setMaximumSize(this.getSize());
        this.setPreferredSize(this.getSize());
    }

    // Hit detection
    public boolean contains(int x, int y) {
        return this.shape.contains(x, y);
    }

    // Zeichne den Button
    protected void paintComponent(Graphics g) {
        Graphics2D gCopy = (Graphics2D) g.create();
        gCopy.fillPolygon(this.shape);

    }

    // zeichne die Border
    protected void paintBorder(Graphics g) {

    }



}
