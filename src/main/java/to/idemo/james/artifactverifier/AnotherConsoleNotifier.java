package to.idemo.james.artifactverifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import to.idemo.james.artifactverifier.notification.Notifier;

@Component
public class AnotherConsoleNotifier implements Notifier {
    private static final Logger logger = LoggerFactory.getLogger(AnotherConsoleNotifier.class);

    public AnotherConsoleNotifier() {
        logger.info("Notifier plugin online");
    }

    @Override
    public void warn(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason) {
        logger.warn("Warn event: {}, {}, {}, {}, {}", artifactName, artifactType, artifactLocation, attributedUser, reason);
    }

    @Override
    public void alert(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason) {
        logger.error("Alert event: {}, {}, {}, {}, {}", artifactName, artifactType, artifactLocation, attributedUser, reason);
    }
}
