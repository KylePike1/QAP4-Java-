public class circle extends shape{
    private double radius = 1;

    public circle(String name){
        super(name);
    }
    
    public circle(String name, int radius){
        super(name);
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return(Math.PI*(radius*radius));
    }
    public double getPerimeter(){
        return( 2*Math.PI*radius);
    }
    public String toString(){
        return "Circle ' " + super.getName() + "' with Radius: " + radius + " Area: " + this.getArea() + " Perimeter: "+ this.getPerimeter();
    }
    @Override
    public void scale(double factor) {
        this.radius = (radius*factor);
        
    }
}
