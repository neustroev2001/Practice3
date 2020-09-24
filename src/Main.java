public class Main {
    public static void main(String[] args){
        Circle c = new Circle(6,3);
        System.out.println("R= " + c.getR());
        c.D(3);
        System.out.println();
        ////////
        Human a = new Human();
        System.out.println("Имя: " + a.getName());
        Head b = new Head();
        System.out.println("Цвет волос: " + b.getHair());
        Hand c1 = new Hand();
        System.out.println("Количество пальцев на руках: " + c1.getFingers());
        Leg d = new Leg();
        System.out.println("Размер ноги: " + d.getLeg_size());
    }
}
