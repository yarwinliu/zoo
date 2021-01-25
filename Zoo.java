
/*
 */
public class Zoo
{
    private Cage[] Cages = new Cage[8];
    private String name;
    
    public Zoo(String zooName)
    {
        name = zooName;
        System.out.println("Welcome to " + zooName);
        for (int i=0; i<=8; i++){
            Cages[i] = new Cage();
        }

    }
    
    /*
     * Constructor for objects of class Zoo
     */
    public boolean recieveAnimal(Animal oneAnimal) {
        boolean result = true;
        //loop through cages to check
        return Cages[0].addAnimal(oneAnimal);
        
    }

    


}
