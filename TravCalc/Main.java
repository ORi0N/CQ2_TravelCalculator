/*
 * Main.java
 *
 * Created on 2 februari 2007, 17:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package TravCalc;

import javax.swing.ImageIcon;

/**
 *
 * @author ORi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Interface frame = new Interface();
        
            
            //UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        } catch(Exception ex){
            
            
        }
        
    }
    
}
