package OOPConcepts.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player= new Player("echo", "sword", 50);

        player.loseHealth(10);
        System.out.println("remaining health = "+ player.healthRemaining() );

        player.loseHealth(11);
        System.out.println("remaining health = " + player.healthRemaining() );
    }
}
