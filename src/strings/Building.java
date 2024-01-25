package strings;

public class Building {

    public static void main(String[] args) {
        String greeting = "Hello";
        greeting += " world";
        System.out.println(greeting);


        String word = "something";
        String drow = "";
        for (int i = word.length()-1; i >= 0; i--) {
            drow += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(drow);

        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        builder.insert(2, "SECRET");
        System.out.println(builder);

        builder.append(" World!");
        System.out.println(builder);

        System.out.println(builder.indexOf("E"));
        System.out.println(builder.lastIndexOf("E"));

        if (builder.lastIndexOf("q") == builder.indexOf("q") && builder.indexOf("q") > -1){
            System.out.println("Je prave jednou");
        } else if (builder.indexOf("q") == -1){
            System.out.println("Neni vubec");
        } else {
            System.out.println("Je vickrat");
        }
    }
}
