class Teacher extends Person {

    // initialize variables
    protected String mySubject;
    protected double mySalary; 

    // create constructor
    public Teacher(String name, int age, String gender, String subject, double salary) { 
        
        // use the super class’ constructor
        super(name, age, gender);
        
        // initialize what’s new to Teacher
        
        mySubject = subject;
        
        mySalary = salary;
        
        } 


    // Getters
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // Setters
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString() Method
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender + ", subject: " + mySubject + ", salary: " + mySalary;
    } 
}
