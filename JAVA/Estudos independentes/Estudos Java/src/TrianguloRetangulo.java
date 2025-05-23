
//imprimir um triângulo retângulo com um valor de base pré-definido

public class TrianguloRetangulo {
    public static void main(String[] args) throws Exception {

        int baseTriangulo = 6;
        String a = "*";
        
        for (int i=1;i<=baseTriangulo;i++){

            //String repeatedString = String.valueOf('*').repeat(i); já define o valor da string e a repete em uma única linha
            //System.out.println(repeatedString);

            String repeated = a.repeat(i); //define uma string de repetição a partir de uma string já definida anteriormente
            System.out.println(repeated);

        }
    }
}
