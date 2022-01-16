package edu.school.models;

public class SvgEllipse extends SVGObject{
    private int radiusX;
    private int radiusY;
    private int strokeWidth;

    public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}

    public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
	}

    public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

    public int getRadiusX() {
		return radiusX;
	}

    public int getRadiusY() {
		return radiusY;
	}

    public int getStrokeWidth() {
		return strokeWidth;
	}

    public SvgEllipse(int x, int y,int radiusX, int radiusY, Color strokeColor, int strokeWidth) {
		super(x, y, strokeColor);
		setRadiusX(radiusX);
		setRadiusY(radiusY);
		setStrokeWidth(strokeWidth);
	}

    @Override
	public String toSvgCode() {
		String result = "<ellipse ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
		result += "rx=\"" + getRadiusX() + "\" ry=\"" + getRadiusY() + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		result += "stroke=\"" + toRGB(getColor()) + "\" ";
		
		return result;
	}


}
