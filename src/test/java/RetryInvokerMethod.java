import org.assertj.core.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.runners.model.FrameworkMethod;

public class RetryInvokerMethod extends InvokeMethod {
    private FrameworkMethod method;
    private Object test;
    private int retry;

    RetryInvokerMethod(FrameworkMethod method, Object test, final int retry) {
        super(method, test);
        this.method = method;
        this.test = test;
        this.retry = retry;
    }

    public void evaluate() throws Throwable {
        for (int i = 0; i < retry; i++) {
            try {
                method.invokeExplosively(test);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}