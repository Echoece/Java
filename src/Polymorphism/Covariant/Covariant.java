package Polymorphism.Covariant;

class Burger{ }
class HealthyBurger extends Burger{}

class BurgerFactory{
    public Burger createBurger(){
        return new Burger();
    }
}
// so since the parent class have return type Burger, in the overridden method we can have any child class of Burger ( HealthyBurger in this case)
// as return type. this is known as covariant return types
class HealthyBurgerFactory extends BurgerFactory{
    @Override
    public Burger createBurger() {
        return new HealthyBurger();
    }
}



public class Covariant {
}
