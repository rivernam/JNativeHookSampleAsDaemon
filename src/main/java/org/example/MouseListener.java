package org.example;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MouseListener implements NativeMouseListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void nativeMouseClicked(NativeMouseEvent nativeMouseEvent) {
        logger.info("clicked");
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nativeMouseEvent) {
        logger.info("pressed");
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nativeMouseEvent) {
        logger.info("released");
    }
}
