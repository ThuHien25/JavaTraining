package AbstractFactory;
/**
 * @author ThuHien
 * Start demo Abstract Factory Pattern 
 */

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		//get an object of Shape Circle 
		IShape shape1 = shapeFactory.getShape("circle");
		
		//call draw method of Shape Circle
		shape1.draw();
		
		//get an object of Shape Rectangle 
		IShape shape2 = shapeFactory.getShape("Rectangle");
				
		//call draw method of Shape Rectangle
		shape2.draw();
		
		//get an object of Shape Square 
		IShape shape3 = shapeFactory.getShape("Square");
						
		//call draw method of Shape Square
		shape3.draw();
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");

		// get an object of color Circle
		IColor color1 = colorFactory.getColor("Blue");

		// call draw method of Shape Circle
		color1.fill();

		// get an object of Shape Rectangle
		IColor color2 = colorFactory.getColor("Red");

		// call draw method of Shape Rectangle
		color2.fill();

		// get an object of Shape Square
		IColor color3 = colorFactory.getColor("Green");

		// call draw method of Shape Square
		color3.fill();

	}
}
