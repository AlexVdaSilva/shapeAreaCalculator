package model.entities;

import model.enums.Color;

public class Pentagon extends AbstractShape{

	private Double perimeter;
	private Double apothem;
	
	public Pentagon(Color color, Double perimeter, Double apothem) {
		super(color);
		this.perimeter = perimeter;
		this.apothem = apothem;
	}

	public Double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(Double perimeter) {
		this.perimeter = perimeter;
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
