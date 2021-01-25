
/*
Zoo naming and welcome message
 */
public class Main
{
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo 5199");
        Animal a;
        //add animals into cages
        for (int i=0; i<4; i++) {
            a = new Keeshond("Kes"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new TibetanMastiff("Tb"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new PotBellied("Pb"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Berkshire("Bk"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Labrador("Lab"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Poodle("Po"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Mud("Mud"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Snapping("Sna"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Malayan("Mal"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
            
            a = new Bengal("Ben"+i, Colour.YELLOW);
            zoo1.recieveAnimal(a);
        }
        
        //check if animals are finished being added
        
        
        //check how many animals are left
    }
}
