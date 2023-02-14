package PrototypeEjercico;
public class ClienteTelefono {
    public static void main(String []args){
        
        System.out.println("Celular 1");
        Accesory[] accesories1 = {new Accesory("audifonos"), new Accesory("cargador"), new Accesory("estuche")};
        Phone phone1 = new Phone(new SIM("Viva","70131412"), accesories1);
        phone1.setSize("15cm x 9cm");
        phone1.setCpu("2.7");
        phone1.setVersionAndroid(13);
        phone1.setCamera("4K");
        phone1.setBluetooth("2 GHz");
        phone1.setNumberOfExternMemory(6);
        phone1.setBatteryTime("12 horas");
        phone1.characteristic();
        

        System.out.println("Celular 2");

        Phone phone2 = phone1.clone(); 
        phone2.setSim(new SIM("Entel","60678786"));
        phone2.characteristic();
    
    
        System.out.println("Celular 3");

        Phone phone3 = phone1.clone(); 
        phone3.setSim(new SIM("Tigo","70672123"));
        phone3.characteristic();

        System.out.println("Celular 3");

        Phone phone4 = phone1.clone(); 
        phone4.setSim(new SIM("Tigo","70172123"));
        phone4.characteristic();

        System.out.println("Celular 3");

        Phone phone5 = phone1.clone(); 
        phone5.setSim(new SIM("Viva","70656193"));
        phone5.characteristic();
    }
}
