package mv.java.learning.basics;

//My first Import statement
import mv.java.learning.basics.model.MyFirstPOJO;

/*
My First Main class
- Create my first main method
- Create my first import
- Create my first declaration and Initialization
*/
public class MyFirstMainClass {

    // My first static main method
    public static void main(String[] args) {

        //My first object declaration and initialisation.
        MyFirstPOJO myFirstPOJO = new MyFirstPOJO();

        // Setting values for myfirststr and myfirstint under POJO instance using set method.
        myFirstPOJO.setMyfirststr("My First String");
        myFirstPOJO.setMyfirstint(0);

        // Accessing my myfirststr and myfirstint under POJO instance using get method.
        System.out.println("My First POJO ["
                + "Myfirststr "
                + myFirstPOJO.getMyfirststr() + " "
                + "MyFirstInt "
                + myFirstPOJO.getMyfirstint() + "]");

        //My second object declaration and initialisation with arguments
        MyFirstPOJO mySecondPOJO = new MyFirstPOJO("My Second String",1);

        //Accessing my second instance POJO variables using object class toString() method
        System.out.println(mySecondPOJO.toString());

    }
}
