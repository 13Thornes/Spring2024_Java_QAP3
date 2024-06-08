class Teacher extends Person {
    protected String mySubject;
    protected double mySalary; 


    public Teacher(String name, int age, String gender, String subject, double salary) { // use the super class’ constructor super(name, age, gender);
        super(name, age, gender);
        
        // initialize what’s new to Student
        
        mySubject = subject;
        
        mySalary = salary;
        
        } 

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString() {return myName + ", age: " + myAge + ", gender: " + myGender + ", subject: " + mySubject + ", salary: " + mySalary;} 
}
