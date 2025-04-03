
package atividadepratica;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ClasseDeUso tp = new ClasseDeUso();
        int Operacao = 0;
        do{
            Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));
            Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));        
            Operacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Opção"));
            switch(Operacao){
                case 1:
                    System.out.println("O Maior numero entre"+n1+ "ou" +n2+ "e igual: "+ tp.Calcula(n1, n2));
                    break;

                case 2:
                    System.out.println("O Menor numero entre"+n1+ "ou" +n2+ "e igual: "+ tp.Calcula(n1, n2));
                    break;
                case 3:
                    System.out.println("A Potencia do Numero "+ n1 +"e igual: " + tp.Calcula(n1,2));
                    break;
            }
                
            
            
        }while(Operacao != 0);
    }
    
}
