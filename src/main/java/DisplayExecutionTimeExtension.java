import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


public class DisplayExecutionTimeExtension implements BeforeEachCallback, AfterEachCallback {

    private double start = 0;

    public void beforeEach(ExtensionContext extensionContext) {
        start = System.currentTimeMillis();
    }

    public void afterEach(ExtensionContext extensionContext) {
        double end = System.currentTimeMillis() - start;
        System.out.println("Test executed in : " + end + " s");
    }
}
