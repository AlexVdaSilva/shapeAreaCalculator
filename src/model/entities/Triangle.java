package model.entities;

import model.enums.Color;

public class Triangle extends AbstractShape{
	
	private Double base;
	private Double height;
	
	public Triangle(Color color, Double base, Double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return (base * height) / 2;
	}
	
}
