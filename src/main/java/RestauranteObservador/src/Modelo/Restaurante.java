/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Decorator.Combos;
import GUI.PantallaRestaurante;
import Observer.IObserver;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fernando Alvarez
 */
public class Restaurante implements IObserver{
    
    HashMap<String,Combo> combos;
    HashMap<String,Adicional> adicionales;
    PantallaRestaurante pantalla;
    
    public Restaurante() {
        combos = new HashMap<>();
        adicionales = new HashMap<>();
        combos.put("Combo 1", new Combo("Combo 1",1000));
        combos.put("Combo 2", new Combo("Combo 2",1500));
        combos.put("Combo 3", new Combo("Combo 3",1750));
        combos.put("Combo 4", new Combo("Combo 1",800));
        combos.put("Combo 5", new Combo("Combo 1",1200));
        combos.put("Combo 6", new Combo("Combo 1",1700));
        combos.put("Combo 7", new Combo("Combo 1",1100));
        combos.put("Combo 8", new Combo("Combo 1",650));
        adicionales.put("Queso",new Adicional("Queso",300));
        adicionales.put("Tocino", new Adicional("Tocino", 200));
        adicionales.put("Aguacate",new Adicional("Aguacate",150));
        adicionales.put("Bebida", new Adicional("Bebida", 210));
        adicionales.put("Salsa BBQ",new Adicional("Salsa BBQ",105));
        adicionales.put("Pepinillos", new Adicional("Pepinillos", 200));
        adicionales.put("Salchicha",new Adicional("Salchicha",230));
        adicionales.put("Papas Fritas", new Adicional("Papas Fritas", 700));
        adicionales.put("Pan De Ajo",new Adicional("Pan De Ajo",600));
        adicionales.put("Dados De Queso", new Adicional("Dados De Queso", 550));
        pantalla = new PantallaRestaurante();
        pantalla.setVisible(true);
    }
    
    
    public Combo getCombo(String name){
        return combos.get(name).clone();
    }
    
    public Adicional getAdicional(String name){
        return adicionales.get(name).clone();
    }

    @Override
    public void update(Combos combo) {
        pantalla.agregarOrden(combo.getComboInformation());
    }

    public Map<String,Combo> getTodosLosCombos(){
        return combos;
    }
    public Map<String,Adicional> getTodosLosAdicionales(){
        return adicionales;
    }
}
