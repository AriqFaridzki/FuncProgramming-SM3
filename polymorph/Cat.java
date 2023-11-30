package polymorph;

public class Cat  extends Animal{

    @Override
    void makeSound(){
        super.makeSound();

        // super method digunakan untuk memanggil method yang ada di class Animal
        // jadi memanggil method yang di Animal dan di Cat juga
        System.out.println("Miauuwwwww....");
    }

    @Override
    void introduce(){
        super.makeSound();
        System.out.println("Dan Aku adalah hewan spesies Kucing");
    }


    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();
        myCat.introduce();
    }
}
