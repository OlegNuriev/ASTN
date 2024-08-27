package Less_7;

public class Dog extends Animals{

    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10); //Лимит бега и плавания
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
