/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author FilipeBarros
 */
public class Arquivo {

    public static void salvar(ArrayList array, String nomeArquivo) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public static ArrayList ler(String nomeArquivo) {
        ArrayList array = null;
        try {
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            array = (ArrayList) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return array;

    }
    
    
}
