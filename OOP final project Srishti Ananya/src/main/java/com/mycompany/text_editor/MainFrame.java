/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.text_editor;

/**
 *
 * @author sushilkumar
 * 
 */
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    String filename;
    Clipboard clipboard= getToolkit().getSystemClipboard();
    
    
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        bold = new javax.swing.JButton();
        underline = new javax.swing.JButton();
        italics = new javax.swing.JButton();
        fonttype = new javax.swing.JComboBox<>();
        fontsize = new javax.swing.JSpinner();
        count = new javax.swing.JButton();
        changecase = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        Sketchpad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jToolBar4 = new javax.swing.JToolBar();
        rectangle = new javax.swing.JButton();
        line = new javax.swing.JButton();
        oval = new javax.swing.JButton();
        triiangle = new javax.swing.JButton();
        pentagon = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JToolBar();
        replaceall = new javax.swing.JToggleButton();
        replace = new javax.swing.JButton();
        find = new javax.swing.JButton();
        findtextarea = new javax.swing.JTextField();
        findall = new javax.swing.JToggleButton();
        clearhighlight = new javax.swing.JToggleButton();
        replacetextarea = new javax.swing.JTextField();
        shapepad = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        cutFile = new javax.swing.JMenuItem();
        copyFile = new javax.swing.JMenuItem();
        pasteFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setRollover(true);

        bold.setBackground(new java.awt.Color(204, 255, 255));
        bold.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        bold.setForeground(new java.awt.Color(51, 51, 51));
        bold.setText("B");
        bold.setBorder(null);
        bold.setFocusable(false);
        bold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bold.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });
        jToolBar2.add(bold);

        underline.setBackground(new java.awt.Color(204, 255, 255));
        underline.setForeground(new java.awt.Color(51, 51, 51));
        underline.setText("U");
        underline.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        underline.setFocusable(false);
        underline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        underline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        underline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineActionPerformed(evt);
            }
        });
        jToolBar2.add(underline);

        italics.setBackground(new java.awt.Color(204, 255, 255));
        italics.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        italics.setForeground(new java.awt.Color(51, 51, 51));
        italics.setText("I");
        italics.setFocusable(false);
        italics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        italics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        italics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicsActionPerformed(evt);
            }
        });
        jToolBar2.add(italics);

        fonttype.setBackground(new java.awt.Color(204, 204, 204));
        fonttype.setForeground(new java.awt.Color(51, 51, 51));
        fonttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Georgia", "helvetica", "Times New Roman" }));
        fonttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonttypeActionPerformed(evt);
            }
        });
        jToolBar2.add(fonttype);

        fontsize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fontsizeStateChanged(evt);
            }
        });
        jToolBar2.add(fontsize);

        count.setBackground(new java.awt.Color(204, 255, 255));
        count.setForeground(new java.awt.Color(51, 51, 51));
        count.setText("Count");
        count.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        count.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        jToolBar2.add(count);

        changecase.setBackground(new java.awt.Color(204, 255, 255));
        changecase.setForeground(new java.awt.Color(51, 51, 51));
        changecase.setText("Changecase");
        changecase.setFocusable(false);
        changecase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changecase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changecase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changecaseActionPerformed(evt);
            }
        });
        jToolBar2.add(changecase);

        clearall.setBackground(new java.awt.Color(204, 255, 255));
        clearall.setForeground(new java.awt.Color(51, 51, 51));
        clearall.setText("Clear All");
        clearall.setFocusable(false);
        clearall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallActionPerformed(evt);
            }
        });
        jToolBar2.add(clearall);

        Sketchpad.setBackground(new java.awt.Color(102, 102, 102));
        Sketchpad.setForeground(new java.awt.Color(255, 255, 255));
        Sketchpad.setText("Sketch Pad");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter the word to find and click find button to find the word and enter the word to replace and click replace button to replace the found word");

        jDesktopPane1.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Sketchpad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(Sketchpad, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sketchpad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        textArea.setBackground(new java.awt.Color(255, 255, 255));
        textArea.setColumns(20);
        textArea.setForeground(new java.awt.Color(51, 51, 51));
        textArea.setRows(5);
        textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jScrollPane1.setViewportView(textArea);

        jToolBar4.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar4.setForeground(new java.awt.Color(51, 51, 51));
        jToolBar4.setRollover(true);

        rectangle.setBackground(new java.awt.Color(204, 255, 255));
        rectangle.setForeground(new java.awt.Color(51, 51, 51));
        rectangle.setText("Rectangle");
        rectangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rectangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        jToolBar4.add(rectangle);

        line.setBackground(new java.awt.Color(204, 255, 255));
        line.setForeground(new java.awt.Color(51, 51, 51));
        line.setText("Line");
        line.setFocusable(false);
        line.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        line.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(line);

        oval.setBackground(new java.awt.Color(204, 255, 255));
        oval.setForeground(new java.awt.Color(51, 51, 51));
        oval.setText("Oval");
        oval.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oval.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(oval);

        triiangle.setBackground(new java.awt.Color(204, 255, 255));
        triiangle.setForeground(new java.awt.Color(51, 51, 51));
        triiangle.setText("Triangle");
        triiangle.setFocusable(false);
        triiangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        triiangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(triiangle);

        pentagon.setBackground(new java.awt.Color(204, 255, 255));
        pentagon.setForeground(new java.awt.Color(51, 51, 51));
        pentagon.setText("Pentagon");
        pentagon.setFocusable(false);
        pentagon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pentagon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(pentagon);

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setForeground(new java.awt.Color(51, 51, 51));
        clear.setText("Clear");
        clear.setFocusable(false);
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(clear);

        lb1.setText("Character Count:");

        lb2.setText("Word Count:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        jLabel1.setText("Select text and click count button to see the Character and Word count");

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setForeground(new java.awt.Color(51, 51, 51));
        Menu.setRollover(true);

        replaceall.setBackground(new java.awt.Color(204, 255, 255));
        replaceall.setForeground(new java.awt.Color(51, 51, 51));
        replaceall.setText("Replace All");
        replaceall.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        replaceall.setFocusable(false);
        replaceall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        replaceall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        replaceall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceallActionPerformed(evt);
            }
        });
        Menu.add(replaceall);

        replace.setBackground(new java.awt.Color(204, 255, 255));
        replace.setForeground(new java.awt.Color(51, 51, 51));
        replace.setText("Replace");
        replace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        replace.setFocusable(false);
        replace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        replace.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        Menu.add(replace);

        find.setBackground(new java.awt.Color(204, 255, 255));
        find.setForeground(new java.awt.Color(51, 51, 51));
        find.setText("Find");
        find.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        find.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        find.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        findtextarea.setBackground(new java.awt.Color(204, 204, 204));
        findtextarea.setForeground(new java.awt.Color(51, 51, 51));
        findtextarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        findtextarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findtextareaActionPerformed(evt);
            }
        });

        findall.setBackground(new java.awt.Color(204, 255, 255));
        findall.setForeground(new java.awt.Color(51, 51, 51));
        findall.setText("Find All");
        findall.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        findall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        findall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findallActionPerformed(evt);
            }
        });

        clearhighlight.setBackground(new java.awt.Color(204, 255, 255));
        clearhighlight.setForeground(new java.awt.Color(51, 51, 51));
        clearhighlight.setText("Clear Highlight");
        clearhighlight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearhighlight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearhighlight.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearhighlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearhighlightActionPerformed(evt);
            }
        });

        replacetextarea.setBackground(new java.awt.Color(204, 204, 204));
        replacetextarea.setForeground(new java.awt.Color(51, 51, 51));
        replacetextarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replacetextareaActionPerformed(evt);
            }
        });

        shapepad.setBackground(new java.awt.Color(204, 204, 204));
        shapepad.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout shapepadLayout = new javax.swing.GroupLayout(shapepad);
        shapepad.setLayout(shapepadLayout);
        shapepadLayout.setHorizontalGroup(
            shapepadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shapepadLayout.setVerticalGroup(
            shapepadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuBar.setBackground(new java.awt.Color(204, 204, 204));
        MenuBar.setForeground(new java.awt.Color(51, 51, 51));

        File.setText("File");

        newFile.setText("New ");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        File.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        File.add(openFile);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        File.add(saveFile);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        File.add(exitFile);

        MenuBar.add(File);

        Edit.setText("Edit");

        cutFile.setText("Cut");
        cutFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutFileActionPerformed(evt);
            }
        });
        Edit.add(cutFile);

        copyFile.setText("Copy");
        copyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyFileActionPerformed(evt);
            }
        });
        Edit.add(copyFile);

        pasteFile.setText("Paste");
        pasteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteFileActionPerformed(evt);
            }
        });
        Edit.add(pasteFile);

        MenuBar.add(Edit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb2)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(findall)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(find)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(findtextarea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearhighlight)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(replacetextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                    .addComponent(shapepad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(replacetextarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(find)
                            .addComponent(findtextarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findall)
                            .addComponent(clearhighlight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                    .addComponent(shapepad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lb2)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   int currentposition=0;
    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
        // TODO add your handling code here:
        textArea.setFont(textArea.getFont().deriveFont(Font.BOLD, 14f));
    }//GEN-LAST:event_boldActionPerformed

    private void fonttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonttypeActionPerformed
        textArea.setFont(new Font((String)fonttype.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
    }//GEN-LAST:event_fonttypeActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        
        FileDialog filedialog= new FileDialog(MainFrame.this,"Open File",FileDialog.LOAD);
        filedialog.setVisible(true);
        if(filedialog.getFile()!= null){
            filename= filedialog.getDirectory()+ filedialog.getFile();
        setTitle(filename);
        }
        try
        {
            BufferedReader br= new BufferedReader(new FileReader(filename));
            StringBuilder sb= new StringBuilder();
            String line = null;
            while((line= br.readLine())!=null)
            {
                sb.append(line+"\n");
                textArea.setText(sb.toString());
                
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("File not Found");
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
       FileDialog filedialog= new FileDialog(MainFrame.this,"Save File",FileDialog.SAVE);
        filedialog.setVisible(true);
          if(filedialog.getFile()!= null){
            filename= filedialog.getDirectory()+ filedialog.getFile();
        setTitle(filename);
        }
          try
          {
              FileWriter filewriter= new FileWriter(filename);
              filewriter.write(textArea.getText());
              setTitle(filename);
              filewriter.close();
          }
        catch(IOException e)
        {
            System.out.println("File not Found");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileActionPerformed

    private void cutFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutFileActionPerformed
       String cutString= textArea.getSelectedText();
       StringSelection cutSelection = new StringSelection(cutString);
       clipboard.setContents(cutSelection,cutSelection);
       textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
       
    }//GEN-LAST:event_cutFileActionPerformed

    private void copyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyFileActionPerformed
        String copyString= textArea.getSelectedText();
       StringSelection copySelection = new StringSelection(copyString);
       clipboard.setContents(copySelection,copySelection);
    }//GEN-LAST:event_copyFileActionPerformed

    private void pasteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteFileActionPerformed
        try
        {
            Transferable pasteText= clipboard.getContents(MainFrame.this);
            String sel = (String)pasteText.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
        }
        catch(Exception e)
        {
            System.out.println("Sorry Did'nt work!");
        }
    }//GEN-LAST:event_pasteFileActionPerformed

    private void italicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicsActionPerformed
       
        textArea.setFont(textArea.getFont().deriveFont(Font.ITALIC, 14f));
       
    }//GEN-LAST:event_italicsActionPerformed

    private void underlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineActionPerformed
        
        Font font = textArea.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
         attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
           textArea.setFont( font.deriveFont(attributes)); 
    }//GEN-LAST:event_underlineActionPerformed

    private void changecaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changecaseActionPerformed
        // TODO add your handling code here:
        String str;
       str= textArea.getText().toUpperCase();
       textArea.setText(str); 
    }//GEN-LAST:event_changecaseActionPerformed

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed

        String text=textArea.getSelectedText();
            lb1.setText("Character Count: "+text.length());
            String words[]=text.split("\\s");
            lb2.setText("Word Count: "+words.length);
    }//GEN-LAST:event_countActionPerformed

    private void clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearallActionPerformed
        textArea.setText("");
    }//GEN-LAST:event_clearallActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed

        String findfromtext= textArea.getText();
        String findthistext= findtextarea.getText();
        int index= findfromtext.indexOf(findthistext, currentposition);
        
        int length= findthistext.length();
        Highlighter h= textArea.getHighlighter();
        h.removeAllHighlights();
        try{
            h.addHighlight(index, index+length,new DefaultHighlighter.DefaultHighlightPainter(Color.yellow));
        }
        catch(BadLocationException e)
            {
                    
             }
        currentposition= index+length;
        if(currentposition>findfromtext.length())
        {
            currentposition=0;
        }
             if(findfromtext.indexOf(findthistext, currentposition)==-1) 
             {
                 currentposition=0;
             }
       
    }//GEN-LAST:event_findActionPerformed

    private void clearhighlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearhighlightActionPerformed
         Highlighter h= textArea.getHighlighter();
        h.removeAllHighlights();
    }//GEN-LAST:event_clearhighlightActionPerformed

    private void findtextareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findtextareaActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_findtextareaActionPerformed

    private void replacetextareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replacetextareaActionPerformed
       
    }//GEN-LAST:event_replacetextareaActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        String findfromtext= textArea.getText();
        String findthistext= findtextarea.getText();
        String replacetext= replacetextarea.getText();
       textArea.setText(findfromtext.replaceFirst(findthistext, replacetext));
        currentposition=0;
    }//GEN-LAST:event_replaceActionPerformed

    private void replaceallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceallActionPerformed
        String findfromtext= textArea.getText();
        String findthistext= findtextarea.getText();
        String replacetext= replacetextarea.getText();
       textArea.setText(findfromtext.replaceAll(findthistext, replacetext));
        currentposition=0;
    }//GEN-LAST:event_replaceallActionPerformed

    private void findallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findallActionPerformed
      String findfromtext= textArea.getText();
        String findthistext= findtextarea.getText();
        Highlighter h= textArea.getHighlighter();
       h.removeAllHighlights();
        while(findfromtext.indexOf(findthistext, currentposition)!=-1){
        int index= findfromtext.indexOf(findthistext, currentposition);
        
        int length= findthistext.length();
        
        
        try{
            h.addHighlight(index, index+length,new DefaultHighlighter.DefaultHighlightPainter(Color.yellow));
        }
        catch(BadLocationException e)
            {
                    
             }
        currentposition= index+length;
        
        }
        if(currentposition>findfromtext.length())
        {
            currentposition=0;
        }
             if(findfromtext.indexOf(findthistext, currentposition)==-1) 
             {
                 currentposition=0;
             }
    }//GEN-LAST:event_findallActionPerformed

    private void fontsizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fontsizeStateChanged
        // TODO add your handling code here:
        
        textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int) fontsize.getValue()));
    }//GEN-LAST:event_fontsizeStateChanged

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_rectangleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JToolBar Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel Sketchpad;
    private javax.swing.JButton bold;
    private javax.swing.JButton changecase;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearall;
    private javax.swing.JToggleButton clearhighlight;
    private javax.swing.JMenuItem copyFile;
    private javax.swing.JButton count;
    private javax.swing.JMenuItem cutFile;
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JButton find;
    private javax.swing.JToggleButton findall;
    private javax.swing.JTextField findtextarea;
    private javax.swing.JSpinner fontsize;
    private javax.swing.JComboBox<String> fonttype;
    private javax.swing.JButton italics;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JButton line;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JButton oval;
    private javax.swing.JMenuItem pasteFile;
    private javax.swing.JButton pentagon;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton replace;
    private javax.swing.JToggleButton replaceall;
    private javax.swing.JTextField replacetextarea;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JPanel shapepad;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton triiangle;
    private javax.swing.JButton underline;
    // End of variables declaration//GEN-END:variables
}
