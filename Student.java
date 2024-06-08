class Student extends Person { 

// initialize variables
protected String myIdNum; // Student Id Number 
protected double myGPA; // grade point average

// create constructor
public Student(String name, int age, String gender, String idNum, double gpa) { 
    
    // use the super class’ constructor
    super(name, age, gender);
    
    // initialize what’s new to Student
    
    myIdNum = idNum;
    
    myGPA = gpa;
    
    } 

// Getters
public String getIdNum() {
    return myIdNum;
}

public double getGPA() {
    return myGPA;
}

// Setters
public void setIdNum(String id) {
    myIdNum = id;
}

public void setGPA(double GPA) {
    myGPA = GPA;
}

// toString() method
public String toString() {
    return myName + ", age: " + myAge + ", gender: " + myGender + ", ID number: " + myIdNum + ", GPA: " + myGPA;
} 
}