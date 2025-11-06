package controller;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import modell.AjtoModell;
import modell.HaromAjtoModell;
import view.AjtoView;


public class AjtoController {
    private HaromAjtoModell modell;
    private AjtoView view;
    
    private ArrayList<AjtoModell> ladak;
    
    public AjtoController (HaromAjtoModell modell, AjtoView view){
        this.modell = modell;
        this.view = view;
        view.setVisible(true);
    }
    
    public void valasztGomb() {
        
        view.getBtnElsoAjto().addActionListener((ActionEvent e)
                -> {
                 modell.setValasztott(modell.getAjtok().get(0));
        });
        view.getBtnMasodikAjto().addActionListener((ActionEvent e)
                -> {
                 modell.setValasztott(modell.getAjtok().get(1));
        });
        view.getBtnHarmadikAjto().addActionListener((ActionEvent e)
                -> {
                 modell.setValasztott(modell.getAjtok().get(2));
        });
    }
}
