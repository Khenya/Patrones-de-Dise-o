public class ClienteTelefono {
    public static void main(String []args){
        
        System.out.println("Celular 1");

        Phone phone1 = new Phone();
        phone1.setSize("15cm x 9cm");
        phone1.setCpu("2.7");
        phone1.setVersionAndroid(13);
        phone1.setCamera("4K");
        phone1.setBluetooth("2 GHz");
        phone1.setNumberOfExternMemory(6);
        phone1.setBatteryTime("12 horas");
        Accesory[] accesories1 = {new Accesory("audifonos"), new Accesory("cargador"), new Accesory("estuche")};
       
        

    }
}
