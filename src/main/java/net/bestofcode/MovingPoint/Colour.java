package net.bestofcode.MovingPoint;

import net.bestofcode.MovingPoint.annotations.Refactor;

@Refactor
public class Colour extends java.awt.Color {

    public Colour(int r, int g, int b) {
        super(r,g,b);    
    }
    
    public Colour(int rgb) {
        super(rgb);    
    }
}