
//imprimir um triângulo equilatero com um valor de base pré-definido


public class TrianguloEquilatero {
    public static void main(String[] args) throws Exception {

        int baseTriangulo = 7;
        String a = "*";
        String n = " ";
        
        for (int i=1;i<=baseTriangulo;i++){
            String repeated = a.repeat(i); //define uma string de repetição a partir de uma string já definida anteriormente
            String repeatedSpace = n.repeat((baseTriangulo-i)/2);

            if (baseTriangulo%2==0 && (baseTriangulo-i)%2 == 0){
    
                    System.out.println(repeatedSpace + repeated);

            }else{
            
                if (((baseTriangulo-i)%2) == 0) {
                    System.out.println(repeatedSpace + repeated);
                }
            }

        }
    }
}
