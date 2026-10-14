package model.entities;

import model.enums.Color;

public class Heptagon extends AbstractShape{
	
	public Double sideLenght;
	public Double apothem;

	public Heptagon(Color color, Double sideLenght, Double apothem) {
		super(color);
		this.sideLenght = sideLenght;
		this.apothem = apothem;
	}

	public Double getSideLenght() {
		return sideLenght;
	}

	public void setSideLenght(Double sideLenght) {
		this.sideLenght = sideLenght;
	}

	public Double getApothem() {
		return apothem;
	}

	public void setApothem(Double apothem) {
		this.apothem = apothem;
	}

	@Override
	public Double area() {
		return (7/2) * sideLenght * apothem;
	}

}
