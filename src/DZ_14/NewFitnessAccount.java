package DZ_14;

public class NewFitnessAccount {

    String name;
    String surname;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    String email;
    long phoneNumber;
    int steps;
    double weight;
    int pressureUp;
    int pressureDown;
    int currentYear = 2020;

    int age;
    String pressure;
    String dateOfBirth;

    public NewFitnessAccount(String name, String surname, int dayOfBirth, int monthOfBirth,
                             int yearOfBirth, String email, long phoneNumber, int steps,
                             double weight, int pressureUp, int pressureDown) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.steps = steps;
        this.weight = weight;
        this.pressureUp = pressureUp;
        this.pressureDown = pressureDown;

        this.dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
        this.pressure = pressureUp + "/" + pressureDown;

        if (yearOfBirth <= 2004) {
            age = currentYear - yearOfBirth;
        } else {
            throw new IllegalArgumentException("Minimal age for using: 16 years");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressureUp, int pressureDown) {
        this.pressureUp = pressureUp;
        this.pressureDown = pressureDown;
        this.pressure = pressureUp + "/" + pressureDown;
    }

    public String printAccountInfo() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Date of birth: " + dateOfBirth + "\n" +
                "Age: " + age + "\n" +
                "Email: " + email + "\n" +
                "PhoneNumber: " + phoneNumber + "\n" +
                "Steps: " + steps + "\n" +
                "Weight: " + weight + "\n" +
                "Pressure: " + pressure + "\n";
    }
}
