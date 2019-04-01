module org.example.greeter.impl {
    requires org.example.greeter.api;
    provides org.example.greeter.api.Greeter with org.example.greeter.impl.GreeterImpl;
}
