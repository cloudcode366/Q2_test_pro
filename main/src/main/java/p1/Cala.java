package p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhat Minh
 */
public class Cala {
    String owner;
    int price;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Cala(){
        
    }
    
    public Cala(String owner, int price){
        setOwner(owner);
        setPrice(price);
    }
    
    public String toString(){
        return owner+","+price;
    }
}

