public abstract class User{
    protected String name;
    protected String email;
    protected int age;

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public int  getAge() {
        return age;
    }
   
    
}