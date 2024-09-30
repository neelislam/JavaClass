//Child class

class Hornet extends Bike {

    void eat() {
        System.out.println("This is Child class: ");
        super.eat();
        System.out.println("Bike drinks Octane");
    }
    // final declared so it cant be used
    /* void sound(){
        System.out.println("Vroom Vroom");
    } */
}