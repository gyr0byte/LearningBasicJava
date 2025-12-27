public class Methods {
    public static void main(String[] args) {
        String name = "Gaurav";
        int age = 19;
        happyBirthday(name, age);
    }
    static void happyBirthday(String birthdayboi, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday Dear %s!\n", birthdayboi);
        System.out.printf("You are %d years old", age);
        System.out.println("Happy Birthday to you.\n");
    }
}