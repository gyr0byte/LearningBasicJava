public class Array2D {
    public static void main(String[] args) {
        /*
         * String[] fruits = {"Apple", "Banana", "Orange"};
         * String[] vegetables = {"potato", "onion", "carrot"};
         * String[] meats = {"Chicken", "Pork", "Beef", "Steak"};
         */

        String[][] groceries = { { "Apple", "Banana", "Orange" },
                                 { "potato", "onion", "carrot" },
                                 { "Chicken", "Pork", "Beef", "Steak" } };
        groceries[0][0] = "Mango"; // Changing Apple to Mango
        groceries[2][3] = "Lamb";  // Changing Steak to Lamb
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}