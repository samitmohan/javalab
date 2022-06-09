public class Patients {
    public static void main(String[] args) {
        Patient p1 = new Patient("Samit", 77, 51);
        Patient p2 = new Patient("Mohan", 70, 50);
        System.out.println("BMI of " + p1.name + " is " + p1.BMI());
        System.out.println("BMI of " + p2.name + "  is " + p2.BMI());
    }
}
