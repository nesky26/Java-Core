package HW1;

public class Team {
    private int number;
    private String name;
    private int age;
    private double swimmingSpeed;

    Team (int number, String name,  int age, int swimmingSpeed) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double swim(Pool pool) {
        System.out.println("I am " +  getName() + ". I am swimming" + " pool №" + pool.getNumberPool());
        double timeToOvercome = pool.getLenght() / swimmingSpeed;
        System.out.println("My time is " + timeToOvercome + " seconds");
        return timeToOvercome;
    }

    public double time(Pool pool) {
        double timeToOvercome = pool.getLenght() / swimmingSpeed;
        return timeToOvercome;
    }

    @Override
    public String toString() {
        return number + "-st member of the teams {name: " + name + ", " +  " age: " + age + "};";
    }



}

