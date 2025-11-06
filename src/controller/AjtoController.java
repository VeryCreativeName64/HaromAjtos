package controller;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modell.AjtoModell;
import modell.HaromAjtoModell;
import view.AjtoView;


public class AjtoController {
    private HaromAjtoModell modell;
    private AjtoView view;
    
    private ArrayList<AjtoModell> ajtok;
    
    public AjtoController (HaromAjtoModell modell, AjtoView view){
        this.modell = modell;
        this.view = view;
        view.setVisible(true);
    }
    
    public void eljaras(){
        valasztGomb();
        ellenorzes();
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
    
    public void ellenorzes(){
        String kerdes = "Biztos, hogy ezt az ajtót választod?";
        view.getBtnElsoAjto().addActionListener((ActionEvent e)
                -> {
                 int valasz = JOptionPane.showConfirmDialog(null, kerdes, "Megerősítés", JOptionPane.YES_NO_OPTION);
                 if (valasz == JOptionPane.YES_OPTION) {
                     if(modell.getValasztott().equals(true)){
                         JOptionPane.showMessageDialog(null, "Gratulálunk, hazavihetsz egy luxuskocsit!");
                     }else{
                         JOptionPane.showMessageDialog(null, "Sajnálom, de csak egy kecskét vihetsz haza!");
                     }
                 }
        });
        view.getBtnMasodikAjto().addActionListener((ActionEvent e)
                -> {
                 int valasz = JOptionPane.showConfirmDialog(null, kerdes, "Megerősítés", JOptionPane.YES_NO_OPTION);
                 if (valasz == JOptionPane.YES_OPTION) {
                     if(modell.getValasztott().equals(true)){
                         JOptionPane.showMessageDialog(null, "Gratulálunk, hazavihetsz egy luxuskocsit!");
                     }else{
                         JOptionPane.showMessageDialog(null, "Sajnálom, de csak egy kecskét vihetsz haza!");
                     }
                 }
        });
        view.getBtnHarmadikAjto().addActionListener((ActionEvent e)
                -> {
                 int valasz = JOptionPane.showConfirmDialog(null, kerdes, "Megerősítés", JOptionPane.YES_NO_OPTION);
                 if (valasz == JOptionPane.YES_OPTION) {
                     if(modell.getValasztott().equals(true)){
                         JOptionPane.showMessageDialog(null, "Gratulálunk, hazavihetsz egy luxuskocsit!");
                     }else{
                         JOptionPane.showMessageDialog(null, "Sajnálom, de csak egy kecskét vihetsz haza!");
                     }
                 }
        });
    }
}
