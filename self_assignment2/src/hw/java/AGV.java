package hw.java;

class AGV {
    String id;
    double battery;
    boolean available;
    
    public AGV(String id) {
        this.id = id;
        this.battery = 100.0;
        this.available = true;
    }
}
