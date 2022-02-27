package dominio;

public abstract class Components {

    protected static final double XP_STANDARD = 10d;

    private String title;
    private String description;

    public abstract double addXP();
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
    
}
