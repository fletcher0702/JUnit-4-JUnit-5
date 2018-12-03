import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class DisplayExecutionTimeRunner extends BlockJUnit4ClassRunner {
    private long start;
    private long end;
    public DisplayExecutionTimeRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        System.out.println("Invoking: " + method.getName());
        return super.methodInvoker(method, test);
    }

    @Override
    protected Statement withBefores(FrameworkMethod method, Object test, final Statement statement) {
        Statement statement1 = new Statement() {
            public void evaluate() throws Throwable {
                start = System.currentTimeMillis();
                statement.evaluate();
            }
        };

        return super.withBefores(method, test, statement1);
    }

    @Override
    protected Statement withAfters(FrameworkMethod method, Object test, final Statement statement) {
        Statement statement1 = new Statement() {
            public void evaluate() throws Throwable {
               statement.evaluate();
                end = System.currentTimeMillis();
                System.out.println("Duration: " +  (end - start) + " ms");
            }
        };
        return super.withAfters(method, test, statement1);
    }
}
