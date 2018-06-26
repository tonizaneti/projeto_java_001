 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

/**
 *
 * @author Toni
 */
public class Projeto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person();
        person.age=25;
        person.name= "Maria";
        person.cpf="08857412308";
        person.say();
        System.out.println("Hello "+person.name+"!");
        
    }
    
    }
    
