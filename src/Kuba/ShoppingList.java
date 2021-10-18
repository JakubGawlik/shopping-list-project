package Kuba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingList implements ActionListener{

        DefaultListModel<String> shoppingList = new DefaultListModel<>();

        JFrame frame = new JFrame();
        JButton buttonAdd = new JButton("add item");
        JButton buttonDelete = new JButton("delete");
        JButton buttonClearAll = new JButton("clear all");
        JTextField textField = new JTextField();
        JLabel item = new JLabel("item");
        JLabel labelList = new JLabel("list");
        JList<String> list = new JList<>(shoppingList);

    public ShoppingList() {
        item.setBounds(35,20,100,25);
        textField.setBounds(100,20,200,25);
        buttonAdd.setBounds(315,20,80,25);
        buttonDelete.setBounds(315,75,80,25);
        buttonClearAll.setBounds(315,350,80,25);
        list.setBounds(100,75,200,300);
        labelList.setBounds(35,75,100,25);

        frame.add(item);
        frame.add(textField);
        frame.add(buttonAdd);
        frame.add(buttonDelete);
        frame.add(buttonClearAll);
        frame.add(list);
        frame.add(labelList);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonAdd.addActionListener(this);
        buttonClearAll.addActionListener(this);
        buttonDelete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== buttonClearAll){
            shoppingList.clear();
        }
        if (e.getSource()==buttonAdd){
            shoppingList.addElement(textField.getText());
        }if (e.getSource()==buttonDelete){
            shoppingList.remove(list.getSelectedIndex());
        }
    }
}
