package spring_core.App;

import java.awt.Color;

public class Shape {
 

	//colour is a dependency of shape
	//private Colour colour = new Colour(colour:"RED");
	
	private Colour colour;
	public Shape(Colour col)
		{
			this.colour = col;
		}
	public void setcolour(Colour colour)
	{
		this.colour =colour;
	}
		
	public void draw()
	{
		System.out.println("drawing a shape with colour "+colour.getcolour());
	}
}
