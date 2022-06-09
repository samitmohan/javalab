public class Patient {
    String name;
    double weight;
    double height;

    Patient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    double BMI() {
        return (weight / (height * height)) * 703;
    }
}
