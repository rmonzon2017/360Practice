/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Center_Control;

import java.math.BigDecimal;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import Hibernate_Controll.*;

/**
 *
 * @author Rafael.M
 */
public class Main_Operations {
    
   public void addUsers(RegisterCars user)
   {
         SessionFactory gate = NewHibernateUtil.getSessionFactory();
   Session session;
   session = gate.openSession();
   Transaction px = session.beginTransaction();
   session.save(user);
   px.commit();
   session.close();
   JOptionPane.showMessageDialog(null,"The Data was inserted successfully");
   }
 
   
   
    
}
