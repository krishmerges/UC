public class HelloAppUC5 {
    public static void main(String[] args) {
        String finalName = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
            finalName = nameBuilder.toString();
        }

        System.out.println("Hello, " + finalName + "!");
    }
}