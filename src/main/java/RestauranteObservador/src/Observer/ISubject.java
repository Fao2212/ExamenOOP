/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Decorator.Combos;

/**
 *
 * @author Fernando Alvarez
 */
public interface ISubject {
    
    public void Notify(Combos combo);
    
}
