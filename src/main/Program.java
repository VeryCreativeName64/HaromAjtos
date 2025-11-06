package main;

import controller.AjtoController;
import modell.HaromAjtoModell;
import modell.AjtoModell;
import view.AjtoView;

public class Program {

    public Program() {        
        HaromAjtoModell model = new HaromAjtoModell();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AjtoView view = new AjtoView();
                AjtoController controller = new AjtoController(model, view);                
                view.setVisible(true);
                controller.eljaras();
            }
        });
    }

    public static void main(String[] args) {
        new Program();
    }
    
}
