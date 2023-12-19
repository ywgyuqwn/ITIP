public abstract class Bicycle {
    private String brand;
    private int size;
    private int gears;

    private static int numberOfBicycles = 0;

    public Bicycle(String brand, int size, int gears) {
        this.brand = brand;
        this.size = size;
        this.gears = gears;
        numberOfBicycles++;
    }
    public Bicycle(){
        String brand = "";
        int size = 0;
        int gears = 0;
        numberOfBicycles++;
    }


    public abstract void ride();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + ", Gears: " + gears;
    }
}
    class MountainBike extends Bicycle {
    private int suspension;

    public MountainBike(String brand, int size, int gears, int suspension) {
        super(brand, size, gears);
        this.suspension = suspension; // подвеска
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public void offRoad() {
        System.out.println("The mountain bike is going off-road.");
    }

    @Override
    public void ride() {
        System.out.println("Riding the mountain bike.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Suspension: " + suspension;
    }
}
class KidsBike extends Bicycle {
    public String color;

    public KidsBike(String brand, int size, int gears, String color) {
        super(brand, size, gears);
        this.color = color;
    }
    class threewheelbike extends KidsBike {

        public threewheelbike(String brand, int size, int gears,String color) {
            super(brand, size, gears,color);
            this.color = color;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void trainingWheels() {
        System.out.println("The kids bike has training wheels.");
    }

    @Override
    public void ride() {
        System.out.println("Riding the kids bike.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}
class BMXBike extends Bicycle {
    private boolean pegs;

    public BMXBike(String brand, int size, int gears, boolean pegs) {
        super(brand, size, gears);
        this.pegs = pegs;
    }

    public boolean hasPegs() {
        return pegs;
    }

    public void setPegs(boolean pegs) {
        this.pegs = pegs;
    }

    public void stunts() {
        System.out.println("Performing stunts with the BMX bike.");
    }

    @Override
    public void ride() {
        System.out.println("Riding the BMX bike.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Pegs: " + pegs;
    }
}
class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("Trek", 26, 21, 120);
        KidsBike kidsBike = new KidsBike("Huffy", 16, 1, "Blue");
        BMXBike bmxBike = new BMXBike("Mongoose", 20, 1, true);

        System.out.println(mountainBike);
        mountainBike.ride();
        mountainBike.offRoad();

        System.out.println(kidsBike);
        kidsBike.ride();
        kidsBike.trainingWheels();

        System.out.println(bmxBike);
        bmxBike.ride();
        bmxBike.stunts();

        System.out.println("Number of Bicycles: " + Bicycle.getNumberOfBicycles());
    }
}
