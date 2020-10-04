import org.example.greeter.api.Greeter;
import org.example.greeter.impl.GreeterImpl;

module org.example.greeter.impl {
    requires transitive org.example.greeter.api;
    provides Greeter with GreeterImpl;
}
