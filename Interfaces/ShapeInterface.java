interface Shape{
    void area();
}

class Circle{
    int r;
    Circle(int r){
        this.r = r;
    }
    public void area(){
        float area = 3.14f*r*r;
        System.out.println("The area is "+area);
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
    }
}
