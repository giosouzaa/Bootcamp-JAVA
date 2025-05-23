
//imprimir um triângulo retângulo espelhado horizontalmente com um valor de base pré-definido

public class TrianguloRetEspHorizontalmente {
    public static void main(String[] args) throws Exception {

        int baseTriangulo = 6;
        
        for (int i=baseTriangulo;i>0;i--){

            String repeatedString = String.valueOf('*').repeat(i); //já define o valor da string e a repete em uma única linha
            String repeatedString2 = String.valueOf(' ').repeat(baseTriangulo-i);
            System.out.println(repeatedString2 + repeatedString);

        }
    }
}
