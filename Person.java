class Person {

    //initialize variables
    protected String myName; 
    protected int myAge; 
    protected String myGender; // “M” for male, “F” for female
    
    // create constructor
    public Person(String name, int age, String gender) {
    myName = name; 
    myAge = age ; 
    myGender = gender; 
    }
    
    // getters
    public String getName() {
        return myName;
    }
    
    public int getAge() {
        return myAge;
    }
    
    // setters
    public String getGender() {
        return myGender;
    } 
    
    public void setName(String name) {
        myName = name;
    } 
    
    public void setAge(int age) {
        myAge = age;
    }
    
    public void setGender(String gender) {
        myGender = gender;
    }
    
    //toString() method
    public String toString() { 
        return myName + ", age: " + myAge + ", gender: " + myGender;
     }
 }