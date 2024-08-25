package Lesson_6;

public class Park {

    //Создаём внутренний класс Attraction с помощью объектов которого можно хранить информацию о Названии,
    // времени работы и стоимости аттракционов.
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    class Attraction {
        private String attractionName;
        private String openingHours;
        private double price;

        public Attraction(String attractionName, String openingHours, double price) {
            this.attractionName = attractionName;
            this.openingHours = openingHours;
            this.price = price;
        }
        //Метод для вывода информации об объекте в консоль.
        public void displayInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Opening Hours: " + openingHours);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }
}
