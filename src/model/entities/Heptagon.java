package model.entities;

import model.enums.Color;

public class Heptagon extends AbstractShape{
	
	public Double perimeter;
	public Double apothem;

	public Heptagon(Color color, Double sideLenght, Double apothem) {
		super(color);
		this.perimeter = sideLenght;
		this.apothem = apothem;
	}

	public Double getSideLenght() {
		return perimeter;
	}

	public void setSideLenght(Double sideLenght) {
		this.perimeter = sideLenght;
	}

	public Double getApothem() {
		return apothem;
	}

	public void setApothem(Double apothem) {
		this.apothem = apothem;
	}

	@Override
	public Double area() {
		return (perimeter * apothem) / 2;
	}

}
