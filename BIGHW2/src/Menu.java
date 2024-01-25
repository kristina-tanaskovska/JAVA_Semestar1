import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    static fileToStr read = new fileToStr();
    generalButton_METHODS methods = new generalButton_METHODS();
    //static int size = Menu.games.size();
    public static JMenuBar menuBar = new JMenuBar();
    public static JMenu menu = new JMenu("Save & Load", true);
    public static JMenu OptionsMenu = new JMenu("Game Options", true);
    public static JMenuItem loadFromFile = new JMenuItem("Load from File");
    public static JMenuItem saveToFile = new JMenuItem("Save to File");

    public static int[] array;
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Custom file extension", "txt");

    public static JMenu choose = new JMenu("Choose which game:");
    public static String stringForFile(){
        String save=("("+String.valueOf(main.n)+")"+
                "("+String.valueOf(Window.sum)+")"+
                "("+String.valueOf(main.allottedMoves)+")");
        for(int r = 0; r<(main.n*main.n); r++){
            save+="("+String.valueOf(array[r])+String.valueOf(main.buttons.buttonList.get(r).beenClicked)+")";
        }
        save+="\n";
        return save;
    }
    static List games = new ArrayList<>();
    static int chosenList;
    public Menu(JFrame frame){

        menuBar.add(menu);
        JMenuItem N = new JMenuItem("n");
        OptionsMenu.add(N);
        JMenuItem moves = new JMenuItem("moves:");
        OptionsMenu.add(moves);
        JMenuItem target = new JMenuItem("target:");
        OptionsMenu.add(target);
        menuBar.add(OptionsMenu);
        frame.setJMenuBar(Menu.menuBar);
        JFileChooser chooseFile = new JFileChooser();
        loadFromFile.addActionListener(a -> {
            int fileListener = chooseFile.showOpenDialog(frame);
            if (fileListener == JFileChooser.APPROVE_OPTION) {
                File file = chooseFile.getSelectedFile();
                String path = file.getPath();
            /* try {
                String FILE = methods.readFileToString(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }*/
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(path));
                    String line;
                    int listTrack = games.size();
                    while ((line = reader.readLine()) != null) {


                        String[] parts = line.substring(1, line.length() - 1).split("\\)\\(");


                        int n = Integer.parseInt(parts[0]);
                        int sum = Integer.parseInt(parts[1]);
                        int allottedMoves = Integer.parseInt(parts[2]);
                        int[] array = new int[n * n];
                        boolean[] bool = new boolean[n * n];
                        for (int i = 0; i < n * n; i++) {
                            String[] pair = parts[i + 3].split("(?<=\\D)(?=\\d)");
                            array[i] = Integer.parseInt(pair[0]);
                            bool[i] = Boolean.parseBoolean(pair[1]);
                        }
                        games.add(listTrack + 0, array);
                        games.add(listTrack + 1, bool);
                        games.add(listTrack + 2, n);
                        games.add(listTrack + 3, sum);
                        games.add(listTrack + 4, allottedMoves);
                        listTrack += 5;
                    }
                    reader.close();
                    menu.add(choose);
                } catch (IOException | NumberFormatException ex) {
                    throw new RuntimeException(ex);
                }
            }
            menu.add(choose);
            Buttons.games = games;
            JOptionPane chooseGame = new JOptionPane("Choose game");
            frame.add(chooseGame);
        });
        menu.add(loadFromFile);
        menu.add(saveToFile);
        saveToFile.addActionListener(c -> {
            int Listener = chooseFile.showOpenDialog(frame);
            if(Listener == JFileChooser.APPROVE_OPTION) {
                File fileSave = chooseFile.getSelectedFile();
                BufferedWriter writer;
                try {
                    writer = new BufferedWriter(new FileWriter(fileSave, true));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {

                    writer.write(stringForFile());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    writer.close();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }else if(Listener == JFileChooser.CANCEL_OPTION) {
                File fileSave = new File("saveGame.txt");

                BufferedWriter writer;
                try {
                    writer = new BufferedWriter(new FileWriter(fileSave));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    writer.write(stringForFile());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    writer.close();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }}

        /*for(int i = 0; i<size; i++)
        switch(i/5){
            case 0:{

            }
        }*/
        });
    }
}
