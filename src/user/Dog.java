package user;

public class Dog implements Heyvan,Ozellik{
    @Override
    public void havlamaq() {
        System.out.println("Itim havlayir");
    }

    @Override
    public void dostcanli() {
        System.out.println("Itim dostcanlidi");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dostcanli();
        dog.havlamaq();

    }

}
