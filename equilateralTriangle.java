public class equilateralTriangle extends triangle {
    private double side;

    public equilateralTriangle(String name, double side){
        super(name);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }

    public double getArea(){
        return ((Math.sqrt(3)/4)*(side*side));
    }
    public double getPerimeter(){
        return 3*side;
    }
    public String toString(){
        return "Equilateral Triangle ' " + super.getName() + "' with Side Length: " + side +" Area: " + this.getArea() + " Perimeter: "+ this.getPerimeter();
    }
    @Override
    public void scale(double factor) {
        this.side = (side*factor);
    }
    
}
