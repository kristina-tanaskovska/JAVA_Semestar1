import javax.swing.JOptionPane;

public class BasicGUI2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,
                "Your name?",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        String age = JOptionPane.showInputDialog(null,
                "How old are you?",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        String studyingYear = JOptionPane.showInputDialog(null,
                "In which year of studying are you enrolled?",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        int ageInt = Integer.parseInt(age);
        int studyingYearInt = Integer.parseInt(studyingYear);

        String message = "Well, I know you! You are " + name +
                " and you are " + ageInt + " years old. " +
                "You go to FAMNIT and you are \n" +
                studyingYearInt + " year of studying. " +
                "Nice to meet you!";

        JOptionPane.showMessageDialog(null, message,
                "Output", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
