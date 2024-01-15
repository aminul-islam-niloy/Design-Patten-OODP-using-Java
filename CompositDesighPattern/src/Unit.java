import java.util.ArrayList;
import java.util.List;


// Composite class
class Unit implements HousingStructure {
    private List<HousingStructure> structures = new ArrayList<>();
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void enter() {
        System.out.println("Entering Unit: " + name);
        for (HousingStructure structure : structures) {
            structure.enter();
        }
    }
}
