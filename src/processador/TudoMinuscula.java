package processador;

public class TudoMinuscula extends ProcessadorTexto {
    protected char[] converterCaracteres(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toLowerCase(chars[i]);
        }
        return resultado;
    }
}
