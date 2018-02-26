/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.util;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.util.List;

/**
 *
 * @author INLOC01
 */
public class TraversalPolicy extends FocusTraversalPolicy {

    List<Component> componenti;

    public TraversalPolicy(List<Component> componenti) {
        this.componenti = componenti;
    }

    @Override
    public Component getComponentAfter(Container aContainer, Component aComponent) {
        int index = (componenti.indexOf(aComponent) + 1) % componenti.size();
        return componenti.get(index);
    }

    @Override
    public Component getComponentBefore(Container aContainer, Component aComponent) {
        int index = componenti.indexOf(aComponent) - 1;
        if (index < 0) {
            index = componenti.size() - 1;
        }
        return componenti.get(index);
    }

    @Override
    public Component getFirstComponent(Container aContainer) {
        return componenti.get(0);

    }

    @Override
    public Component getLastComponent(Container aContainer) {
        return componenti.get(componenti.size() - 1);
    }

    @Override
    public Component getDefaultComponent(Container aContainer) {
        return componenti.get(0);
    }
}
