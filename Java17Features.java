public class Java17Features {
    public static void main(String[] args) {
       // 1. Sealed classes
    }
}

sealed class Vehicle permits Car, Bike, Truck {}
// no further subclassing
final class Car extends Vehicle {}
// can be extended freely
non-sealed class Truck extends Vehicle {}

sealed class Bike extends Vehicle permits ElectricBike {}
// no futher subclassing
final class ElectricBike extends Bike {}