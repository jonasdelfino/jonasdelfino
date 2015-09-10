/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicao;

/**
 *
 * @author Young
 */
public class old {
    public static void main(String[] args) {
        
        int idade = 16;
        
        if (idade <= 12){
            System.out.println("Child");
            
        }else if (idade >= 13 && idade <= 18){
            System.out.println("young");
            
        }else if (idade >= 18 && idade <= 60){
            System.out.println("Semi-Tio");
            
        }else {
            System.out.println("Tiozão");
        }
    }
}
