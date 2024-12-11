
public class Box {
    double length;
    double height;
    double width;
    
    Box() {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }
    //cube
    Box(double side){
        this.width = side;
        this.length = side;
        this.height = side;
    }

    Box(double length, double width, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    Box(Box name){
        this.width = name.width;
        this.height = name.height;
        this.length = name.length;
    }
    public void displayInformation() {
        System.out.println("Running the box");
    }
}