module e1.testdragdrop {
    requires javafx.controls;
    requires javafx.fxml;


    opens e1.testdragdrop to javafx.fxml;
    exports e1.testdragdrop;
}