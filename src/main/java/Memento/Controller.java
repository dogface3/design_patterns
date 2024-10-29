package Memento;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history;
    private List<IMemento> redoHistory;
    private HistoryWindow historyWindow;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
        this.historyWindow = new HistoryWindow(this);
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        clearRedoHistory();
        historyWindow.updateHistoryList(history);
        gui.updateGui();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        clearRedoHistory();
        historyWindow.updateHistoryList(history);
        gui.updateGui();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    // Undo functionality
    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            redoHistory.add(model.createMemento()); // Save current state for redo
            model.restoreState(previousState);
            historyWindow.updateHistoryList(history); // Update history window
            gui.updateGui();
        }
    }

    // Redo functionality
    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Redoing last undone action");
            saveToHistory(); // Save current state to history for future undo
            IMemento redoState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(redoState);
            historyWindow.updateHistoryList(history); // Update history window
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    private void clearRedoHistory() {
        redoHistory.clear();
    }

    public void restoreStateFromHistory(int index) {
        if (index >= 0 && index < history.size()) {
            saveToHistory(); // Save current state for undo
            model.restoreState(history.get(index));
            clearRedoHistory(); // Clear redo history after direct state restoration
            gui.updateGui();
        }
    }
}
