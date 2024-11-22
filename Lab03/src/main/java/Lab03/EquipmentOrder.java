package Lab03;

public interface EquipmentOrder {

    boolean orderEquipment(Equipment equipment);

    boolean isEquipmentAvailable(Equipment equipment);

    boolean removeEquipment(Equipment equipment);

    Equipment[] listAvailableEquipment();
}
