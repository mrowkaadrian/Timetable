public enum SchoolItemType {
    WYKLAD(0),
    LABORATORIUM(1),
    CWICZENIA(2),
    PROJEKT(3),
    SEMINARIUM(4);

    private int id;

    SchoolItemType(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
