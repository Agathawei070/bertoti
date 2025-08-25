public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = { new Guerreiro(), new Arqueiro(), new Mago() };

        for (Personagem p : personagens) {
            p.atacar();
        }
    }
} 