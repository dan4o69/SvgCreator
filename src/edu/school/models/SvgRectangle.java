package edu.school.models;

public class SvgRectangle extends SVGObject{
    private int height;
    private int width;
    private int strokeWidth;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getStrokeWidth() {
		return strokeWidth;
	}

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
  
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

    public SvgRectangle(int x, int y, int width, int height,int strokeWidth, Color strokeColor){
		super(x, y, strokeColor);
        setHeight(height);
        setWidth(width);
        setStrokeWidth(strokeWidth);
	}

    @Override
    public String toSvgCode(){
        String result = "<rect ";
        result += "x=\"" + getX() + "\" y=\"" + getY() + "\" ";
        result += "\" height=\"" + getHeight() + "\" width=\"" + getWidth() + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        return result;
    }

}
