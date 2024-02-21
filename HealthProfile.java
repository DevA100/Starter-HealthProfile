public class HealthProfile {

    public String firstName;
    public String lastName;
    public int birthDay;
    public int birthMonth;
    public int birthYear;
    public double height;
    public  double weight;


    public HealthProfile(String firstName,String lastName, int birthDay, int birthMonth, int birthYear, double height, double weight ){
        this.firstName = firstName;
        this.lastName = lastName;

        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public  void  setBirthYear(){
        this.birthYear = birthYear;
    }

}
