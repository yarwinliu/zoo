
/*
 */


public class Zoo
{
    private Cage[] Cages = new Cage[8];
    private String name;
    
    
    //constructor - has same name as class
    public Zoo(String zooName)
    {
        name = zooName;
        
        System.out.println("Welcome to " + name);
        for (int i=0; i<8; i++){
            Cages[i] = new Cage(i);
        }
        
        fillAnimal();

    }
    
    public void fillAnimal () {
        Animal a;
        
        for (int i=0; i<4; i++) {
            a = new Keeshond("Kes"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new TibetanMastiff("Tb"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new PotBellied("Pb"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Berkshire("Bk"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Labrador("Lab"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Poodle("Po"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Mud("Mud"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Snapping("Sna"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Malayan("Mal"+i, Colour.YELLOW);
            recieveAnimal(a);
            
            a = new Bengal("Ben"+i, Colour.YELLOW);
            recieveAnimal(a);
        }
    }
    
    /*
     * Constructor for objects of class Zoo
     */
    public boolean recieveAnimal(Animal oneAnimal) {
        boolean result = true;
        //loop through cages to check
        for (int i=0;i<8; i++) {
            if (Cages[i].addAnimal(oneAnimal)==true)
            {
                System.out.println("filled" + i + "successfully");
                return true;
                
            }
        }
        
        System.out.println("filled unsuccessfully");
        return false;
    }

    


}
