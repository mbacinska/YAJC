package SingletonPattern;

public class SingletonDemo {

    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        object.showMessage();


        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object1 = new SingleObject();
    }
}
