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
public class SpecCala extends Cala{
    int color;
    public SpecCala(){
        
    }
    
    public SpecCala(int color,String owner,int price){
        this.color = color;
        setOwner(owner);
        setPrice(price);
    }
    @Override
    public String toString(){
      return owner+","+price+","+color;  
    }
    
    public void setData(){
        String str =getOwner();
        str=str.substring(2,3);
        setOwner(getOwner().replaceAll(str,"XX"));
    }
    public int getValue(){
        if(color%2!=0){
            return getPrice()+3;
        }
        else{
            return getPrice()+7;
        }
    }
}
