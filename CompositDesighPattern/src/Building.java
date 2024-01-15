
// Composite class

import java.util.ArrayList;
import java.util.List;

class Building implements HousingStructure {
    private List<HousingStructure> structures = new ArrayList<>();
    private String name;

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void enter() {
        System.out.println("Entering Building: " + name);
        for (HousingStructure structure : structures) {
            structure.enter();
        }
    }
}