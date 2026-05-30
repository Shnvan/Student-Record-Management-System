module com.ivan.studentrecordmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ivan.studentrecordmanagementsystem to javafx.fxml;
    exports com.ivan.studentrecordmanagementsystem;
}