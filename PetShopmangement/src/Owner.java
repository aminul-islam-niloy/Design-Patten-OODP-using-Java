import java.util.ArrayList;
import java.util.List;

public class Owner implements Cage {
    private List<Pet> pets;

    public Owner() {
       this.pets = new ArrayList<>();
    }
 
    public void addPet(Pet animal)
    {
        pets.add(animal);
       
        System.out.println( animal.getSpecies()+ " is added to cage");
    }

    public void removePet(Pet animal)
    {
        pets.remove(animal);
   
        System.out.println("\n" +animal.getSpecies()+ " is removed from cage");
    }
  
    public void feedPets() {
        System.out.println();
        System.out.println("Feeding all pets: ");
      
        for (Pet pet : pets) {
            pet.eat();
        }
    }


    public void playWithPets() {
        System.out.println( );
        System.out.println("Playing with  pets:");
        for (Pet pet : pets) {
            pet.play();
        }
    }

    public void checkPetsHealth() {
        System.out.println();
        System.out.println("Checking health of pets:");
        for (Pet pet : pets) {
           pet.health();
        }

    }

}
