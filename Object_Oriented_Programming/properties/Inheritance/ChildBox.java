public class ChildBox extends Box {
    double weight;

    public ChildBox(){
        this.weight = -1;
        this.height = 9;
        // this.length = 12;
    }
    public ChildBox(double length, double height, double width, double weight){
        super(length, height, width);       //these are the values from the parent class. it means call the parent class constructor.
        //used to initialize the values present in the parent class.
        //But, this child will not able to initialize the values of the parent class those all are decleared in the private.
        this.weight = weight;
    }
}
