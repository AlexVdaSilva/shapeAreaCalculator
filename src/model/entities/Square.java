package model.entities;

import model.enums.Color;

public class Square extends AbstractShape{
	
	private Double sideLenght;
	
	public Square(Color color, Double sideLenght) {
		super(color);
		this.sideLenght = sideLenght;
	}

	public Double getSideLenght() {
		return sideLenght;
	}

	public void setSideLenght(Double sideLenght) {
		this.sideLenght = sideLenght;
	}

	@Override
	public Double area() {
		return Math.pow(sideLenght, 2);
	}

}
