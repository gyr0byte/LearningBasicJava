public class OverloadMethod2 {
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread", "Mozzarella", "pepperoni");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + "pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + "" + bread + "pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + "pizza";
    }
}