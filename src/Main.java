
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Cruiser cruiser = new Cruiser("Фёдор Шаляпин", "зеленый", 3, "дрбовик");
        count++;
        Авианосец v = new Авианосец("Адмирал Кузнецов", "серый", 2,33);
        count++;
        cruiser.setLength(5);//Устанавливаем длину строки >4. Ошибка!
        cruiser.getShips();/*Выводим характеристики унаследованного корабля из класса Cruiser  используя метод
        класса Ship */
        v.getShips();
        v.sweem();// Метод из интерфейса(используется в наследнике)
        cruiser.shoot();// Переопределенный метод
        cruiser.voice();// Метод класса Cruiser
        System.out.println("Адмирал Кузнецов плывет со скоростью:"+ v.getSpeed()+ " км/ч");
        Helper.print("Создано кораблей:"+" ");
        Helper.print(count);
    }


}
