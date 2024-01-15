// Composite class
import java.util.ArrayList;
import java.util.List;

class Floor implements HousingStructure {
    private List<HousingStructure> structures = new ArrayList<>();
    private String name;

    public Floor(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void enter() {
        System.out.println("Entering Floor: " + name);
        for (HousingStructure structure : structures) {
            structure.enter();
        }
    }
}
