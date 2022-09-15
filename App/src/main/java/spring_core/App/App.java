package spring_core.App;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Shape sh = new Shape();
//        sh.draw();
        
        Colour red = new Colour();
        red.setcolour("red");
        
        //injecting dependency colour into the shape class via the constructor
        //Also called as constructor  injection 
        Shape circle = new Shape(red);
        circle.draw();
    }
}
