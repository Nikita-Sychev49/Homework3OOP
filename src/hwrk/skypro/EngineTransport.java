package hwrk.skypro;

public abstract class EngineTransport extends WheelingTransport{
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
