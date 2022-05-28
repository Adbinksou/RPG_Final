module com.example.rpg_final {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.rpg_final to javafx.fxml;
    exports com.example.rpg_final;
}