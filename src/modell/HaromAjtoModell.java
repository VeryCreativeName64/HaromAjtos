package modell;

import java.util.ArrayList;
import java.util.List;


public class HaromAjtoModell 
{

    private List<AjtoModell> ajtok;
    private AjtoModell valasztott; 

    public HaromAjtoModell() {
        ajtok = new ArrayList<>();
        
        ajtok.add(new AjtoModell("kek", false));
        ajtok.add(new AjtoModell("piros", true));
        ajtok.add(new AjtoModell("zold", false));
    }

    public List<AjtoModell> getAjtok() 
    {
        return ajtok;
    }

    public void setValasztott(AjtoModell lada) 
    {
        this.valasztott = lada;
    }

    public String getValasztott() {
        return valasztott.getSzin();
    }

    public AjtoModell getKincsesLada() 
    {
        return ajtok.get(1);
    }
}
