package staticElements;

public class StaticExcercise {
    static String name;
    int id;
    //static block/initilizer
    static {
        name="Pune";
        System.out.println("static block");
    }
    //constructor
    StaticExcercise(){
        this.id=100;
        System.out.println("0 args constructor");
    }
    StaticExcercise(int id){
        this();
        this.id=id;
        System.out.println("1 args constructor");
    }


}
