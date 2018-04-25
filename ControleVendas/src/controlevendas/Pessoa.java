/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlevendas;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Pessoa {
    protected String nome;
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String Usuario()
    {
        String n;
        System.out.println("Qual o seu nome?");
        Scanner input = new Scanner(System.in);
        n = input.nextLine();
        System.out.println("\nBem vindo, " + n + "!");
        return n;
    }
    
    
}
