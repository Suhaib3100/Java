import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingApp extends JFrame {
    private DefaultListModel<String> itemListModel;
    private JList<String> itemList;
    private JTextArea cartTextArea;
    private JTextField nameField;
    private JTextField priceField;
    private Cart cart;

    public ShoppingApp() {
        cart = new Cart();
        setTitle("Shopping Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        itemListModel = new DefaultListModel<>();
        itemList = new JList<>(itemListModel);
        JScrollPane itemScrollPane = new JScrollPane(itemList);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Item Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Item Price:"));
        priceField = new JTextField();
        inputPanel.add(priceField);
        JButton addButton = new JButton("Add Item");
        inputPanel.add(addButton);

        cartTextArea = new JTextArea();
        cartTextArea.setEditable(false);
        JScrollPane cartScrollPane = new JScrollPane(cartTextArea);

        JPanel buttonPanel = new JPanel();
        JButton viewCartButton = new JButton("View Cart");
        JButton checkoutButton = new JButton("Checkout");
        buttonPanel.add(viewCartButton);
        buttonPanel.add(checkoutButton);

        add(itemScrollPane, BorderLayout.WEST);
        add(inputPanel, BorderLayout.NORTH);
        add(cartScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String priceText = priceField.getText();
                try {
                    double price = Double.parseDouble(priceText);
                    Item item = new Item(name, price);
                    cart.addItem(item);
                    itemListModel.addElement(item.toString());
                    nameField.setText("");
                    priceField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ShoppingApp.this, "Invalid price. Please enter a valid number.");
                }
            }
        });

        viewCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartTextArea.setText(cart.viewCart());
            }
        });

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartTextArea.setText(cart.checkout());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShoppingApp().setVisible(true);
            }
        });
    }
}
