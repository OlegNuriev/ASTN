package Less_7;

public class Animals {

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animals(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров." +
                    " Превышено ограничение на бег.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров.");
        }
    }
}
