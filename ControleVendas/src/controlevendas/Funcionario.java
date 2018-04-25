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
public class Funcionario extends Pessoa {
    int codigo;
    int hora;
    int minuto;
    int dia;
    int mes;
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    protected void inserirCodigo()
    {
        int cod;
        System.out.printf("Caixa, insira o seu codigo de funcionario: ");
        Scanner input = new Scanner(System.in);
        cod = input.nextInt();
        System.out.println();
        codigo = cod;
        
    }
    
    protected void inserirTempo()
    {
        int h, m, d, me;
        System.out.printf("Digite a hora (sem os minutos) do atendimento: ");
        
        Scanner input = new Scanner(System.in);
        h = input.nextInt();
        System.out.printf("\nMinutos:  ");
        m = input.nextInt();
        System.out.printf("\nDia:  ");
        d = input.nextInt();
        System.out.printf("\nMês: ");
        me = input.nextInt();
        hora = h;
        minuto = m;
        mes = me;
        dia = d;
    }
    
    protected void atendimento()
    {
        System.out.println("Hora da compra " + hora + ":" + minuto);
        System.out.println("Data: " + dia + "/" + mes);
        System.out.println("Numero operador " + codigo);
    }
    protected int pagar()
    {
        int pago;
        System.out.print("Digite o valor pago: ");
        Scanner input = new Scanner(System.in);
        pago = input.nextInt();
        return pago;
    }
}
