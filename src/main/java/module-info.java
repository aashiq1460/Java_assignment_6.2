module org.example.java_assignment_6_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_assignment_6_2 to javafx.fxml;
    exports org.example.java_assignment_6_2;
}