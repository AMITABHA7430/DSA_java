class Main {
    public static void main(String[] args) {
        student rahul = new student();  // Correct object creation
        System.out.println(rahul.name);
    }
}

class student {
    int roll;
    String name;
    float marks;

    // Constructor
    student() {
        roll = 12;
        name = "Rahul";
        marks = 88.5f;
    }
}
