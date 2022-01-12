public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualTime) {
        return this.expectedMinutesInOven() - actualTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int actualTime) {
        return preparationTimeInMinutes(layers) + actualTime;
    }
}
