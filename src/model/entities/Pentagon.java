package model.entities;

import model.enums.Color;

public class Pentagon extends AbstractShape{
	
	private Double sideLenght;
	private Double apothem;

	public Pentagon(Color color, Double sideLenght, Double aphotem) {
		super(color);
		this.sideLenght = sideLenght;
		this.apothem = aphotem;
	}

	public Double getSideLenght() {
		return sideLenght;
	}

	public void setSideLenght(Double sideLenght) {
		this.sideLenght = sideLenght;
	}

	public Double getAphotem() {
		return apothem;
	}

	public void setAphotem(Double aphotem) {
		this.apothem = aphotem;
	}

	@Override
	public Double area() {
		return (5 / 2) * sideLenght * apothem;
	}
	
}
