class Main {
    public static void main(String[] args) {
        student rahul = new student();   // Object creation
        rahul.changeName("Amitabha");    // Changing the name
        System.out.println(rahul.name);  // Printing updated name
    }
}

class student {
    int roll;
    String name;
    float marks;

    // Constructor
    student() {
        this.roll = 12;
        this.name = "Rahul";
        this.marks = 88.5f;
    }

    // Method to change name
    void changeName(String newName) {
        this.name = newName;
    }
}
