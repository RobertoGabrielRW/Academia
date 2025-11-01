public abstract class Training {
    private Long id;
    private String name;
    private String intensity;
    private Double estimatedCalories;
    private String goal;

    public Training() {

    }

    public Training(Long id, String name, String intensity, Double estimatedCalories, String goal) {
        this.id = id;
        this.name = name;
        this.intensity = intensity;
        this.estimatedCalories = estimatedCalories;
        this.goal = goal;

    }
    // GATTERS
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getIntensity() {
        return intensity;
    }
    public Double getEstimatedCalories () {
        return estimatedCalories;
    }
    public String getGoal() {
        return goal;
    }
    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
    public void setEstimatedCalories(Double estimatedCalories) {
        this.estimatedCalories = estimatedCalories;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
}