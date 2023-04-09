/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.statify;

import javax.swing.JPanel;

/**
 *
 * @author mwewior
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        panelsSetDefault();
    }

    public final void panelsSetDefault() {
        timeButtonsPanel.setVisible(false);
        optionsPanel.setVisible(false);

        redPanel.setVisible(false);
        bluePanel.setVisible(false);

        planeBasePanel.setVisible(true);
        planeUpperPanel.setVisible(true);
    }

    public final void upperPanelDefault() {
        timeButtonsPanel.setVisible(false);
        optionsPanel.setVisible(false);
        planeUpperPanel.setVisible(true);
    }

    public void panelInit(JPanel panel) {

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 750, Short.MAX_VALUE));
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 422, Short.MAX_VALUE));
        actionPanel.add(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planeRoot = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        typeActionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chooseActionPanel = new javax.swing.JPanel();
        artistButton = new javax.swing.JButton();
        genreButton = new javax.swing.JButton();
        topTracksButton = new javax.swing.JButton();
        tracksAnaliseButton = new javax.swing.JButton();
        playlistAnaliseButton = new javax.swing.JButton();
        generatePlaylistButton = new javax.swing.JButton();
        bottomSidePanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        centrePanel = new javax.swing.JPanel();
        actionButtonsPanel = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        optionButton1 = new javax.swing.JButton();
        optionButton2 = new javax.swing.JButton();
        optionButton3 = new javax.swing.JButton();
        timeButtonsPanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        weeks4Button = new javax.swing.JButton();
        months6Button = new javax.swing.JButton();
        allTimeHistoryButton = new javax.swing.JButton();
        planeUpperPanel = new javax.swing.JPanel();
        actionPanel = new javax.swing.JPanel();
        redPanel = new javax.swing.JPanel();
        bluePanel = new javax.swing.JPanel();
        planeBasePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 430));

        planeRoot.setMaximumSize(new java.awt.Dimension(1980, 1080));
        planeRoot.setPreferredSize(new java.awt.Dimension(960, 540));
        planeRoot.setLayout(new java.awt.BorderLayout());

        sidePanel.setBackground(new java.awt.Color(44, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(210, 540));
        sidePanel.setLayout(new java.awt.BorderLayout());

        logoPanel.setBackground(new java.awt.Color(25, 20, 20));
        logoPanel.setPreferredSize(new java.awt.Dimension(210, 120));
        logoPanel.setLayout(new java.awt.BorderLayout());
        sidePanel.add(logoPanel, java.awt.BorderLayout.NORTH);

        typeActionPanel.setBackground(new java.awt.Color(44, 51, 51));
        typeActionPanel.setPreferredSize(new java.awt.Dimension(210, 220));
        typeActionPanel.setLayout(new javax.swing.BoxLayout(typeActionPanel, javax.swing.BoxLayout.PAGE_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(52, 235, 107));
        jScrollPane1.setBorder(null);

        chooseActionPanel.setBackground(new java.awt.Color(25, 20, 20));
        chooseActionPanel.setPreferredSize(new java.awt.Dimension(188, 440));

        artistButton.setBackground(new java.awt.Color(44, 51, 51));
        artistButton.setForeground(new java.awt.Color(255, 255, 255));
        artistButton.setText("artists");
        artistButton.setBorder(null);
        artistButton.setMaximumSize(new java.awt.Dimension(80, 24));
        artistButton.setMinimumSize(new java.awt.Dimension(80, 24));
        artistButton.setPreferredSize(new java.awt.Dimension(80, 24));
        artistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });

        genreButton.setBackground(new java.awt.Color(44, 51, 51));
        genreButton.setForeground(new java.awt.Color(255, 255, 255));
        genreButton.setText("genre");
        genreButton.setBorder(null);
        genreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreButtonActionPerformed(evt);
            }
        });

        topTracksButton.setBackground(new java.awt.Color(44, 51, 51));
        topTracksButton.setForeground(new java.awt.Color(255, 255, 255));
        topTracksButton.setText("top tracks");
        topTracksButton.setBorder(null);
        topTracksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topTracksButtonActionPerformed(evt);
            }
        });

        tracksAnaliseButton.setBackground(new java.awt.Color(44, 51, 51));
        tracksAnaliseButton.setForeground(new java.awt.Color(255, 255, 255));
        tracksAnaliseButton.setText("analise tracks");
        tracksAnaliseButton.setBorder(null);
        tracksAnaliseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracksAnaliseButtonActionPerformed(evt);
            }
        });

        playlistAnaliseButton.setBackground(new java.awt.Color(44, 51, 51));
        playlistAnaliseButton.setForeground(new java.awt.Color(255, 255, 255));
        playlistAnaliseButton.setText("analise playlist");
        playlistAnaliseButton.setBorder(null);
        playlistAnaliseButton.setMaximumSize(new java.awt.Dimension(80, 24));
        playlistAnaliseButton.setMinimumSize(new java.awt.Dimension(80, 24));
        playlistAnaliseButton.setPreferredSize(new java.awt.Dimension(80, 24));
        playlistAnaliseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistAnaliseButtonActionPerformed(evt);
            }
        });

        generatePlaylistButton.setBackground(new java.awt.Color(44, 51, 51));
        generatePlaylistButton.setForeground(new java.awt.Color(255, 255, 255));
        generatePlaylistButton.setText("generate playlist");
        generatePlaylistButton.setBorder(null);
        generatePlaylistButton.setMaximumSize(new java.awt.Dimension(80, 24));
        generatePlaylistButton.setMinimumSize(new java.awt.Dimension(80, 24));
        generatePlaylistButton.setPreferredSize(new java.awt.Dimension(80, 24));
        generatePlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePlaylistButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseActionPanelLayout = new javax.swing.GroupLayout(chooseActionPanel);
        chooseActionPanel.setLayout(chooseActionPanelLayout);
        chooseActionPanelLayout.setHorizontalGroup(
            chooseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chooseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playlistAnaliseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tracksAnaliseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(topTracksButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genreButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artistButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generatePlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        chooseActionPanelLayout.setVerticalGroup(
            chooseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(artistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(topTracksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tracksAnaliseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playlistAnaliseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generatePlaylistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(chooseActionPanel);

        typeActionPanel.add(jScrollPane1);

        bottomSidePanel.setBackground(new java.awt.Color(25, 20, 20));
        bottomSidePanel.setPreferredSize(new java.awt.Dimension(210, 100));

        javax.swing.GroupLayout bottomSidePanelLayout = new javax.swing.GroupLayout(bottomSidePanel);
        bottomSidePanel.setLayout(bottomSidePanelLayout);
        bottomSidePanelLayout.setHorizontalGroup(
            bottomSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        bottomSidePanelLayout.setVerticalGroup(
            bottomSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        typeActionPanel.add(bottomSidePanel);

        sidePanel.add(typeActionPanel, java.awt.BorderLayout.CENTER);

        planeRoot.add(sidePanel, java.awt.BorderLayout.WEST);

        mainPanel.setBackground(new java.awt.Color(46, 79, 79));
        mainPanel.setPreferredSize(new java.awt.Dimension(750, 540));
        mainPanel.setLayout(new java.awt.BorderLayout());

        centrePanel.setLayout(new java.awt.BorderLayout());

        actionButtonsPanel.setBackground(new java.awt.Color(4, 81, 4));
        actionButtonsPanel.setPreferredSize(new java.awt.Dimension(20, 120));
        actionButtonsPanel.setLayout(new java.awt.CardLayout());

        optionsPanel.setBackground(new java.awt.Color(29, 185, 84));
        optionsPanel.setPreferredSize(new java.awt.Dimension(20, 120));
        optionsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 45, 30));

        jTextField1.setBackground(new java.awt.Color(44, 51, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Amount of playlists");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        optionsPanel.add(jTextField1);

        optionButton1.setBackground(new java.awt.Color(44, 51, 51));
        optionButton1.setForeground(new java.awt.Color(255, 255, 255));
        optionButton1.setText("loudness");
        optionButton1.setToolTipText("");
        optionButton1.setPreferredSize(new java.awt.Dimension(108, 54));
        optionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton1ActionPerformed(evt);
            }
        });
        optionsPanel.add(optionButton1);

        optionButton2.setBackground(new java.awt.Color(44, 51, 51));
        optionButton2.setForeground(new java.awt.Color(255, 255, 255));
        optionButton2.setText("danceability");
        optionButton2.setPreferredSize(new java.awt.Dimension(108, 54));
        optionButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton2ActionPerformed(evt);
            }
        });
        optionsPanel.add(optionButton2);

        optionButton3.setBackground(new java.awt.Color(44, 51, 51));
        optionButton3.setForeground(new java.awt.Color(255, 255, 255));
        optionButton3.setText("acousticness");
        optionButton3.setPreferredSize(new java.awt.Dimension(120, 54));
        optionButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton3ActionPerformed(evt);
            }
        });
        optionsPanel.add(optionButton3);

        actionButtonsPanel.add(optionsPanel, "card2");

        timeButtonsPanel.setBackground(new java.awt.Color(29, 185, 84));
        timeButtonsPanel.setPreferredSize(new java.awt.Dimension(20, 120));
        timeButtonsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 40));

        jTextField2.setBackground(new java.awt.Color(44, 51, 51));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Amount of tracks");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        timeButtonsPanel.add(jTextField2);

        weeks4Button.setBackground(new java.awt.Color(44, 51, 51));
        weeks4Button.setForeground(new java.awt.Color(255, 255, 255));
        weeks4Button.setText("4 weeks");
        weeks4Button.setPreferredSize(new java.awt.Dimension(108, 54));
        weeks4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeks4ButtonActionPerformed(evt);
            }
        });
        timeButtonsPanel.add(weeks4Button);

        months6Button.setBackground(new java.awt.Color(44, 51, 51));
        months6Button.setForeground(new java.awt.Color(255, 255, 255));
        months6Button.setText("6 months");
        months6Button.setPreferredSize(new java.awt.Dimension(108, 54));
        months6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                months6ButtonActionPerformed(evt);
            }
        });
        timeButtonsPanel.add(months6Button);

        allTimeHistoryButton.setBackground(new java.awt.Color(44, 51, 51));
        allTimeHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        allTimeHistoryButton.setText("all-time");
        allTimeHistoryButton.setPreferredSize(new java.awt.Dimension(108, 54));
        allTimeHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTimeHistoryButtonActionPerformed(evt);
            }
        });
        timeButtonsPanel.add(allTimeHistoryButton);

        actionButtonsPanel.add(timeButtonsPanel, "card2");

        planeUpperPanel.setBackground(new java.awt.Color(29, 185, 84));

        javax.swing.GroupLayout planeUpperPanelLayout = new javax.swing.GroupLayout(planeUpperPanel);
        planeUpperPanel.setLayout(planeUpperPanelLayout);
        planeUpperPanelLayout.setHorizontalGroup(
            planeUpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        planeUpperPanelLayout.setVerticalGroup(
            planeUpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        actionButtonsPanel.add(planeUpperPanel, "card3");

        centrePanel.add(actionButtonsPanel, java.awt.BorderLayout.NORTH);

        actionPanel.setBackground(new java.awt.Color(46, 79, 79));
        actionPanel.setPreferredSize(new java.awt.Dimension(750, 420));
        actionPanel.setLayout(new java.awt.CardLayout());

        redPanel.setBackground(new java.awt.Color(29, 185, 84));

        javax.swing.GroupLayout redPanelLayout = new javax.swing.GroupLayout(redPanel);
        redPanel.setLayout(redPanelLayout);
        redPanelLayout.setHorizontalGroup(
            redPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        redPanelLayout.setVerticalGroup(
            redPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        actionPanel.add(redPanel, "card2");

        bluePanel.setBackground(new java.awt.Color(29, 185, 84));

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        actionPanel.add(bluePanel, "card1");

        planeBasePanel.setBackground(new java.awt.Color(29, 185, 84));

        javax.swing.GroupLayout planeBasePanelLayout = new javax.swing.GroupLayout(planeBasePanel);
        planeBasePanel.setLayout(planeBasePanelLayout);
        planeBasePanelLayout.setHorizontalGroup(
            planeBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        planeBasePanelLayout.setVerticalGroup(
            planeBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        actionPanel.add(planeBasePanel, "card0");

        centrePanel.add(actionPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(centrePanel, java.awt.BorderLayout.CENTER);

        planeRoot.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(planeRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void optionButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionButton1ActionPerformed
        String playlists_num = jTextField1.getText();
        try{
            int plNum = Integer.parseInt(playlists_num);
            if(plNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of playlists");
            }
            else{
                Statify.SetPlaylistsNum(plNum);
                upperPanelDefault();
                JPanel histo = Statify.getLoudnessHistogram();
                panelInit(histo);
                histo.setVisible(true);
                optionsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
    }// GEN-LAST:event_optionButton1ActionPerformed

    private void optionButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionButton2ActionPerformed
        String playlists_num = jTextField1.getText();
        try{
            int plNum = Integer.parseInt(playlists_num);
            if(plNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of playlists");
            }
            else{
                Statify.SetPlaylistsNum(plNum);
                upperPanelDefault();
                JPanel histo = Statify.getDanceabilityHistogram();
                panelInit(histo);
                histo.setVisible(true);
                optionsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
        // trzeba to jesszcze jakoś wyłączyć potem

    }// GEN-LAST:event_optionButton2ActionPerformed

    private void optionButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionButton3ActionPerformed
        String playlists_num = jTextField1.getText();
        try{
            int plNum = Integer.parseInt(playlists_num);
            if(plNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of playlists");
            }
            else{
                Statify.SetPlaylistsNum(plNum);
                upperPanelDefault();
                JPanel histo = Statify.getAcousticnessHistogram();
                panelInit(histo);
                histo.setVisible(true);
                optionsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
    }// GEN-LAST:event_optionButton3ActionPerformed

    private void weeks4ButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_weeks4ButtonActionPerformed
        String track_num = jTextField2.getText();
        try{
            int trNum = Integer.parseInt(track_num);
            if(trNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of tracks");
            }
            else{
                upperPanelDefault();
                javax.swing.JScrollPane histo = Statify.createTopTracksPanel(trNum, "short_term");
                //panelInit(histo);
                System.out.print("tutaj");
                actionPanel.add(histo);
                histo.setVisible(true);
                timeButtonsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
    }// GEN-LAST:event_weeks4ButtonActionPerformed

    private void months6ButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_months6ButtonActionPerformed
        String track_num = jTextField2.getText();
        try{
            int trNum = Integer.parseInt(track_num);
            if(trNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of tracks");
            }
            else{
                upperPanelDefault();
                javax.swing.JScrollPane histo = Statify.createTopTracksPanel(trNum, "medium_term");
                //panelInit(histo);
                System.out.print("tutaj");
                actionPanel.add(histo);
                histo.setVisible(true);
                timeButtonsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
    }// GEN-LAST:event_months6ButtonActionPerformed

    private void allTimeHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_allTimeHistoryButtonActionPerformed
        String track_num = jTextField2.getText();
        try{
            int trNum = Integer.parseInt(track_num);
            if(trNum <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid amount of tracks");
            }
            else{
                upperPanelDefault();
                javax.swing.JScrollPane histo = Statify.createTopTracksPanel(trNum, "long_term");
                //panelInit(histo);
                System.out.print("tutaj");
                actionPanel.add(histo);
                histo.setVisible(true);
                timeButtonsPanel.setVisible(true);
            }
        } catch(NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");
        } catch(NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Amount of playlists has to be a whole number");

        }
    }// GEN-LAST:event_allTimeHistoryButtonActionPerformed

    private void artistButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_artistButtonActionPerformed
        panelsSetDefault();
        timeButtonsPanel.setVisible(true);
        //bluePanel.setVisible(true);
    }// GEN-LAST:event_artistButtonActionPerformed

    private void genreButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_genreButtonActionPerformed
        panelsSetDefault();
        timeButtonsPanel.setVisible(true);
        //redPanel.setVisible(true);
    }// GEN-LAST:event_genreButtonActionPerformed

    private void topTracksButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_topTracksButtonActionPerformed
        panelsSetDefault();
        timeButtonsPanel.setVisible(true);
    }// GEN-LAST:event_topTracksButtonActionPerformed

    private void tracksAnaliseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tracksAnaliseButtonActionPerformed
        panelsSetDefault();
        optionsPanel.setVisible(true);
        //bluePanel.setVisible(true);
    }// GEN-LAST:event_tracksAnaliseButtonActionPerformed

    private void playlistAnaliseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_playlistAnaliseButtonActionPerformed
        panelsSetDefault();
        optionsPanel.setVisible(true);
    }// GEN-LAST:event_playlistAnaliseButtonActionPerformed

    private void generatePlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_generatePlaylistButtonActionPerformed
        panelsSetDefault();
        optionsPanel.setVisible(true);
    }// GEN-LAST:event_generatePlaylistButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionButtonsPanel;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton allTimeHistoryButton;
    private javax.swing.JButton artistButton;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JPanel bottomSidePanel;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JPanel chooseActionPanel;
    private javax.swing.JButton generatePlaylistButton;
    private javax.swing.JButton genreButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton months6Button;
    private javax.swing.JButton optionButton1;
    private javax.swing.JButton optionButton2;
    private javax.swing.JButton optionButton3;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel planeBasePanel;
    private javax.swing.JPanel planeRoot;
    private javax.swing.JPanel planeUpperPanel;
    private javax.swing.JButton playlistAnaliseButton;
    private javax.swing.JPanel redPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel timeButtonsPanel;
    private javax.swing.JButton topTracksButton;
    private javax.swing.JButton tracksAnaliseButton;
    private javax.swing.JPanel typeActionPanel;
    private javax.swing.JButton weeks4Button;
    // End of variables declaration//GEN-END:variables
}
