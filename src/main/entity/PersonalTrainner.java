import java.time.LocalDate;

// classe que representa um treinador pessoal na academia
public class PersonalTrainner extends Person {
    private String specialization;
    private double salary;
    private LocalDate hireDate;

    public PersonalTrainner() {
    }

    public PersonalTrainner(Long id, String firstName, String lastName, String email, String phone, String specialization, double salary, LocalDate hireDate) {
        super(id, firstName, lastName, email, phone, null, null, true);
        this.specialization = specialization;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "PersonalTrainner{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", person=" + super.toString() +
                '}';
    }
}
