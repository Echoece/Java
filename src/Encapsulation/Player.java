package Encapsulation;

public class Player {
    // we are making the variables private, thats encapsulating the class work from outside. in applications we dont need to know how it works
    // we just care about health-remaining and lose-health method. so those are only available outside class as public. rest are encapsulated as private
    // this also gives us better protection, as we can put in some validation as well.
    private String name, weapon;
    private int health = 100;

    public Player(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health>0 && health<= 100)
            this.health = health;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0)
            System.out.println("Knocked Out");
        // else reduce the health
    }

    public int healthRemaining(){
        return this.health;
    }
}
