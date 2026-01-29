import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowCount = 21;
    private int columnCount = 19;
    private int tileSize = 32;
    private int boardWidth = columnCount * tileSize;
    private int boardHeight = rowCount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);


        // Load Images
        wallImage = new ImageIcon(getClass().getResource("./image/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./image/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./image/orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./image/pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./image/redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./image/pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./image/pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./image/pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./image/pacmanRight.png")).getImage();

    }

}

