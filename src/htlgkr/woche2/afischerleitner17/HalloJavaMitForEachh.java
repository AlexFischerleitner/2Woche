/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgkr.woche2.afischerleitner17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class HalloJavaMitForEachh {
    List<String> java = new ArrayList<>();
    
    public HalloJavaMitForEachh(){
        
    }
    
    public void printList(){
        this.java.add("lost");
        this.java.add("Ich");
        
        for(String s: java){
            System.out.println(s);
        }
    }
    
    public void printListforEach(){
        this.java.add("lost");
        this.java.add("Ich");
        
        this.java.forEach((String s) -> System.out.println(s));
    }
}
