public class Methods2 {
    public static void main(String[] args) {
        // double result = square(3);
        System.out.println(square(3));
        String fullName = getFullName("Gaurav", "Dulal");
        System.out.println(fullName);
        int age = 19;
        if(ageCheck(age)){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    static double square (double num){
        return num * num;
    }
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }
}