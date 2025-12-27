public class Striingmethodss {
    public static void main(String[] args) {
        String name = "Gaurav Dulal";
        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("r");
        int LastIndex = name.lastIndexOf("u");
        String UpperCase = name.toUpperCase();
        String LowerCase = name.toLowerCase();
        String TrimName = name.trim();
        String ReplaceName = name.replace("a", "e");
        boolean empty = name.isEmpty();
        boolean contains = name.contains(" ");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(LastIndex);
        System.out.println(UpperCase);
        System.out.println(LowerCase);
        System.out.println(TrimName);
        System.out.println(ReplaceName);
        System.out.println(empty);
        System.out.println(contains);
    }
}