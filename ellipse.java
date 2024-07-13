public class ellipse extends circle {
    private double a;
    private double b;

    public ellipse(String name, double a, double b){
        super(name);
        if(a>b){
            this.a = a;
            this.b = b;
        }else{
            this.a = b;
            this.b = a;
        }
    }
    public void setAB(double a, double b){
        if(a>b){
            this.a = a;
            this.b = b;
        }else{
            this.a = b;
            this.b = a;
        }
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getArea(){
        return (Math.PI*a*b);
    }
    public double getPerimeter(){
        return(Math.PI*(Math.sqrt(2*((a*a)+(b*b))-((a-b)*(a-b))/2)));
    }
    public String toString(){
        return "Ellipse ' " + super.getName() + "' Perimeter: "+ this.getPerimeter() + " Area: " + this.getArea();
    }
    @Override
    public void scale(double factor) {
        this.a = (a*factor);
        this.b = (b*factor);
    }
}
