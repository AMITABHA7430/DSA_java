class Main {
    public static void main(String[] args) {
        student rahul = new student();          // Default constructor
        rahul.changeName("Amitabha");           // Change name
        System.out.println("Rahul's Roll: " + rahul.roll);
        System.out.println("Rahul's Name: " + rahul.name);
        System.out.println("Rahul's Marks: " + rahul.marks);

        // Copy constructor example
        student raj = new student(rahul);       // Copy constructor
        System.out.println("\nCopied Student:");
        System.out.println("Name: " + raj.name);
        System.out.println("Roll: " + raj.roll);
        System.out.println("Marks: " + raj.marks);
    }
}

class student {
    int roll;
    String name;
    float marks;

    // ✅ Default constructor
    student() {
        this.roll = 12;
        this.name = "Rahul";
        this.marks = 88.5f;
    }

    // ✅ Copy constructor
    student(student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }

    // ✅ Method to change name
    void changeName(String newName) {
        this.name = newName;
    }
}
