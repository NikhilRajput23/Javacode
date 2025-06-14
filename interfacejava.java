interface Sports {
    void roll(int a, int b);
}
interface Study {
    void name(String a, String b);
}
class Kiran implements Sports, Study {
    public void roll(int a, int b) {
        System.out.println(a + b);
    }

    public void name(String a, String b) {
        System.out.println(a + " + " + b);
    }
}

public class interfacejava {
    public static void main(String[] args) {
        Kiran a = new Kiran();
        a.roll(20, 30);                 
        a.name("Kiran", "Nikhil");      
    }
}
