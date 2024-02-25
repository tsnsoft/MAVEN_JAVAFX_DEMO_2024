module kz.tsnsoft.maven_javafx_demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens kz.tsnsoft.maven_javafx_demo to javafx.fxml;
    exports kz.tsnsoft.maven_javafx_demo;
}
