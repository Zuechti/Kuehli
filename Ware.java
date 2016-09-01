/**
 * import-Liste 
 * ggf. weiter von Hand anpassen 
 */

public class Ware {

    private int mhd;
    /**
     */
    private String name;

    /********* Ware (public) ***********************************************/
    public Ware(int pMhd,  String pName)
    {
        mhd=pMhd;
        name=pName;
    }

    /********* getMhd (public) *********************************************/
    public int getMhd()
    {
        return(mhd);
    }

    /********* getName (public) ********************************************/
    public String getName()
    {
        return(name);
    }

    public void setName(String pName){
        name=pName;
    }

}
