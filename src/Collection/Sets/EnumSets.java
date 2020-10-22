package Collection.Sets;

import java.util.EnumSet;

public class EnumSets {
    enum Game { CRICKET, HOCKEY, TENNIS }
    public static void main(String[] args)
    {
        // Creating EnumSet using allOf()
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);

        // Using remove()
        boolean value1 = games.remove(Game.CRICKET);

        // printing elements to the console
        System.out.println("Is CRICKET removed? " + value1);

        // Using removeAll()
        boolean value2 = games.removeAll(games);

        // printing elements to the console
        System.out.println("Are all elements removed? "
                + value2);
    }
}
