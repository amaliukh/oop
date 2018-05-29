public class Information {
    private String Name;
    private String Gender;
    private String Number;
    private String Date;
    private String Bio;
    private String Requirements;


    public Information(String Name, String Gender, String Number, String Date, String Bio, String Requirements){


        this.Name = Name;
        this.Gender = Gender;
        this.Number = Number;
        this.Date = Date;
        this.Bio = Bio;
        this.Requirements = Requirements;

    }



    @Override



    public String toString() {

        return  "Name: " + Name + "\n" +
                "Gender: " + Gender + "\n" +

                "Number of registration: " + Number + "\n" +

                "Date of registration: " + Date + "\n" +

                "Some information about yourself: " + Bio + "\n" +

                "Requirements for a partner: " + Requirements + "\n";
    }

}