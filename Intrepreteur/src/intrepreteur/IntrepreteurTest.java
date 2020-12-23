/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrepreteur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class IntrepreteurTest {

    
    public static void main(String[] args)  {
      
       
        
        File f = new File("source.text");
        try {
			Scanner scanner = new Scanner(f);
			while ( scanner.hasNext()) {
				String text= scanner.nextLine() ;
			    System.out.println(text);  
			    new Interpreteur(text);
			}	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
    }
    
    
    
}
