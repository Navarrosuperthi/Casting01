public class Casting01 {
    public static void main(String[] args) {
        // Declarar e inicializar um byte com o valor 128 (esta linha causará um erro)
        // byte valorByte = 128; // Comentada porque 128 está fora do intervalo para byte (-128 a 127)

        // Declarar e inicializar um short com o valor 128
        short valorShort = 128;
        // Converter short para byte e imprimir o valor
        byte valorByteDeShort = (byte) valorShort;
        System.out.println("O valor de short convertido para byte é: " + valorByteDeShort);

        // Declarar e inicializar um byte com o valor 127
        byte valorByte = 127;
        System.out.println("Valor inicial do byte: " + valorByte);
        
        // Somar 1 a essa variável e imprimir o resultado
        valorByte += 1;
        System.out.println("Valor do byte apos adicionar 1: " + valorByte);

        // Somar 1 a essa variável de novo e imprimir o resultado
        valorByte += 1;
        System.out.println("Valor do byte apos adicionar 1 novamente: " + valorByte);
    }
}
