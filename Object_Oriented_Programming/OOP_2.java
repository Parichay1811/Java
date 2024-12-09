//Getters and Setters
/*
 getters and setters are the functions of an class. Sometimes we have attributes in private and we want to access them from outside the class. We can use getters and setters for this.
 */
package Object_Oriented_Programming;

public class OOP_2 {
    public static class Car{
        private String brand;
        long price;
        String type;

        public String getBrand(){       //This is the getter() function. Using which we can get the value of the attribute but not change
            return brand;
        }
        public void setBrand(String brand){  //This is the setter() function. Using which we can change the value of the attribute. The type will be of void because it does not return anything but can change.
            this.brand = brand; //this keyword is used to refer the current object of the class. 'This' used to eliminate the confusion between the local variable and the class variable.
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.price = 2500000;
        c1.type = "Petrol";

        Car c2 = new Car();
        c2.brand = "Jaguar";
        c2.price = 50000000;
        c2.type = "Dissel";
        
        Car c3 = new Car();
        c3.brand = "TATA";
        c3.price = 384000;
        c3.type = "EV";
        // c3.setBrand("Rolls_royce"); //This will change the brand of c3 to Rolls_royce
        System.out.println(c3.getBrand());
        System.out.println(c3.brand);

    }
}
