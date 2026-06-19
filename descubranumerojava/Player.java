public class Player {
    int number = 0; // armazena o palpite do jogador
    
    public void guess() {
        number = (int) (Math.random() * 10); // gera chute de 0 a 9
        System.out.println("Estou pensando em " + number);
    }
}