package HW1;

public class Pool {
    private double lenght;
    private int numberPool;

    public Pool(int lenght, int numberPool) {
        this.lenght = lenght;
        this.numberPool = numberPool;
    }

    public int getNumberPool() {
        return numberPool;
    }

    public void setNumberPool(int numberPool) {
        this.numberPool = numberPool;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getTimeToOvercomePool(Team team) {
        return team.swim(this);
    }

    public double TimeToOvercomePool(Team team) {
        return team.time(this);
    }
}
