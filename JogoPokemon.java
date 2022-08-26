//

import java.util.Scanner;

public class JogoPokemon {

    //MENU PRINCIPAL
    public static void menu(Treinador treinador){
        Scanner input = new Scanner(System.in);
        int opcao = 0;      

        treinador.toString();
        do {
            System.out.println("MENU: ");
            System.out.println("1. Cadastrar Pokemon");
            System.out.println("2. Listar Pokemon");
//          System.out.println("3. Batalha");
            System.out.println("3. Sair");

            opcao = input.nextInt();

        } while(opcao > 4);

        switch (opcao){
            
            case 1:
            menuCadastro();
            break;

            case 2:
            menuLista();
            break;

            case 3:
            System.out.println("O programa foi encerrado.");
        }

        input.close();

    }

    //MENU DE CADASTRO DE POKEMON
    public static void menuCadastro(){


    }

    //MENU DE LISTAGEM DE POKEMON
    public static void menuLista(){


    }

    public static void main(String[] args) {
        Treinador treinador = new Treinador("nome", 1);

        menu(treinador);
    }
}
