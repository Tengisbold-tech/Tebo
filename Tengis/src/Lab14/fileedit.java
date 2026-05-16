package Lab14;

import javax.swing.*;
import java.io.*;

public class fileedit {

    JFrame f = new JFrame();

    JTextArea textArea;

    public fileedit() {

        f.setTitle("Text Editor");
        f.setSize(750, 550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        textArea = new JTextArea();

        JScrollPane sp = new JScrollPane(textArea);
        sp.setBounds(10, 10, 710, 400);

        f.add(sp);

        JButton clearBtn = new JButton("Clear");
        JButton saveBtn = new JButton("Save");
        JButton openBtn = new JButton("Open");

        clearBtn.setBounds(10, 420, 80, 40);
        openBtn.setBounds(100, 420, 80, 40);
        saveBtn.setBounds(190, 420, 80, 40);

        f.add(clearBtn);
        f.add(openBtn);
        f.add(saveBtn);

        clearBtn.addActionListener(e -> {
            textArea.setText("");
        });

        saveBtn.addActionListener(e -> {

            JFileChooser chooser = new JFileChooser();

            int result = chooser.showSaveDialog(f);

            if (result == JFileChooser.APPROVE_OPTION) {

                File file = chooser.getSelectedFile();

                printfile(file.getAbsolutePath());
            }
        });


        openBtn.addActionListener(e -> {

            JFileChooser chooser = new JFileChooser();

            int result = chooser.showOpenDialog(f);

            if (result == JFileChooser.APPROVE_OPTION) {

                File file = chooser.getSelectedFile();

                String data = readfile(file.getAbsolutePath());

                textArea.setText(data);
            }
        });

        f.setVisible(true);
    }

    public void printfile(String fname) {

        try {

            FileWriter fw = new FileWriter(fname);

            fw.write(textArea.getText());

            fw.close();

            JOptionPane.showMessageDialog(f,
                    "File saved successfully!");

        } catch (IOException e) {

            JOptionPane.showMessageDialog(f,
                    "Error while saving file!");
        }
    }

    public String readfile(String fname) {

        String data = "";

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader(fname));

            String line;

            while ((line = br.readLine()) != null) {

                data += line + "\n";
            }

            br.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(f,
                    "Error while opening file!");
        }

        return data;
    }

    public static void main(String[] args) {

        new fileedit();
    }
}