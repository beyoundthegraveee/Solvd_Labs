package Lab03;

public enum Equipment {
    PROJECTOR("Projector"),
    WHITEBOARD("Whiteboard"),
    COMPUTER("Computer"),
    SMART_BOARD("Smart Board"),
    DOCUMENT_CAMERA("Document Camera"),
    AUDIO_SYSTEM("Audio System"),
    MICROPHONE("Microphone"),
    LAPTOP("Laptop"),
    TABLE("Table"),
    CHAIR("Chair"),
    BOOKSHELF("Bookshelf"),
    PRINTER("Printer"),
    SCANNER("Scanner"),
    VR_HEADSET("VR Headset"),
    KINDLE("Kindle");

    private final String equipmentName;

    Equipment(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    @Override
    public String toString() {
        return equipmentName;
    }

}
