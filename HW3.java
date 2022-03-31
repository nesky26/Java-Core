package HW3;

public class HW3 {
    public static void main(String[] args) {
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }
}
class Apple extends Fruit{
    public Apple() {
        super.weigth = 1f;
    }

}

class Orange extends Fruit{
    public Orange() {
        super.weigth = 1.5f;
    }
}

class Fruit {
    float weigth;
}

class Box<T>{
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("The box is full");
    }

    float getWeight(Fruit f) {
        return arrayList.size() * f.weigth;
    }

    boolean compare(Fruit f1, Fruit f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }
}
