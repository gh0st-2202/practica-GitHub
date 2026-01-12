module practica.GitHub {
    requires javafx.controls;
    requires javafx.fxml;

    // Export and open your package
    exports test.prueba;
    opens test.prueba to javafx.fxml;
}