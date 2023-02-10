public class Phone implements IPrototype {

    private String size;
    private String cpu;
    private SIM sim;
    private int versionAndroid;
    private String camera;
    private String bluetooth;
    private int numberOfExternMemory;
    private String batteryTime;
    private Accesory[] accesories;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getNumberOfExternMemory() {
        return numberOfExternMemory;
    }

    public void setNumberOfExternMemory(int numberOfExternMemory) {
        this.numberOfExternMemory = numberOfExternMemory;
    }

    public String getBatteryTime() {
        return batteryTime;
    }

    public void setBatteryTime(String batteryTime) {
        this.batteryTime = batteryTime;
    }

    public Accesory[] getAccesories() {
        return accesories;
    }

    public void setAccesories(Accesory[] accesories) {
        this.accesories = accesories;
    }


    @Override
    public Phone clone() {
        Phone clone = new Phone();
        clone.setCamera(this.getCamera());
        clone.setCpu(this.getCpu());
        clone.setSize(this.getSize());
        clone.setBatteryTime(this.getBatteryTime());
        clone.setNumberOfExternMemory(this.getNumberOfExternMemory());
        return clone;
    }

    public void characteristic() {
        System.out.println("CPU: " + getCpu());
        System.out.println("Versión de Android: " + getVersionAndroid());
        System.out.println("Cámara: " + getCamera());
        System.out.println("Bluetooth: "+getBluetooth());
        System.out.println("Cantidad de Memorias Externas: "+getNumberOfExternMemory());
        System.out.println("Tiempo de bateria: "+getBatteryTime());
        System.out.print("Accesorios: ");
        for(int i=0; i<getAccesories().length; i++){
            getAccesories()[i].characteristic();
        }
        getSim().data();
    }

}
