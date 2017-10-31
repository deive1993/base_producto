/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mltutoriales.Productos;
import mltutoriales.Mltutoriales;
/**
 *
 * @author USER
 */
public class ControladorGuardar implements MouseListener{
/*
   private JTextField txtpro;
   private JTextField txtcod;
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "teamo110593gnd";
   String url = "jdbc:mysql://localhost:3307/mltutoriales";
   String driver= "com.mysql.jdbc.Driver";
   */
   
    @Override
    public void mouseClicked(MouseEvent evt) {
     /*   System.out.println("guardado");
                try {
                Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            s=conect.prepareStatement("insert into producto values (?,?)");
            s.setString(1, txtcod.getText());
            s.setString(2, txtpro.getText());
            s.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "prouctos guardadas exitosamente");
        } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
*/
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
