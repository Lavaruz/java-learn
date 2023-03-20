public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Assami Muzaki");
    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
