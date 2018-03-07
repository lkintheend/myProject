/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ailatrieuphu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 3000);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
            while(true){
            Scanner sc = new Scanner(System.in);
            dos.writeUTF(sc.next());
            System.out.println(dis.readUTF());
        }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
