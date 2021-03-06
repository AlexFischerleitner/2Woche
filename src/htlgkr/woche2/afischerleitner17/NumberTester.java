/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgkr.woche2.afischerleitner17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NumberTester {

    String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("number.txt"))) {
            String line = br.readLine();
            while(line!=null){
                String [] arr = line.split(" ");
                if(Integer.parseInt(arr[0])== 1){
                    System.out.println(arr[1]);
                }else if(Integer.parseInt(arr[0])== 2){
                    System.out.println(arr[1]);                    
                }else if(Integer.parseInt(arr[0])== 1){
                    System.out.println(arr[1]);
                }else {
                    System.out.println("Fehler");
                }       
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
