package Memento;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HistoryWindow {
    private Controller controller;
    private JFrame frame;
    private JList<String> historyList;
    private DefaultListModel<String> listModel;

    public HistoryWindow(Controller controller) {
        this.controller = controller;
        this.frame = new JFrame("History");
        this.listModel = new DefaultListModel<>();
        this.historyList = new JList<>(listModel);
        setupUI();
    }

    private void setupUI() {
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        historyList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = historyList.getSelectedIndex();
                controller.restoreStateFromHistory(selectedIndex);
            }
        });

        frame.add(new JScrollPane(historyList));
        frame.setVisible(true);
    }

    public void updateHistoryList(List<IMemento> history) {
        listModel.clear();
        for (int i = 0; i < history.size(); i++) {
            listModel.addElement("State " + i); // Customize to show more details if available
        }
    }
}
