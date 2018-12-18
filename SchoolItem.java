public class SchoolItem extends Item {
    private String subject;
    private SchoolItemType type;

    SchoolItem() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public SchoolItemType getType() {
        return type;
    }

    public void setType(SchoolItemType type) {
        this.type = type;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    private int importance;
}
