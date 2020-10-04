import org.example.greeter.api.*;
import static org.example.greeter.api.Greeter.*;

module org.example.gui {
    requires org.example.greeter.api;
    requires javafx.controls;
    opens org.example.gui to javafx.graphics;

    uses Greeter;
}
