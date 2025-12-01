package processador;

public class Main {
    public static void main(String[] args) {
        String entrada = "Exemplo de Template Method";
        
        System.out.println("Original: " + entrada);

        ProcessadorTexto maiuscula = new TudoMaiuscula();
        System.out.println("Maiúscula: " + maiuscula.processar(entrada));

        ProcessadorTexto minuscula = new TudoMinuscula();
        System.out.println("Minúscula: " + minuscula.processar(entrada));
    }
}