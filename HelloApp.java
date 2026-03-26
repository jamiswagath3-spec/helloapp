public class HelloApp {

    public static void main(Stri
        String names;

        if (args.length > 0) {
       
            names = String.join(", ", args);
} else {
            names = "World";
        }

        
        System.out.println("Hello, " + names + "!");
    }
}