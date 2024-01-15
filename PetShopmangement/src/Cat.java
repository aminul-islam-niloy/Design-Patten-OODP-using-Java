public class Cat implements Pet {
    private String name;
    private String species;

    public Cat(String name) {
        this.name= name;
        this.species= "Cat";
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
        System.out.println(name + "(" + species + ") is playing with mice.");
    }

    @Override
    public void health() {
        System.out.println("Health of "+name + "(" + species + ") is good.");
    }

    }

