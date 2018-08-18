/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcgbuoi1.newpackage;

/**
 *
 * @author Hien
 */
public class Hobbits {
    String name;
    
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        
        while (z < 3) {
            
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "fordo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.println(h[z]. name + " is a " + "good Hobbit name");
            z = z + 1;
        }
    }
}
