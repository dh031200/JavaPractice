import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MovieListFrame extends JFrame {
    private JList listBox;
    private JTextArea movieInfo;

    public MovieListFrame() {
        setTitle("Movie List - 2015270434 김동훈");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Movie[] list = new Movie[5];
        list[0] = new Movie("lala", 2016, 4.5);
        list[1] = new Movie("find me", 2017, 3.0);
        list[2] = new Movie("frozen", 2014, 4.5);
        list[3] = new Movie("endgame", 2019, 4.7);
        list[4] = new Movie("aladdin", 2019, 4.7);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        listBox = new JList(list);
        listBox.addListSelectionListener(new MovieListListener());
        panel.add(listBox);

        movieInfo = new JTextArea(6,30);
        movieInfo.setEditable(false);
        movieInfo.setLineWrap(true);
        movieInfo.setBackground(Color.LIGHT_GRAY);
        movieInfo.setText("영화를 선택");
        panel.add(movieInfo);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(panel);
        pack();
    }

    private class MovieListListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                Movie movie = (Movie) listBox.getSelectedValue();
                movieInfo.setText(movie.getInformation());
            }
        }
    }
}
