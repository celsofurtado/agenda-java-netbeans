package br.senai.sp.jandira;

import br.senai.sp.jandira.ui.AgendaAppFrame;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AgendaApp {
    
    

    public static void main(String[] args) {
        
        

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            AgendaAppFrame agenda = new AgendaAppFrame();
            agenda.setVisible(true);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AgendaApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AgendaApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AgendaApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
