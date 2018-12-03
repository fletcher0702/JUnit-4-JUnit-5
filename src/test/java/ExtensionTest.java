import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;


public class ExtensionTest {

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void before() {

        PrintStream out = new PrintStream(byteArrayOutputStream);
        System.setOut(out);
    }

    @Test
    public void should_failed_if_time_less_than_2_seconds(){

        // GIVEN
        LauncherDiscoveryRequest request  = request()
                .selectors(selectClass(FizzBuzzJ5Test.class))
                .build();


        SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();

        // WHEN
        LauncherFactory.create().execute(request, summaryGeneratingListener);

        //THEN
        Assertions.assertThat(byteArrayOutputStream.toString()).contains("Test executed in :");



    }
}
