class CollegeStudent extends Student {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) { // use the super class’ constructor super(name, age, gender);
        super(name, age, gender, idNum, gpa);
        
        // initialize what’s new to Student
        
        myMajor = major;
        
        myYear = year;
        
        } 

    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public void setYear(int year) {
        myYear = year;
    }

    public String toString() {return myName + ", age: " + myAge + ", gender: " + myGender + ", ID number: " + myIdNum + ", GPA: " + myGPA + ", Major: " + myMajor + ", Year: " + myYear;} 
}

