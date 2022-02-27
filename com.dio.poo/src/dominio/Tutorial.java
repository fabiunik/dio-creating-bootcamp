package dominio;

import java.time.LocalDate;

public class Tutorial extends Components {
    
    LocalDate data;

    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public double addXP() {
        return XP_STANDARD + 20d;
    }
    @Override
    public String toString() {
        return "Tutorial {title: " + getTitle() + ", description: " + getDescription() + ", data: " + data + "}";
    }
    
    
}
