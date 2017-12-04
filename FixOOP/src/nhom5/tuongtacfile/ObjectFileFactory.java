/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.tuongtacfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author krayz
 */
public class ObjectFileFactory {
    public static <E> boolean luuFile (E obj, String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            return true;
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Luu file that bai");
            e.printStackTrace();
        }
        return false;
    }
    
    public static <E> E docFile(String path){
        try{
             
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
          
            E obj = (E) ois.readObject();
            
            ois.close();
            fis.close();
            
            return obj;
        }
     
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Doc file that bai");
            e.printStackTrace();
        }
        
        return null;
    }
    
}
