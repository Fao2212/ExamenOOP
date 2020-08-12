/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauranteobservador;

import GUI.PantallaCliente;
import Modelo.Customer;
import Modelo.Restaurante;

/**
 *
 * @author Fernando Alvarez
 */
public class RestauranteObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Customer c1 = new Customer(restaurante,"1");
        Customer c2 = new Customer(restaurante,"2");
        Customer c3 = new Customer(restaurante,"3");
        Customer c4 = new Customer(restaurante,"4");
    }
    
}
