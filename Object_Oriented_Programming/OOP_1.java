package Object_Oriented_Programming;
// import student.java

public class OOP_1{
    public static class Student{           //creating a class with student datatype
        //attributes👇🏻
        String name;
        int roll_no;
        double presentage;
        //we have just created the class or the templete in the above line
    }
    public static void main(String[] args){
        Student Parichay = new Student();  //Syntax:  ClassName objName = new ClassName (). Which similer to Scanner in = new Scanner(System.in). int a = in.nextInt();
        Parichay.name = "Parichay";
        Parichay.roll_no = 66;
        Parichay.presentage = 78.6;
        System.out.println(Parichay.roll_no);

        Student Sagar = new Student();
        Sagar.name = "Sagar";
        Sagar.roll_no = 67;
        Sagar.presentage = 80.5;
        System.out.println(Sagar.roll_no);
        // Student s1 = new Student()

        //Parichay and Sagar is containing the attributes/ properties of Student, eventhough they are differenct but all the properties belongs to the class Student. This Parichay and Sagar is called as object of the class Student.

        //definition: Class is a template of objects . Objects are instances of classes which contains all the attributes of class.
        
    }
    
}

//if we create our class in a different file then we have to import that class in the file where we want to use it.
// import package_name.Class_name; example import OOP_1.Student

// Method:
//  A method is a block of code which can be called multiple times from our program.

//example:
/*
    class Numbers {
      // Properties
      private int a;
      private int b;
  
      // Methods
      public void sum(){            //this is a method, we can call this method multiple times from our program, it is returning (a + b) means add a and b.
        System.out.println(a+b);
    }
  
      public void sub(){
          System.out.println(a-b);
    }
  
    public static void main (String[] args) {
      
          // Creating Instance of Class
          // Object
        Numbers obj=new Numbers();
      
          // Assigning Values to the Properties
          obj.a=1;
          obj.b=2;
      
          // Using the Methods
          obj.sum();
          obj.sub();
    }
}
 */