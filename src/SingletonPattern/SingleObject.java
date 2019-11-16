package SingletonPattern;

public class SingleObject {

    //which is responsible to create an object while making sure that only single object gets created


    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();


    //make the constructor private so that this class cannot be instantiated
    private SingleObject() {
    }


    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am a singleton!");
    }
}
