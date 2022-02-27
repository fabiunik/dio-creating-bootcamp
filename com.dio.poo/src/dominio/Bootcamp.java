package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Dev> devRegistered = new HashSet<>();
    private Set<Components> components = new LinkedHashSet<>();
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Set<Dev> getDevRegistered() {
        return devRegistered;
    }
    public void setDevRegistered(Set<Dev> devRegistered) {
        this.devRegistered = devRegistered;
    }
    public Set<Components> getComponents() {
        return components;
    }
    public void setComponents(Set<Components> components) {
        this.components = components;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, devRegistered, components);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description)
        && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate);
    }
    
}
