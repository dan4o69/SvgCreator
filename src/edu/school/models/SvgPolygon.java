package edu.school.models;

import java.awt.Color;

public class SvgPolygon extends SVGObject{
    private int points[];
    private int strokeWidth;

    public void setPoints(int[] points) {
		this.points = points;
	}

    public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public int[] getPoints() {
		return points;
	}

    public int getStrokeWidth() {
		return strokeWidth;
	}

    public SvgPolygon(Color strokeColor, Color fillColor, int strokeWidth, int... points){
		super(strokeColor);
        setPoints(points); 
        setStrokeWidth(strokeWidth);
	}

    @Override
	public String toSvgCode() {
		
		String result = "<polygon ";
		result += "points=\"";
		for(int i = 0; i < points.length; i++) {
			result += " " + getPoints()[i];
		}
		result += "\" ";
        result += "stroke=\"" + toRGB(getColor())+ "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		return result;
	}

}
