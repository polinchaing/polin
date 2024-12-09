class Example {
    int number = 5;
    void display() {
        System.out.println("Default access modifier.");
    }

    public static void main(String[] args) {
        Example example = new Example(); // Create an instance of Example
        example.display();  // Call the display method
    }
}
