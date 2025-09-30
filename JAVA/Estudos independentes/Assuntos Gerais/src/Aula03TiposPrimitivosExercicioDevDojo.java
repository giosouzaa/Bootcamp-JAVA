/*
 * Crie variáveis para os campos descritos abaixo entre <> e imprima
 * a seguinte mensagem:
 * 
 * "Eu, <nome>, morando no endereço <endereço>, confirmo que recebi o <salário>, 
 * na data <data>"
 * 
 */

public class Aula03TiposPrimitivosExercicioDevDojo {
    public static void main(String[] args) {
        String nome = "Giovanna";
        String endereço = "Rua Paraíso, 888";
        double salário = 2500.00;
        String dataRecebimento = "29/09/2025";

        System.out.printf("Eu, %s, morando no endereço %s, confirmo que recebi o salário R$%.2f, na data %s.\n\n", nome, endereço, salário, dataRecebimento);
    }
}
