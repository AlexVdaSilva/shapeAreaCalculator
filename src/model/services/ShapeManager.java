package model.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.interfaces.Shape;

public class ShapeManager {
	
	private List<Shape> shapes = new ArrayList<>();
	
	public ShapeManager() {
	}
	
	public void addShape(Shape shape) {
		if (shape == null) {
			throw new IllegalArgumentException("Selecting a form is mandatory.");
		}
		shapes.add(shape);
	}
	
	public boolean removeShape(Shape shape) {
		return shapes.remove(shape);
	}
	
	public List<Shape> getShapes(){
		return Collections.unmodifiableList(shapes);
	}
	
	public double totalArea() {
		double sum = 0.0;
		for (Shape s: shapes) {
			sum += s.area();
		}
		return sum;
	}

}
