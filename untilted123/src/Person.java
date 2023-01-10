public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public void setAge(int age) {
        if(age<=0 || age>100)  this.age=0;
        else this.age=age;

    }
    public String getFirstName() {
        return this.firstName=firstName;
    }
    public String getLastName() {
        return this.lastName=lastName;
    }
    public int getAge() {
        return this.age=age;
    }
    public boolean isTeen(){
        if(age<20 && age>12) return true;
        else return false;
    }
    public String getFullName(){
        if(firstName.isEmpty()&&lastName.isEmpty()) return lastName;
        if(firstName.isEmpty() && !lastName.isEmpty()) return lastName;
        if(lastName.isEmpty() && !firstName.isEmpty()) return firstName;
        return firstName+" "+lastName;
    }



}
