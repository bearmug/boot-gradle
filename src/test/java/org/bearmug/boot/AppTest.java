package org.bearmug.boot;

import org.bearmug.boot.controller.DefaultController;
import org.junit.Test;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

public class AppTest {

    @Test
    public void testApp() {
        DefaultController controller = new DefaultController();
        assertTrue(controller.root().startsWith("It`s running and current timestamp is"),
                "DefaultController test");
    }
}
