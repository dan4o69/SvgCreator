package edu.school.models;

import java.awt.Color;

public class SVGCircle extends SVGObject{

    private int radius;
    private int strokeWidth;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

    public int getRadius() {
        return this.radius;
    }

    public int getStrokeWidth() {
		return strokeWidth;
	}

    public SVGCircle(int x, int y, int radius, Color strokeColor, int strokeWidth){
		super(x, y, strokeColor);
        setRadius(radius);
        setStrokeWidth(strokeWidth);
	}

    @Override
	public String toSvgCode() {
		String result = "<circle ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
		result += "r=\"" + getRadius() + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\" ";
		result += "stroke=\"" + toRGB(getColor()) + "\" ";
        return result;
    }

}
