import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {
    private ArrayList<Movie> movieList;
    private JTextField title, year, grade;
    private JTextArea textArea;

    public MyFrame(){
        setSize(330,330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Movie List");

        movieList = new ArrayList<>();

        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        cPane.add(new JLabel("영화제목"));
        title = new JTextField(20);
        cPane.add(title);
        cPane.add(new JLabel("개봉 연도"));
        year = new JTextField(20);
        cPane.add(year);
        cPane.add(new JLabel("영화 평점"));
        grade = new JTextField(20);
        cPane.add(grade);

        JButton register = new JButton("영화 등록");
        cPane.add(register);
        JButton search = new JButton("영화 검색");
        cPane.add(search);

        textArea = new JTextArea(8,25);
        textArea.setEditable(false);
        cPane.add(textArea);

        register.addActionListener(this);
        search.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (year.getText().trim().equals(""))
                    return;
                String result = "";
                int inYear = Integer.parseInt(year.getText().trim());
                for (Movie m: movieList){
                    if(inYear == m.getReleaseYear())
                        result += m.toString() + "\n";
                }
                textArea.setText(result);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        int inYear = Integer.parseInt(this.year.getText().trim());
        double inGrade = Double.parseDouble(this.grade.getText().trim());
        movieList.add(new Movie(title.getText().trim(), inYear,inGrade));

        String result = "";
        for (Movie m : movieList)
            result += m.toString() + "\n";
        textArea.setText(result);
        title.setText("");
        year.setText("");
        grade.setText("");
    }
}
