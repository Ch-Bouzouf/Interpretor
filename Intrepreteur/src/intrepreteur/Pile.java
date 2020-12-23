/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrepreteur;

import java.util.ArrayList;


public class Pile<T> {
    
    private ArrayList<T> elements = new ArrayList<>();

    public Pile() {
    }
    
    public T getElement(){
        return elements.get(elements.size()-1);
    }
    
    public T depiler(){
        int index = elements.size()-1;
        T t = elements.get(index);
        elements.remove(index);
        return t;
    }
    
    
    public void empiler(T element){
        elements.add(element);
    }
    
}
