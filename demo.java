import java.util.*;

public class demo {
    public static void main(String[] args){
        ArrayList list = new ArrayList<shape>();
        circle c1 = new circle("Dave", 32);
        ellipse e1 = new ellipse("Jim", 32, 80);
        triangle t1 = new triangle("Harry", 23, 37, 19);
        equilateralTriangle et1 = new equilateralTriangle("Peter", 56);
        list.add(c1);
        list.add(e1);
        list.add(t1);
        list.add(et1);
        //System.out.println(list);
        //for(int i=0;i<list.size();i++){
            //System.out.println(list.get(i).toString());
        //}

        ArrayList list2 = new ArrayList<scalable>();
        list2.add(et1);
        list2.add(t1);
        list2.add(c1);
        list2.add(e1);
        System.out.println("Origional List:");
        System.out.println("");
        System.out.println(list2);
        System.out.println("");
        System.out.println("Scaled List:");
        System.out.println("");



        System.out.println(scaleBy(list2, 5));
    }

    public static String scaleBy(ArrayList<scalable> list3, double factor){
        for(int i=0;i<list3.size();i++){
            list3.get(i).scale(factor);
            System.out.println(list3.get(i).toString());
        }
        return "Done";
    }

    
    
    

    

    
}
