class CollegeStudent extends Student {

    // initialize variables
    protected String myMajor;
    protected int myYear;

    // create constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) { 

        // use the super class’ constructor
        super(name, age, gender, idNum, gpa);

        // initialize what’s new to CollegeStudent
        
        myMajor = major;
        
        myYear = year;
        
        } 

    // Getters
    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    // Setters
    public void setMajor(String major) {
        myMajor = major;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // toString() method
    public String toString() {return myName + ", age: " + myAge + ", gender: " + myGender + ", ID number: " + myIdNum + ", GPA: " + myGPA + ", Major: " + myMajor + ", Year: " + myYear;} 
}

