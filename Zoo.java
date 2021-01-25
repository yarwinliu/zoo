
/*
 */
public class Zoo
{
    public Cage[] Cages = new Cage[8];
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
    }
    //Cage[] myCage; 

    /*
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        for (int i=0; i<=8; i++){
            Cages[i] = new Cage();
        }

    }

}
