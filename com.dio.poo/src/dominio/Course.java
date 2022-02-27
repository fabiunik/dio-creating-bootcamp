package dominio;

public class Course extends Components {
    
    private int creditHours;

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public double addXP() {
        return XP_STANDARD * creditHours;
    }
    
        
    @Override
    public String toString() {
        return "Course {title: " + getTitle() + ", description: " + getDescription() + ", workloadHours: " + creditHours + "}";
    }



    
    
}
