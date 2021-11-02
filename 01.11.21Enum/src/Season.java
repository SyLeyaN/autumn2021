public enum Season {
    WINTER ("холодно\n"),
    SPRING ("сыро\n"),
    SUMMER ("жарко\n"),
    AUTUMN ("дождливо\n");

    private String description;

    Season(String desc){
        this.description=desc;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }
}
