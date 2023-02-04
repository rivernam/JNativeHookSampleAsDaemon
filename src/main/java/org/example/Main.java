package org.example;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.mouse.NativeMouseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Get the logger for "com.github.kwhat.jnativehook" and set the level to warning.
        java.util.logging.Logger hooklogger = java.util.logging.Logger.getLogger(GlobalScreen.class.getPackage().getName());
        hooklogger.setLevel(Level.WARNING);

        // Don't forget to disable the parent handlers.
        hooklogger.setUseParentHandlers(false);

        logger.info("Hello world!");
        try {
            GlobalScreen.registerNativeHook();
            logger.info("Is NativeHookRegistred :" + GlobalScreen.isNativeHookRegistered());
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        NativeMouseListener listener = new MouseListener();

        // Add the appropriate listeners.
        GlobalScreen.addNativeMouseListener(listener);
    }
}