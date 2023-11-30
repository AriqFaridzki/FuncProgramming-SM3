package polymorph;

public class Car extends vehicle{

    // class car mengoverride method dari class vehicle yang membuat method start()
    // berevolusi tergantung yang sudah ditentukan oleh class Car


    @Override
    void start(){
        System.out.println("Car Is Starting....");
    }

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();

        // myCar object memanggil method start() dari class Car yang sudah dimodifikasi
        // oleh class car dari Class Vehicle
    }

}
