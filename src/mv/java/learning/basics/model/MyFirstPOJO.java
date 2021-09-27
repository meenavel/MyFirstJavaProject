package mv.java.learning.basics.model;

/**
My first Plain Old Jva Object project.
-Variable declaration.
-No Argument constructor.
-Parametrised constructor.
-Getter Setter Method declaration.
-Method overriding.
**/

public class MyFirstPOJO {

    // My first variable declaration.
    private String myfirststr;
    private int myfirstint;

    // My first Default Constructor.
    public MyFirstPOJO(){
        System.out.println("My first POJO class is initialised using no arguments constructor");
    }

    // My first Parametrised Constructor.
    public MyFirstPOJO(String myfirststr,int myfirstint){
        System.out.println("My first POJO class initialised using parametrised constructor");
        this.myfirststr = myfirststr;
        this.myfirstint = myfirstint;
    }

    //My first Getter Setter method creation.

    public String getMyfirststr() {
        return myfirststr;
    }

    public void setMyfirststr(String myfirststr) {
        this.myfirststr = myfirststr;
    }

    public int getMyfirstint() {
        return myfirstint;
    }

    public void setMyfirstint(int myfirstint) {
        this.myfirstint = myfirstint;
    }

    //My first method overriding.
    @Override
    public String toString() {
        return "My First POJO [" +
                "Myfirststr " + myfirststr + " " +
                "Myfirstint " + myfirstint +
                ']';
    }
}
