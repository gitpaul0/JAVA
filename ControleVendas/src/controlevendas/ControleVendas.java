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
public class ControleVendas {

    /**
     * @param args the command line arguments
     */
    
    static int menu()
    {
        int opcao;
        System.out.println("---------MENU---------");
        System.out.println("Para cadastrar novo usuario tecle 1 ");
        System.out.println("Para ver os produtos disponiveis tecle 2 ");
        System.out.println("Para escolher um produto tecle 3 ");
        System.out.println("Para sair tecle 9 ");
        System.out.printf("opcão: ");
        
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();
        System.out.printf("---------MENU---------\n\n");
        return opcao;
    }
    
    static Boolean confirmacao()
    {
        String aux;
        Boolean bool;
        System.out.print("Deseja dicionar algo no carrinho? (s/n)");
        Scanner input = new Scanner(System.in);
        aux = input.next();
        
        bool = ("S".equals(aux)) || ("s".equals(aux));
        return bool;
    }
    static void imprimirCompras(int i)
    {
        int j;
        
        for (j=0;j<=i;j++)
        {
            
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0, tag, aux;
        int i=5, compras = 0, j;
        Pessoa[] pessoa = new Pessoa[i];
        Cliente[] cliente = new Cliente[i];
        Funcionario caixa = new Funcionario();
        i=-1;
        
        String Nome;
        
        Scanner input = new Scanner(System.in);
        
        Produto[] produto = new Produto[10];
        produto[0] = new Produto("Teclado", 35, 1);
        produto[1] = new Produto("Mouse de video", 26, 2);
        produto[2] = new Produto("Monitor", 199, 3);
        produto[3] = new Produto("Placa de video", 867, 4);
        produto[4] = new Produto("SSD 120GB", 380, 5);
        produto[5] = new Produto("HD 1T", 250, 6);
        produto[6] = new Produto("Roteador", 150, 7);
        produto[7] = new Produto("Monitor de audio", 367, 8);
        produto[8] = new Produto("Interface de audio", 570, 9);
        produto[9] = new Produto("Servidor", 2590, 10);
        
        
         while(op!=9)
        {
            op=menu();
            
            switch (op)
            {
                case 1:// Cadastrar Cliente
                    i=i+1;
                    cliente[i] = new Cliente();
                    Nome = cliente[i].Usuario();
                    cliente[i].setNome(Nome);
                    
                    
                    break;
                    
                case 2://Ver produtos em estoque
                    System.out.printf("---------ESTOQUE---------\n\n");
                    for(j=0;j<=9;j++)
                    {   
                        System.out.printf("------------------\n");
                        System.out.println("Produto: " + produto[j].getProduto());
                        
                        System.out.println("Preço: " + produto[j].getValor());
                        System.out.println("TAG: " + produto[j].getTag());
                        System.out.printf("------------------\n");
                    }
                    System.out.println("---------ESTOQUE---------\n\n");
                    break;
                    
                    case 3://Escolher produto para comprar
                        caixa.inserirCodigo();
                        caixa.inserirTempo();
                        int quant;
                        System.out.println("\n\n---------COMPRA---------\n\n");
                        /* na hora de escolher quem compra, você ira fazer um for que verifique todos
                        as posições de pessoa[] e encontrar o indece equivalente a pessoa.
                        apos isso você usara o indice como uma forma de definir quem compra
                        ex: cliente[indice].compra... */
                        
                        
                        if ((i != -1))
                        {
                            while (confirmacao() == true)
                            {
                                
                                System.out.print("Digite a tag do produto desejado: ");
                                tag = input.nextInt();
                                tag--;
                                System.out.printf("\nQuantidade: ");
                                quant = input.nextInt();
                                produto[tag].imprimirProduto();
                                System.out.println("Valor total: " + produto[tag].valor * quant + "\n\n");
                            
                                compras = compras+1;
                                cliente[i].comprar(tag, compras, quant);
                            }
                                
                                int[] arraycompras = new int[10];
                                arraycompras = cliente[i].getCompras();
                                int[] arrayquant = new int[10];
                                arrayquant = cliente[i].getQuantidades(); 
                                int total = 0;
                                int T=0;
                                for(aux=0;aux<compras;aux++)
                                {
                                    T = T + ( (produto[arraycompras[aux]].getValor()) * (arrayquant[aux]) );
                                    if(aux==(compras-1))
                                    {
                                        
                                        System.out.println("Valor total: " + T);
                                        
                                    }
                                }
                                
                                System.out.println("Escolha uma forma de pagamento");
                                System.out.println("0 para cartão");
                                System.out.println("1 para dinheiro");
                                System.out.print("Opção: ");
                                int k , pago, troco;
                                k = input.nextInt();
                                pago = caixa.pagar();
                                troco = pago - T;
                                System.out.println("Troco : " + troco);
                                System.out.println("\n\n------NOTA------\n\n");
                                
                                for(aux=0;aux<compras;aux++)
                                {
                                    System.out.println("Produto: " + produto[arraycompras[aux]].getProduto());
                                    System.out.println("Codigo: " + produto[arraycompras[aux]].getTag());
                                    System.out.println("Valor unitario: " + produto[arraycompras[aux]].getValor());
                                    System.out.println("Quantidade: " + arrayquant[aux]);
                                    System.out.println("Valor total: " +( (produto[arraycompras[aux]].getValor()) * (arrayquant[aux]) ) );
                                    total = total + (produto[arraycompras[aux]].getValor() * arrayquant[aux]);
                                    System.out.println("---------------------");
                                }
                                
                                System.out.println("Nome do cliente: " + cliente[i].nome);
                                caixa.atendimento();
                                System.out.println("Forma de pagamento: " + cliente[i].formaPagmento(k));
                                System.out.println("Valor total da compra: " + total);
                                System.out.println("Troco : " + troco);
                                
                                System.out.println("Compra realizada com sucesso!");
                                System.out.println("\n\n------NOTA------\n\n");
                        }
                        else
                        {
                            System.out.println("Usuario não cadastrado, cadastre o para poder comprar.");
                        }
                        
                        System.out.println("\n\n---------COMPRA---------\n\n");
                        break;
                        
                    case 4: //Ver produtos comprados
                        
                        
                default:
                    
            }
            
        }
        
    }
    
}
