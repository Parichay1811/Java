package Object_Oriented_Programming;
//Constructor
public class constructor {
    /*
        innitially we used to first declare the object then we had to write all its parameters.
        but with the help of the constructor we can Write those in a single line.
        Student s1 = new Student ("Parichay", 57, 99.78);
        which is simillar to Scanner in = new Scanner(System.in);
     */
    public static class Player{
        String name;
        int runs;
        //create constructor
        public Player(String naam, int run){        //Player is a datatype and the whole is a function
            name = naam;
            runs = run;
        }
        //Constructor is a function which has a same name of the parent class the attributes should be in the same order
        public String getName(){
            return name; 
        }
        public void setName(String name){
            this.name = name;
        }
        public int getRuns(){
            return runs;
        }
        public void setRuns(int runs){
            this.runs = runs;
        }
    }
    public static void main(String[] args) {
        Player p1 = new Player("Dhoni", 100);
        System.out.println(p1.name);
        System.out.println(p1.runs);
        Player p2 = new Player("Sachin", 200);
        System.out.println(p2.name);
        System.out.println(p2.runs);
        Player p3 = new Player("Kohli", 140);
        System.out.println(p3.name);
        System.out.println(p3.runs);
    }
}


/*
 * It is never possible to declear a non-static variable inside a static class 
 * But, we can always declear a static variable inside a non-static class
 */ 
