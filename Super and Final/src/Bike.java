//parent class

class Bike {
    final int cc = 170;
    void sound() {
        cc = 180;
        System.out.println(cc);
        System.out.println("Thok Thok!");
    }
    void fuel() {
        System.out.println("This is ParentClass!");
        System.out.println("Bike drinks Petrol");
    }
}