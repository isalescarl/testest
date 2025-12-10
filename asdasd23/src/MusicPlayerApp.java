import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import java.util.List;
import javax.sound.sampled.*;
import java.io.IOException;


public class MusicPlayerApp extends JFrame {
    private PlaybackController controller;

    public MusicPlayerApp() {
        controller = new PlaybackController();

        setTitle("Music Player");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        add(new SidebarPanel(controller), BorderLayout.WEST);
        add(new MainPanel(controller), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new MusicPlayerApp().setVisible(true);
        });
    }
}