public class triangle extends shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public triangle(String name){
        super(name);
    }

    public triangle(String name, double side1, double side2, double side3){
        super(name);
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else{
            
            System.out.println("Invalid side lengths to make a triangle");
        }
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getArea(){
        double semi = (side1 +side2+side3)/2;
        return Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle ' " + super.getName() + "' with Sides: 1: " + side1 + " 2: " + side2 + " 3: " + side3 +" Area: " + this.getArea() + " Perimeter: "+ this.getPerimeter();
    }
    @Override
    public void scale(double factor) {
        this.side1 = (side1*factor);
        this.side2 = (side2*factor);
        this.side3 = (side3*factor);
    }
}
