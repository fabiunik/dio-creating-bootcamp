package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Components> componentRegistered = new LinkedHashSet<>();
    private Set<Components> componentCompleted = new LinkedHashSet<>();
    
    public void applyBootcamp(Bootcamp bootcamp) {
        this.componentRegistered.addAll(bootcamp.getComponents());
        bootcamp.getDevRegistered().add(this);
    }

    public void updateBootcamp() {
        Optional<Components> contents = this.componentRegistered.stream().findFirst();
        if (contents.isPresent()) {
            this.componentCompleted.add(contents.get());
            this.componentRegistered.remove(contents.get());
        } else {
            System.out.println("You are not enrolled in any content.");
        }
    }
    
    public double addTotalXP() {
        return this.componentCompleted.stream()
        .mapToDouble(contents -> contents.addXP()).sum();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Components> getComponentRegistered() {
        return componentRegistered;
    }
    public void setComponentRegistered(Set<Components> componentRegistered) {
        this.componentRegistered = componentRegistered;
    }
    public Set<Components> getComponentCompleted() {
        return componentCompleted;
    }
    public void setComponentCompleted(Set<Components> componentCompleted) {
        this.componentCompleted = componentCompleted;
    }
    @Override
    public int hashCode() {        
        return Objects.hash(name, componentRegistered, componentCompleted);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev dev = (Dev) obj;
           return Objects.equals(name, dev.name) && Objects.equals(componentRegistered, dev.componentRegistered) && Objects.equals(componentCompleted, dev.componentCompleted);
    }

    
    
}
