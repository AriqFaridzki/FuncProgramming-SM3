package polymorph;

public class BangunRuang {
    double rumus(double p, double l){
        return (l*p);
    }

    double rumus(double p, double l, double t){
        return (l*p*t);
    }

    double rumus(double s){
        return (s*s);
    }

    int rumus(int s){
        return s*s*s;
    }

//    double calcVolume(double p, double l, double t)

    public static void main(String[] args) {
        BangunRuang obj = new BangunRuang();
        System.out.println("Luas persegi Panjang : " + obj.rumus(5.55, 6.78));
        System.out.println("Luas Persegi : " + obj.rumus(3.45));
        System.out.println("volume Kubus : " + obj.rumus(3));
        System.out.println("volume Balok : " + obj.rumus(3.45, 6.56, 9.34));
    }
}

// 1. yang saya dapat pelajari adalah, overloading method memungkinkan untuk
// menggunakan nama method yang sama tapi dengan fungsionalitas yang berbeda
// hal ini memmbuat kode mudah dipahami dan semakin rapih dalam menganalisanya

// 1. Buatlah 1 Class Java untuk method overriding menggunakan super
// 2. Buatlah 1 Class Java untuk method overloading
