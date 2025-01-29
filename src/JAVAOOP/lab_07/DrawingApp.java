package JAVAOOP.lab_07;

import java.util.Arrays;

//Abstract class UIControl
abstract class UIControl {
    public abstract void draw();
    public abstract void handleEvent(String event);
    public abstract String getName();
}

//Button class
class Button extends UIControl {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button with label \"" + label + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("click")) {
            System.out.println("Button \"" + label + "\" clicked.");
        }
    }

    @Override
    public String getName() {
        return "Button";
    }
}

//TextBox class
class TextBox extends UIControl {
    private String text = "";

    @Override
    public void draw() {
        System.out.println("Drawing TextBox with current text \"" + text + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("textChange")) {
            text = "User input";
            System.out.println("TextBox updated to: " + text);
        }
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

//ColorPicker class
class ColorPicker extends UIControl {
    private String selectedColor = "Black";

    @Override
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color \"" + selectedColor + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("colorSelected")) {
            selectedColor = "Red";
            System.out.println("ColorPicker color changed to: " + selectedColor);
        }
    }

    @Override
    public String getName() {
        return "ColorPicker";
    }
}

//UIPanel class
class UIPanel {
    private UIControl[] controls;

    public UIPanel(UIControl[] controls) {
        this.controls = controls;
    }

    public void drawAll() {
        Arrays.stream(controls).forEach(UIControl::draw);
    }
}

//Main class
public class DrawingApp {
    public static void main(String[] args) {
        UIControl[] controls = {
            new Button("Draw"),
            new TextBox(),
            new ColorPicker()
        };

        UIPanel panel = new UIPanel(controls);
        panel.drawAll();
    }
}
