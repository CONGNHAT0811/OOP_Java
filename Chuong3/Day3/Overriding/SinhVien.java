package Chuong3.Day3.Overriding;

public class SinhVien {
    private String Name;
    private String Age;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (Name == null || Name.isEmpty()) {
            this.Name = "Unknown";
        } else {
            this.Name = Name;
        }
    }
    public String getAge() {
        if (Integer.parseInt(Age) != 1) {
            return Age;
        } else {
            return "Unknown";
        }
    }
    public void setAge(int Age) {
        if(Age > 18 ) {
            this.Age = String.valueOf(Age);
        } else {
            this.Age = String.valueOf(-1);
        }
    }

    
}
