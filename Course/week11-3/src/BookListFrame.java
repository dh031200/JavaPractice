import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class BookListFrame extends JFrame {
    private JList listBox;
    private JTextArea bookInfo;

    public BookListFrame(){
        setTitle("BookList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Book[] list = new Book[3];
        list[0] = new Book("숲","저자1",20000);
        list[1] = new Book("스토너","저자2",15000);
        list[2] = new Book("자바프로그래밍","저자3",30000);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        listBox = new JList(list);
        BookListListener bookListListener = new BookListListener();
        listBox.addListSelectionListener(bookListListener);
        panel.add(listBox);

        bookInfo= new JTextArea(6,20);
        bookInfo.setEditable(false);
        bookInfo.setLineWrap(true);
        bookInfo.setBackground(Color.LIGHT_GRAY);
        bookInfo.setText("도서를 선택");
        panel.add(bookInfo);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(panel);
        pack();
    }

    private class BookListListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(e.getValueIsAdjusting()== false){
                Book book = (Book) listBox.getSelectedValue();
                bookInfo.setText((book.getFullInfo()));
            }
        }
    }
}
