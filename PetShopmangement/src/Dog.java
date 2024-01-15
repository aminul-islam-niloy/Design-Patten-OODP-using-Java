public class Dog implements Pet {
    private String name;
    private String species;

    public Dog(String name) {
        this.name= name;
        this.species= "Dog";
    }

    public String getName(){
        return name;
    }

    public String getSpecies()
    {
        return species;
    }
    @Override
    public void eat() {
        System.out.println(name + "(" + species + ") is eating.");
    }

    @Override
    public void play() {
        System.out.println(name + "(" + species + ") is playing with cat.");
    }

    @Override
    public void health() {
        System.out.println("Health of "+name + "(" + species + ") is good.");
    }

}
