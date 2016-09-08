/**
 * import-Liste 
 * ggf. weiter von Hand anpassen 
 */

public class Fridge {

    private boolean lightOn;
    /**
     */
    private boolean open;
    private int temp;
    private int wantedTemp;
    private Ware[] storage;

    public Fridge(int size){
        //Variablen
        storage= new Ware[size];
        //Auszuführen
    }

    /********* addWare (public) ********************************************/
    public void addWare(int mhd, String name)
    {
        int i=0;

        while(storage[i]!=null&&i<storage.length){
            i++;
        }

        if(i==storage.length)
            System.out.println("Nö");

        else{

            storage[i]= new Ware(mhd, name);
        }

    }
    /********* deleteWare (public) *****************************************/
    public void deleteWare(String pName)
    {
        for(int i=0;i<storage.length;i++){
            if(storage[i]!=null){
                if(storage[i].getName().equals(pName)){
                    storage[i]=null;
                    break;
                }
            }
            if(i==storage.length-1){
                System.out.println("Sorry, I couldn't find this item");
            }
        }
    }

    /********* invertDoor (public) *****************************************/
    public void invertDoor()
    {
        open= !open;
    }

    /********* invertLight (public) ****************************************/
    public void invertLight()
    {
        lightOn= !lightOn;
    }

    /********* getStorage (public) *****************************************/
    public Ware getStorage(int x)
    {
        return(storage[x]);
    }

    /********* getTemp (public) ********************************************/
    public int getTemp()
    {
        return(temp);
    }

    /********* getWantedTemp (public) **************************************/
    public int getWantedTemp()
    {
        return(wantedTemp);
    }

    /********* getWare (public) ********************************************/
    public Ware getWare(String name)
    {
        return storage[1];
    }

    /********* isLightOn (public) ******************************************/
    public boolean isLightOn()
    {
        return(lightOn);
    }

    /********* isOpen (public) *********************************************/
    public boolean isOpen()
    {
        return(open);
    }

    public int getFreeStorage(){
        int y=0;
        for(int i=0;i>20;i++){
            if(storage[i]!=null){
                y++;
            }
        }
        return y;
    }
    public int getStorageLength(){
        return storage.length;
    }
}
