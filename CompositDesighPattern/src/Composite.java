public class Composite {
    public static void main(String[] args) {
        // Creating individual rooms
        HousingStructure room1 = new Room("101");
        HousingStructure room2 = new Room("102");

        // Creating a unit and adding rooms to it
        Unit unit1 = new Unit("Unit 1");
        unit1.addStructure(room1);
        unit1.addStructure(room2);

        // Creating a floor and adding the unit to it
        Floor floor1 = new Floor("Floor 1");
        floor1.addStructure(unit1);

        // Creating another room and a unit
        HousingStructure room3 = new Room("201");
        Unit unit2 = new Unit("Unit 2");
        unit2.addStructure(room3);

        // Creating another floor and adding structures to it
        Floor floor2 = new Floor("Floor 2");
        floor2.addStructure(unit2);

        // Creating a building and adding floors to it
        Building building = new Building("XYZ Apartments");
        building.addStructure(floor1);
        building.addStructure(floor2);

        // Entering the building triggers the entire structure hierarchy
        building.enter();
    }
}