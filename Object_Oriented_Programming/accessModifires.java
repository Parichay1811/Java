/*
default values:
    Suppose we have a class and we have created an object but have not assigned any value to its attributes. In such a case, the attributes will have default values. 
    the answer will be null, 0 or 0.0 based on thhe dataType of the attributes, it means we have the attributes but we have not assigned any value to them. in future we can assign any value to them and use them in our program.
*/
package Object_Oriented_Programming;


public class accessModifires {
    /*access means giving the permission
     * public: for all packages
     * private: it is accessable with in that particular class
     * default: accessable with in the same package or folder
    */
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Parichay";
        s1.roll_no = 1;
        s1.presentage = 89.76;
        System.out.println(s1.name);
    }
}
