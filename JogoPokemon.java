//
import java.util.ArrayList;
import java.util.Scanner;

public class JogoPokemon {

    //MENU PRINCIPAL
    public static void menu(Treinador treinador, ArrayList<Pokemon> pokemonLista){
        Scanner input = new Scanner(System.in);
        int opcao = 0;      

        //System.out.println("Treinador: " + treinador.toString());
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
            menuCadastro(treinador, pokemonLista);
            break;

            case 2:
            menuLista(treinador, pokemonLista);
            break;

            case 3:
            System.out.println("O programa foi encerrado.");
            break;

            default:
            System.out.println("Opcao invalida");
            menu(treinador, pokemonLista);
        }

        input.close();

    }

    //MENU DE CADASTRO DE POKEMON
    public static void menuCadastro(Treinador treinador, ArrayList<Pokemon> pokemonLista){
        Scanner input = new Scanner(System.in);
        Pokemon pokemon = null;
        String tipo1 = "";
        String tipo2 = "";
        int op = 0;

        do {
            System.out.println("CADASTRAR POKEMON");

            System.out.println("Digite o nome do Pokemon: ");
            String nome = input.next();
            input.nextLine();

            System.out.println("Digite o HP total: ");
            int HPTotal = input.nextInt();

            System.out.println("Digite a iniciativa: ");
            int iniciativa = input.nextInt();

            System.out.println("O Pokemon possui dois tipos?\n1. Sim\n2. Nao");
            int opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("Digite o primeiro tipo: ");
                tipo1 = input.next();
                input.nextLine();

                System.out.println("Digite o segundo tipo: ");
                tipo2 = input.next();
                input.nextLine();

            } else {
                System.out.println("Digite o tipo: ");
                tipo1 = input.next();
                input.nextLine();

            }

            System.out.println("Digite o nome do ataque: ");
            String nomeAtaque = input.next();
            input.nextLine();

            System.out.println("Digite o valor do ataque: ");
            int valorAtaque = input.nextInt();

            if(opcao == 1){
                try {
                    pokemon = new Pokemon(nome, HPTotal, HPTotal, iniciativa, tipo1, tipo2,  nomeAtaque, valorAtaque);
                    pokemonLista.add(pokemon);

                } catch (Exception e) {
                    System.err.println("Nao foi possivel cadastrar o Pokemon");

                }

            } else {
                try {
                    pokemon = new Pokemon(nome, HPTotal, HPTotal, iniciativa, tipo1, nomeAtaque, valorAtaque);
                    pokemonLista.add(pokemon);

                } catch (Exception e) {
                    System.err.println("Nao foi possivel cadastrar o Pokemon");

                }

            }

           System.out.println("Deseja cadastrar outro Pokemon?");
           System.out.println("1. Sim\n2. Voltar");
           op = input.nextInt();
           

    }while (op == 1);

        menu(treinador, pokemonLista);
        input.close();

    }

    //MENU DE LISTAGEM DE POKEMON
    public static void menuLista(Treinador treinador, ArrayList<Pokemon> pokemonLista){
        Scanner input = new Scanner(System.in); 
        int op = 0;
        System.out.println("LISTAGEM"); 
        
        do {
            for(int i = 0 ; i < pokemonLista.size(); i++){
                System.out.println("\n" + pokemonLista.get(i).toString());

            }

            System.out.println("\n1. Voltar");
            op = input.nextInt();

        } while (op != 1);

        menu(treinador, pokemonLista);
        input.close();

    }

    public static void main(String[] args) {
        Treinador treinador = new Treinador("nome", 1);
        Pokemon Pikachu = null;
        Pokemon Pidgey = null;
        ArrayList<Pokemon> pokemonLista = new ArrayList<>();

        //Criação dos dois primeiros Pokémon
        try {
            Pikachu = new Pokemon("Pikachu", 35, 35, 90, "Eletric", "Thunder Shock", 15);
            pokemonLista.add(Pikachu);

        } catch (Exception e) {
            System.out.println(e);

        }

        try {
            Pidgey = new Pokemon("Pidgey", 40, 40, 56, "Normal" ,"Flying" ,  "Wing Attack", 20);
            pokemonLista.add(Pidgey);

        } catch (Exception e) {
          System.err.println(e);

        }

        menu(treinador, pokemonLista);
    }
}
