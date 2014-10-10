/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examples;

/**
 *
 * @author RumeshH
 */
public class SingletonTest {
    
}

class PrinterSingelton{
    private static PrinterSingelton instance = null;
    private int jobCount;
    
    private PrinterSingelton(){
        this.jobCount = 0;
    }
    
    public static PrinterSingelton getInstance(){
        if(instance == null){
            instance = new PrinterSingelton();
        }
        return instance;
    }
}
