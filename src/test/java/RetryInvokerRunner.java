import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class RetryInvokerRunner extends BlockJUnit4ClassRunner {
    private static final int retryCount = 3;

    public RetryInvokerRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        System.out.println("Invoking: " + method.getName());
        return new RetryInvokerMethod(method, test, retryCount);
    }
}