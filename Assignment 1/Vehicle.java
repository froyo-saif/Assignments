public class Vehicle{
    String color;
    int numberOfWheels;
    String model;

        public Vehicle(String color, int numberOfWheels, String model) {
            this.color = color;
            this.numberOfWheels = numberOfWheels;
            this.model = model;
        }

        public void start() {
            System.out.println("The " + model + " with " + numberOfWheels + " wheels is starting.");
        }

        public void stop() {
            System.out.println("The " + model + " with " + numberOfWheels + " wheels is stopping.");
        }

        public void accelerate() {
            System.out.println("The " + model + " with " + numberOfWheels + " wheels is accelerating.");
        }

        public void brake() {
            System.out.println("The " + model + " with " + numberOfWheels + " wheels is braking.");
        }
    }

    class Truck extends Vehicle {
        public Truck(String color) {
            super(color, 8, "Scania");
        }
    }

    class Bus extends Vehicle {
        public Bus(String color) {
            super(color, 4, "MAN");
        }
    }

    class Car extends Vehicle {
        public Car(String color) {
            super(color, 4, "Bentley");
        }
    }

    class Road {
        public static void main(String[] args) {
            Truck truck = new Truck("Red");
            Bus bus = new Bus("Blue");
            Car car = new Car("Silver");

            truck.start();
            truck.accelerate();
            truck.brake();
            truck.stop();
            System.out.println();
            bus.start();
            bus.accelerate();
            bus.brake();
            bus.stop();
            System.out.println();
            car.start();
            car.accelerate();
            car.brake();
            car.stop();
        }
    }



