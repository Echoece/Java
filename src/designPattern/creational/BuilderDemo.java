package designPattern.creational;

import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {
}

class OrderBuilder{
    void prepareOrder(){
        // some loop/GUI here for taking order
        // then we process the order and call add item with that order.
    }
}
class OrderedItems {

    List<Item> items=new ArrayList<Item>();

    public void addItems(Item item){

        items.add(item);
    }
    public float getCost(){

        float cost=0.0f;
        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }
    public void showItems(){

        for (Item item : items) {
            System.out.println("Item is:" +item.name());
            System.out.println("Size is:" +item.size());
            System.out.println("Price is: " +item.price());

        }
    }

}

/*-----------------------------------------*/

interface  Item {
    public String name();
    public String size();
    public float price();
}

/*-----------------------------------------*/

abstract class Pizza implements Item{
    @Override
    public abstract float price();
}

abstract class ColdDrink implements Item{
    @Override
    public abstract float price();
}

/*-----------------------------------------*/

abstract class VegPizza extends Pizza{
    @Override
    public abstract float price();
    @Override
    public abstract  String name();
    @Override
    public abstract  String size();
}

abstract class NonVegPizza extends Pizza{
    @Override
    public abstract float price();
    @Override
    public abstract String name();
    @Override
    public abstract String size();
}

/*-----------------------------------------*/
// three size implementation classes of vegetable pizza
class SmallCheezePizza extends VegPizza{
    @Override
    public float price() {
        return 170.0f;
    }
    @Override
    public String name() {
        return "Cheeze Pizza";
    }
    @Override
    public String size() {
        return "Small size";
    }
}

class MediumCheezePizza extends VegPizza{
    @Override
    public float price() {
        return  220.f;
    }
    @Override
    public String name() {
        return "Cheeze Pizza";
    }
    @Override
    public String size() {
        return "Medium Size";
    }
}

class LargeCheezePizza extends VegPizza{
    @Override
    public float price() {
        return 260.0f;
    }
    @Override
    public String name() {
        return "Cheeze Pizza";
    }
    @Override
    public String size() {
        return "Large Size";
    }
}

class ExtraLargeCheezePizza extends VegPizza{
    @Override
    public float price() {
        return 300.f;
    }
    @Override
    public String name() {
        return  "Cheeze Pizza";
    }
    @Override
    public String size() {
        return "Extra-Large Size";
    }
}
/*-----------------------------------------*/

/*-----------------------------------------*/
class SmallOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 120.0f;
    }
    @Override
    public String name() {
        return  "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Small Size";
    }
}
class MediumOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 150.0f;
    }
    @Override
    public String name() {
        return  "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Medium Size";
    }
}
class LargeOnionPizza extends  VegPizza{
    @Override
    public float price() {
        return 180.0f;
    }
    @Override
    public String name() {
        return "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Large size";
    }
}
class ExtraLargeOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 200.0f;
    }
    @Override
    public String name() {
        return  "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Extra-Large Size";
    }
}
/*-----------------------------------------*/


