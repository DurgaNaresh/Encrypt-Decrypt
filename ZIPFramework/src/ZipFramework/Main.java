/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ZipFramework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neill Harper
 */
public class Main {

    public static void main(String[] arg)
    {
        try {
            ZIPFile zip = new ZIPFile("D:\\myfirstZipJava.zip");


            Method meth = new Method();
            meth.setMethodValue(Method.Deflated);
            FileEntry file = new FileEntry("D:\\text.txt", meth);



            zip.AddFile(file);


            zip.CreateZIP();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    

