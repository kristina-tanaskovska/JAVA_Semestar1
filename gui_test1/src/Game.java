import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {

    private static final long serialVersionUID = 1L;
    int WIDTH = 1024;
    int HEIGHT = 576;
    int SCALE = 1;
    int heroX, heroY;
    int x, y;

    public static void main(String[] args) {
        new Game();
    }

    public Game() {

        setSize(WIDTH * SCALE, HEIGHT * SCALE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BasicJava2DGame");
        setVisible(true);



        addKeyListener(new Input());

        heroX = getWidth() / 2 - 16;
        heroY = getHeight() / 2 - 16;

        try {
            while (true) {
                update();
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void paint(Graphics g) {

        Image offScreen = createImage(getWidth(), getHeight());
        draw(offScreen.getGraphics());

        g.drawImage(offScreen, 0, 0, null);
    }

    public void draw(Graphics g) {

        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLUE);
        g.fillOval(heroX, heroY, 32, 32);

        g.setColor(Color.WHITE);
        g.fillOval(heroX + 6, heroY + 8, 8, 8);
        g.fillOval(heroX + 18, heroY + 8, 8, 8);

        g.setColor(Color.BLACK);
        g.fillOval(heroX + 8, heroY + 10, 4, 4);
        g.fillOval(heroX + 20, heroY + 10, 4, 4);

        g.fillRect(heroX + 6, heroY + 22, 20, 2);


        repaint();

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void update() {
        heroX += x;
        heroY += y;
    }

    public class Input implements KeyListener {

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_W) {
                setY(-5);
            }
            if (keyCode == KeyEvent.VK_A) {
                setX(-5);
            }
            if (keyCode == KeyEvent.VK_S) {
                setY(5);
            }
            if (keyCode == KeyEvent.VK_D) {
                setX(5);
            }
            if (keyCode == KeyEvent.VK_ESCAPE) {
                stop();
            }
        }

        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_W) {
                setY(0);
            }
            if (keyCode == KeyEvent.VK_A) {
                setX(0);
            }
            if (keyCode == KeyEvent.VK_S) {
                setY(0);
            }
            if (keyCode == KeyEvent.VK_D) {
                setX(0);
            }
        }

        public void keyTyped(KeyEvent e) {

        }

    }

    public void run() {
        new Thread().start();
    }

    public void stop() {
        System.exit(0);
    }

}
