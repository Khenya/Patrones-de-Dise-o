public class ClienteSingleton2 {
    public static void main(String[]args){

        ClienteSingleton2 singleton1 = ClienteSingleton2.getInstance();
        ClienteSingleton2 singleton2 = ClienteSingleton2.getInstance();
        ClienteSingleton2 singleton3 = ClienteSingleton2.getInstance();

        System.out.println("singleton 1 : "+singleton1);
        System.out.println("singleton 2 : "+singleton2);
        System.out.println("singleton 3 : "+singleton3);

        System.out.println("singleton 1 : "+singleton1.hashCode());
        System.out.println("singleton 2 : "+singleton2.hashCode());
        System.out.println("singleton 3 : "+singleton3.hashCode());

        singleton1.getName();
        singleton2.getName();
        singleton3.getName();
    }
}
