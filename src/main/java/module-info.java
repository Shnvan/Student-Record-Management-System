module com.ivan.studentrecordmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ivan.studentrecordmanagementsystem to javafx.fxml;
    exports com.ivan.studentrecordmanagementsystem;
}