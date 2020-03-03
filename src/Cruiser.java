public class Cruiser extends Ship {
    public String pushka;

    // Перегрузка конструктора
    public Cruiser(String shipName, String color, int length, String pushka) {
        super(shipName, color, length);
        this.pushka = pushka;
    }

    public  void voice() {
        System.out.println("Щас спою!");
    }

    @Override
    public void shoot() {
        System.out.println("Крейсер выстрелил!");
    }

}

