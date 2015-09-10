//programa que avalia média e frequência do aluno
package condicao;

/**
 *
 * @author Young
 */
public class Notas {
    public static void main(String[] args) {
        
        double notas = 8;
        int faltas = 74;
        // se o aluno tira nota maior que 7 e frquência maior que 75% passado
        if (notas >= 7 && faltas >= 75){
            System.out.println("Parabéns, Passou ");
        // se o aluno tira entre 5 e 6.9 recuperação    
        }else if (notas >= 5 && notas <= 6.9){
            System.out.println("Recuperação, deu certo zé");
        // se tira nota menor que 5 e frequência menor que 75    
        }else if (notas < 5 || faltas < 75){
            System.out.println("Reprovou, se deu mal");
            }
    }
}
