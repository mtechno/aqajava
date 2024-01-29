package Lesson4;

public class Park {
    public class Attractions {
        public String attract;
        public String timeOnline;
        public int cost;

        public Attractions (String attract, String timeOnline, int cost){
            this.attract = attract;
            this.timeOnline = timeOnline;
            this.cost = cost;
        }

        public String toString(){
            return "Аттракцион: " + attract + " , часы работы: " + timeOnline + " , стоимость: " + cost;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attractions attractionFear = park.new Attractions("Ужас", "10-23", 15);
        System.out.println(attractionFear.toString());
    }
}
//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
