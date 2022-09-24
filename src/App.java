public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(suma3(-45,84,94));
        Coche coche = new Coche();
        coche.addDoor();
        System.out.println("doors: " + coche.getDoors());
    }

    public static int suma3(int a, int b, int c) {
        return a+b+c;
    }
}

class Coche {
    private int doors;

    public Coche() {
        this.doors = 0;
    }
    
    public int getDoors() {
        return doors;
    }


    public void addDoor() {
        this.doors++;
    }
}
