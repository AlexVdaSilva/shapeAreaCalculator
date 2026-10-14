package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Decagon;
import model.entities.Heptagon;
import model.entities.Hexagon;
import model.entities.Nonagon;
import model.entities.Octagon;
import model.entities.Pentagon;
import model.entities.Rectangle;
import model.entities.Square;
import model.entities.Triangle;
import model.enums.Color;
import model.services.ShapeManager;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ShapeManager manager = new ShapeManager();
		
		int sT = -1;
		
		do { System.out.println("\033[1m---SHAPE PROGRAM EXAMPLE---\033[0m");
		System.out.println("Please select the shape type:\n"
				+ "0 - CLOSE\n"
				+ "1 - CIRCLE\n"
				+ "2 - TRIANGLE\n"
				+ "3 - SQUARE\n"
				+ "4 - RECTANGLE\n"
				+ "5 - PENTAGON\n"
				+ "6 - HEXAGON\n"
				+ "7 - HEPTAGON\n"
				+ "8 - OCTAGON\n"
				+ "9 - NONAGON\n"
				+ "10 - DECAGON\n"
				+ "Enter choice: ");
		sT = sc.nextInt();
		
		switch (sT) {
		case 0 -> {
			System.out.println("Exiting program...");
		}
		
		case 1 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Radius: ");
			double radius = sc.nextDouble();
			
			manager.addShape(new Circle(color, radius));
			System.out.println("Circle added successfully!");
		}
		
		case 2 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Base: ");
			double base = sc.nextDouble();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			
			manager.addShape(new Triangle(color, base, height));
			System.out.println("Triangle added successfully!");
		}
		
		case 3 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Side lenght: ");
			double sideLenght = sc.nextDouble();
			
			manager.addShape(new Square(color, sideLenght));
			System.out.println("Square added successfully!");
		}
		
		case 4 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Width: ");
			double width = sc.nextDouble();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			
			manager.addShape(new Rectangle(color, width, height));
			System.out.println("Rectangle added successfully!");
		}
		
		case 5 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Width: ");
			double sideLenght = sc.nextDouble();
			System.out.println("Height: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Pentagon(color, sideLenght, apothem));
			System.out.println("Pentagon added successfully!");
		}
		
		case 6 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Width: ");
			double perimeter = sc.nextDouble();
			System.out.println("Height: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Hexagon(color, perimeter, apothem));
			System.out.println("Hexagon added successfully!");
		}
		
		case 7 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Perimeter: ");
			double perimeter = sc.nextDouble();
			System.out.println("Apothem: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Heptagon(color, perimeter, apothem));
			System.out.println("Heptagon added successfully!");
		}
		
		case 8 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Perimeter: ");
			double perimeter = sc.nextDouble();
			System.out.println("Apothem: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Octagon(color, perimeter, apothem));
			System.out.println("Octagon added successfully!");
		}
		
		case 9 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Perimeter: ");
			double perimeter = sc.nextDouble();
			System.out.println("Apothem: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Nonagon(color, perimeter, apothem));
			System.out.println("Nonagon added successfully!");
		}
		
		case 10 -> {
			System.out.println("Color (rainbow's colors): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			System.out.println("Width: ");
			double perimeter = sc.nextDouble();
			System.out.println("Height: ");
			double apothem = sc.nextDouble();
			
			manager.addShape(new Decagon(color, perimeter, apothem));
			System.out.println("Decagon added successfully!");
		}
		
		}
		
		sc.close();
		
		} while (sT != 0);

	}

}
