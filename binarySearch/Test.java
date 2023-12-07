public class Test {
    public static void main(String[] args) {
        String names[] = {"Gabriel Barros", "Iorhana Cleia", "Matheus Marques", "Vinicius Nascimento"};

        String argument = "";
        for (int i = 0; i < args.length; i++) {
            if (i != 0)
                argument += " ";
            
            argument += args[i];
        }

        System.out.println("Array output: ");
        for (int i = 0; i < names[0].length(); i++)
            System.out.println("Character: " + names[0].charAt(i));

        System.out.println("Command Line Argument output: ");
        for (int i = 0; i < argument.length(); i++)
            System.out.println("Char: " + argument.charAt(i));
    } 
}