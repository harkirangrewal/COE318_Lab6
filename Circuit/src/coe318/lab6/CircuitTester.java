/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author hari
 */
public class CircuitTester {
    
    public static void main(String[] args){
        Circuit cir = Circuit.getInstance();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Resistor res = new Resistor (12.0, node1, node2);
        Resistor res1 = new Resistor(15.0, node2, node3);
        cir.add(res);
        cir.add(res1);
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        System.out.println(cir);
    }
    
}
