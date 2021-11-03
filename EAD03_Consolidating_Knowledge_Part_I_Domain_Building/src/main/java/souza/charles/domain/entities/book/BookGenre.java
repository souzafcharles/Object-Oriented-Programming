package souza.charles.domain.entities.book;

public enum BookGenre {
    ACTION("Ação"),
    DRAMA ("Drama"),
    HISTORY ("História"),
    HORROR ("Horror"),
    SCIENCE ("Ciência"),
    TECHNICAL("Técnico");

    private String label;

    BookGenre(String label){
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
