public class HelloWorld {
    
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("TEST")) {
            System.out.print("Executando em TEST");
        }
    }
}