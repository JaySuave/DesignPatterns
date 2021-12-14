public class Romulans extends AlienClient{
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
