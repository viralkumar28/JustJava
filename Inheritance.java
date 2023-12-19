interface Animal{
    int eyes = 2;
    void walks();

}
interface Herbivore{

}
class Horse implements Animal, Herbivore{

    @Override
    public void walks() {
        System.out.println("walks on 4 legs"+eyes);
    }
}
public class Inheritance {
    public static void main(String[] args) {

    }
}
