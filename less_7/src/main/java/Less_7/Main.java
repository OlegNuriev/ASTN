package Less_7;
//Все животные умеют бежать и плыть
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");
        Cat cat3 = new Cat("Musya");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Sharik");

        Animals[] animals = {cat1, cat2, cat3, dog1, dog2};

        for (Animals animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        Bowl bowl = new Bowl(1);
        bowl.addFood(1);

        for (Animals animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.eat(bowl);
            }
        }

        for (Animals animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.name + " голоден: " + cat.isHungry());
            }
        }

        System.out.println("Количество созданных котов: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
    }
}
