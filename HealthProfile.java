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
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public  void  setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public void setBirthMonth(int birthMonth){ this.birthMonth  = birthMonth;}
    public void setBirthDay(int birthDay){this.birthDay = birthDay;}
    public void setHeight(double height){this.height = height;}
    public void setWeight(double weight){this.weight = weight;}

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    public int getBirthDay(){
        return birthDay;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    public int calculateAge(){

        return 2024 - birthYear;
    }
    public int calculateHeartRateMax(){


        return   220 - calculateAge();
    }

    public int[] calculateTargetHeartR(){
        int maxHeart = calculateHeartRateMax();
        int lowerHeart = (int) (maxHeart * 0.5);
        int upperHeart = (int) (maxHeart * 0.85);
        return new int[]{lowerHeart,upperHeart};
    }

    public double calculateBMI() {
        // Convert weight from pounds to kilograms (1 pound = 0.453592 kilograms)
        double weightInKilograms = weight * 0.453592;

        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightInMeters = height * 0.0254;

        // Calculate BMI using the formula
        return weightInKilograms / (heightInMeters * heightInMeters);
    }


}
