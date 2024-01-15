public class PetManagement {
    public static void main(String[] args) {
        Owner owner = new Owner();

        // Adding pets to the cage
        Pet cat = new Cat("Whiskers");
        Pet dog = new Dog("Buddy");
        Pet dog2= new Dog("Lotif");

        owner.addPet(dog);
        owner.addPet(cat);
        owner.addPet(dog2);

        // Performing actions on pets
        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();

        owner.removePet(cat);

      // Performing actions on pets
        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();





    }
}
