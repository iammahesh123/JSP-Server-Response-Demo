package demo;

public class UserData {
    private String name;
    private String education;
    private String occupation;

    public UserData(String name, String education, String occupation) {
        this.name = name;
        this.education = education;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public String getOccupation() {
        return occupation;
    }
}
