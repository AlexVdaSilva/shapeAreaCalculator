package model.entities;

import model.enums.Color;
import model.interfaces.Shape;

public abstract class AbstractShape implements Shape {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String shapeType = this.getClass().getSimpleName();
		return "Shape: " + shapeType 
				+ "\nColor: " + getColor()
				+ "\nArea: " + String.format("%.2f", area());
	}

}
