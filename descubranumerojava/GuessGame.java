public class GuessGame {
    
    Player p1;
    Player p2;           // O GuessGame tem três variáveis de instância para os três objetos Players.
    Player p3;
      
    public void startGame() {
        
        p1= new Player();
        p2= new Player();  // Cria três objetos Player e os atribui ás três variáveis de instância Player.
        p3= new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;  // Declara três variáveis para armazenar os três palpites feitos pelos jogadores.
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false; // Declara três variáveis para armazenar um valor verdadeiro ou falso com base na resposta do jogador.
        boolean p3isRight = false; 
        
        int targetNumber = (int) (Math.random() * 10);              // Cria um número ´alvo´ que os jogadores têm que adivinhar.
        System.out.println ("i´m thinking of a numeber between 0 and 9...");
        
        while (true) {
            System.out.println ("Number to guess is " + targetNumber);         
            p1.guess();
            p2.guess(); // Chama o método guess() de cada jogador.
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println ("Player one guessed " + guessp1);
            
            guessp2 = p2.number;                                 // Recebe o palpite de cada jogador (o resultado da execução do método guess()) acessando a variável do palpite de cada jogador.
            System.out.println ("Player two guessed " + guessp2);
            
            guessp3 = p3.number;
            System.out.println ("Player three guessed " + guessp3);
            
            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){               // Verifica o palpite de cada jogador para ver se corresponde ao "alvo." Se um jogador acertar, define a variável desse jogador como
                p2isRight = true;                       // verdadeira (lembre-se, definimos como falsa por padrão).
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {         // Se o jogador um OU o jogador dois OU o jogador três acertar (O operador || significa OR).
                System.out.println ("We have a winner!");
                System.out.println ("Player one got it right? " + p1isRight);
                System.out.println ("Player two got is right? "+ p2isRight);
                System.out.println ("Player three got is right? " + p3isRight);
                System.out.println ("Game is over.");
                break; // Fim de Jogo, acabou o loop
            } else {
              // Temos que continuar porque ninguém acertou!
              System.out.println ("Player will have to try again.");       // Caso contrário continua executando o loop e solicita aos jogadores outro palpite.
            } // Fim das instruções if/else
            } // Fim do loop 
        } // Fim do método
            } // Fim da classe