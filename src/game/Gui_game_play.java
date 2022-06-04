package game;

import game.type.pieces;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Gui_game_play extends javax.swing.JFrame {

    /**
     * Creates new form Gui_game_play
     */
    private Gui_Main_Menu MainMenu;
    private game_engine engine;
    private boolean IsGameRunning;
    private int curr_score;
    private Component frame = null;
    private int gamecount;
    private String color;

    public Gui_game_play(game_engine engine) {
    	setSize(957,575);
    	setBackground(Color.BLACK);
    	getContentPane().setBackground(new Color(144, 238, 144));
    	setResizable(false);
        color = "NONE";
        initComponents();
        this.engine = engine;
        MainMenu = new Gui_Main_Menu(this.engine, this);
        MainMenu.setVisible(true);
        IsGameRunning = false;
        engine.set_IsPlayer1Turn(false);
        gamecount = 0;
        if (ChoosePieceType.getSelectedItem().toString().equalsIgnoreCase("X")) {
            engine.player2.set_piece_type(pieces.X);
            engine.player1.set_piece_type(pieces.O);
        } else {
            engine.player2.set_piece_type(pieces.O);
            engine.player1.set_piece_type(pieces.X);
        }
        if (engine.get_IsPlayer1Turn()) {
            CurrentTurn.setText("Opponent's");
            CurrentTurn.setForeground(new java.awt.Color(240, 84, 84));
        } else {
            CurrentTurn.setText("Your's");
            CurrentTurn.setForeground(new java.awt.Color(51, 111, 44));
        }
        
        
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 0, 98, 99);
        x0_y0 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(98, 0, 98, 98);
        x0_y1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBounds(196, 0, 98, 98);
        x0_y2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel5.setBounds(0, 99, 98, 98);
        x1_y0 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel6.setBounds(0, 197, 98, 98);
        x2_y0 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel7.setBounds(98, 99, 98, 98);
        x1_y1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel8.setBounds(196, 99, 122, 98);
        jPanel9 = new javax.swing.JPanel();
        x1_y2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel10.setBounds(98, 197, 98, 98);
        x2_y1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel11.setBounds(196, 197, 98, 98);
        x2_y2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel12.setBackground(new Color(152, 251, 152));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(558, 44, 0, 0);
        CURR_TURN_label = new javax.swing.JLabel();
        CURR_TURN_label.setBounds(86, 18, 254, 52);
        CurrentTurn = new javax.swing.JLabel();
        CurrentTurn.setBounds(347, 25, 202, 38);
        jPanel13 = new javax.swing.JPanel();
        jPanel13.setBackground(new Color(152, 251, 152));
        ResetGame = new javax.swing.JButton();
        ResetGame.setBackground(new Color(250, 250, 210));
        ResetGame.setBounds(41, 203, 176, 59);
        MoveSuggestion = new javax.swing.JButton();
        MoveSuggestion.setBounds(41, 280, 176, 59);
        ChoosePieceType = new javax.swing.JComboBox();
        ChoosePieceType.setBounds(155, 10, 95, 45);
        CHOOSE_label = new javax.swing.JLabel();
        CHOOSE_label.setBounds(26, 14, 117, 45);
        CHOOSE_label.setHorizontalAlignment(SwingConstants.RIGHT);
        StartGame = new javax.swing.JButton();
        StartGame.setBackground(new Color(250, 250, 210));
        StartGame.setBounds(41, 126, 176, 59);
        BackToMainMenu = new javax.swing.JButton();
        BackToMainMenu.setBackground(new Color(250, 250, 210));
        BackToMainMenu.setBounds(41, 357, 176, 59);
        jPanel14 = new javax.swing.JPanel();
        jPanel14.setBackground(new Color(173, 255, 47));
        SCORE_label = new javax.swing.JLabel();
        SCORE_label.setHorizontalAlignment(SwingConstants.CENTER);
        SCORE_label.setBounds(33, 10, 175, 52);
        YOU_label = new javax.swing.JLabel();
        YOU_label.setBounds(86, 108, 116, 52);
        OPPONENT_label = new javax.swing.JLabel();
        OPPONENT_label.setBounds(69, 180, 135, 52);
        PlayerScore = new javax.swing.JLabel();
        PlayerScore.setBounds(172, 120, 63, 29);
        PlayerScore.setHorizontalAlignment(SwingConstants.RIGHT);
        OpponentScore = new javax.swing.JLabel();
        OpponentScore.setBounds(172, 192, 63, 29);
        OpponentScore.setHorizontalAlignment(SwingConstants.RIGHT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        x0_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x0_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        x0_y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0_y0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x0_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(x0_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        x0_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x0_y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0_y1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x0_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x0_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        x0_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x0_y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0_y2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x0_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x0_y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(254, 252, 250));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        x1_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x1_y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1_y0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(253, 251, 250));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        x2_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x2_y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2_y0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(254, 252, 250));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        x1_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x1_y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1_y1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(251, 250, 248));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        x1_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x1_y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1_y2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x1_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(251, 250, 248));
        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));

        x2_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x2_y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2_y1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(250, 248, 246));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));

        x2_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        x2_y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2_y2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x2_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        CURR_TURN_label.setFont(new Font("Arial", Font.BOLD, 36)); // NOI18N
        CURR_TURN_label.setText("Current Turn : ");

        CurrentTurn.setFont(new Font("Arial", Font.ITALIC, 36)); // NOI18N
        CurrentTurn.setText("Opponent");

        ResetGame.setText("Reset all!!");
        ResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetGameActionPerformed(evt);
            }
        });

        MoveSuggestion.setBackground(new Color(250, 250, 210));
        MoveSuggestion.setText("Suggest a MOVE");
        MoveSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveSuggestionActionPerformed(evt);
            }
        });

        ChoosePieceType.setFont(new Font("Arial", Font.BOLD, 36)); // NOI18N
        ChoosePieceType.setMaximumRowCount(2);
        ChoosePieceType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "X" }));
        ChoosePieceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoosePieceTypeActionPerformed(evt);
            }
        });

        CHOOSE_label.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 24)); // NOI18N
        CHOOSE_label.setText("X or O  :");

        StartGame.setText("Start Sam-Mok!!");
        StartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameActionPerformed(evt);
            }
        });

        BackToMainMenu.setText("Main Menu");
        BackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainMenuActionPerformed(evt);
            }
        });

        SCORE_label.setFont(new Font("Arial", Font.BOLD, 36)); // NOI18N
        SCORE_label.setText("Point");

        YOU_label.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        YOU_label.setForeground(new java.awt.Color(51, 111, 44));
        YOU_label.setText("    YOU   :");

        OPPONENT_label.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        OPPONENT_label.setForeground(new java.awt.Color(240, 84, 84));
        OPPONENT_label.setText("SKKU Bot : ");

        PlayerScore.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        PlayerScore.setForeground(new java.awt.Color(0, 185, 0));
        PlayerScore.setText("0");

        OpponentScore.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        OpponentScore.setForeground(new java.awt.Color(215, 73, 73));
        OpponentScore.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(1)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        					.addGap(23)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(7)
        					.addComponent(jPanel12, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)))
        			.addGap(29)
        			.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel13, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel12, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
        					.addGap(56))))
        );
        jPanel12.setLayout(null);
        jPanel12.add(CURR_TURN_label);
        jPanel12.add(CurrentTurn);
        jPanel12.add(jLabel1);
        jPanel13.setLayout(null);
        jPanel13.add(CHOOSE_label);
        jPanel13.add(ChoosePieceType);
        jPanel13.add(MoveSuggestion);
        jPanel13.add(ResetGame);
        jPanel13.add(StartGame);
        jPanel13.add(BackToMainMenu);
        jPanel1.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel1.add(jPanel3);
        jPanel1.add(jPanel4);
        jPanel1.add(jPanel5);
        jPanel1.add(jPanel6);
        jPanel1.add(jPanel7);
        jPanel1.add(jPanel8);
        jPanel1.add(jPanel10);
        jPanel1.add(jPanel11);
        jPanel14.setLayout(null);
        jPanel14.add(SCORE_label);
        jPanel14.add(YOU_label);
        jPanel14.add(PlayerScore);
        jPanel14.add(OPPONENT_label);
        jPanel14.add(OpponentScore);
        
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("me.png")));
        lblNewLabel.setBounds(12, 108, 50, 52);
        jPanel14.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("com.png")));
        lblNewLabel_1.setBounds(12, 180, 50, 50);
        jPanel14.add(lblNewLabel_1);
        getContentPane().setLayout(layout);

        pack();
    }

    private void x1_y1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (IsGameRunning) {
            if (x1_y1.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[1][1] = engine.player1.get_piece_type();
                        x1_y1.setText(engine.player1.get_piece_type().toString());
                         
                        Player1_Move();
                    } 
                    else {
                        engine.Board.game_board[1][1] = engine.player2.get_piece_type();
                        x1_y1.setText(engine.player2.get_piece_type().toString());
                         Player2_Move();
                    
                    }
                } 
                
                else {
                    engine.Board.game_board[1][1] = engine.player2.get_piece_type();
                    x1_y1.setText(engine.player2.get_piece_type().toString());
                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }

    private void x0_y0ActionPerformed(java.awt.event.ActionEvent evt) {
        if (IsGameRunning) {
            if (x0_y0.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[0][0] = engine.player1.get_piece_type();
                        x0_y0.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    }
                    
                    else {
                        engine.Board.game_board[0][0] = engine.player2.get_piece_type();
                        x0_y0.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } else {
                    engine.Board.game_board[0][0] = engine.player2.get_piece_type();
                    x0_y0.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();

                }
            }
        }
    }

    private void x2_y2ActionPerformed(java.awt.event.ActionEvent evt) {
       
        if (IsGameRunning) {
            if (x2_y2.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {

                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[2][2] = engine.player1.get_piece_type();
                        x2_y2.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    } 
                    else {
                        engine.Board.game_board[2][2] = engine.player2.get_piece_type();
                        x2_y2.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {

                    engine.Board.game_board[2][2] = engine.player2.get_piece_type();
                    x2_y2.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }

    private void x0_y1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (IsGameRunning) {
            if (x0_y1.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[0][1] = engine.player1.get_piece_type();
                        x0_y1.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    } 
                    
                    else {
                        engine.Board.game_board[0][1] = engine.player2.get_piece_type();
                        x0_y1.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {
                    engine.Board.game_board[0][1] = engine.player2.get_piece_type();
                    x0_y1.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }

    private void ResetGameActionPerformed(java.awt.event.ActionEvent evt) {
        ResetBoard();
        IsGameRunning = false;
        

    }

    private void ChoosePieceTypeActionPerformed(java.awt.event.ActionEvent evt) {

        String piece_type = ChoosePieceType.getSelectedItem().toString();
        if (!IsGameRunning) {
            if (piece_type.equalsIgnoreCase("X")) {
                engine.player2.set_piece_type(pieces.X);
                engine.player1.set_piece_type(pieces.O);
            } else {
                engine.player2.set_piece_type(pieces.O);
                engine.player1.set_piece_type(pieces.X);
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Don't Hurry Game is in progress , Please Reset game to change",
                    "Changing Piece Type while Game is in Progress",
                    JOptionPane.WARNING_MESSAGE);

            ChoosePieceType.setSelectedItem(engine.player2.get_piece_type().toString());

        }
    }

    private void BackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {
        
        JOptionPane optionPane = new JOptionPane(
                "You Will lost all your game progress\n"
                + "Would you like to continue.\n",
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.YES_NO_OPTION);

        JDialog dialog = optionPane.createDialog(new JFrame(), "Resetting Game");
        dialog.setVisible(true);
        
        if (optionPane.getValue().toString().equals("0")) {

            ResetBoard();
            ResetScore();
            IsGameRunning = false;
            setVisible(false);
            MainMenu.setVisible(true);

        }


    }

    private void x1_y0ActionPerformed(java.awt.event.ActionEvent evt) {
        if (IsGameRunning) {
            if (x1_y0.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[1][0] = engine.player1.get_piece_type();
                        x1_y0.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    } 
                    
                    else {
                        engine.Board.game_board[1][0] = engine.player2.get_piece_type();
                        x1_y0.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                }
                
                else {
                    engine.Board.game_board[1][0] = engine.player2.get_piece_type();
                    x1_y0.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }

    private void x0_y2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (IsGameRunning) {
            if (x0_y2.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[0][2] = engine.player1.get_piece_type();
                        x0_y2.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    }
                    
                    else {
                        engine.Board.game_board[0][2] = engine.player2.get_piece_type();
                        x0_y2.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {
                    engine.Board.game_board[0][2] = engine.player2.get_piece_type();
                    x0_y2.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }//GEN-LAST:event_x0_y2ActionPerformed

    private void x1_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y2ActionPerformed
        // TODO add your handling code here:
        if (IsGameRunning) {
            if (x1_y2.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[1][2] = engine.player1.get_piece_type();
                        x1_y2.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    } 
                    
                    else {
                        engine.Board.game_board[1][2] = engine.player2.get_piece_type();
                        x1_y2.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {
                    engine.Board.game_board[1][2] = engine.player2.get_piece_type();
                    x1_y2.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }//GEN-LAST:event_x1_y2ActionPerformed

    private void x2_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y0ActionPerformed
        // TODO add your handling code here:
        if (IsGameRunning) {
            if (x2_y0.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[2][0] = engine.player1.get_piece_type();
                        x2_y0.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    } 
                    
                    else {
                        engine.Board.game_board[2][0] = engine.player2.get_piece_type();
                        x2_y0.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {
                    engine.Board.game_board[2][0] = engine.player2.get_piece_type();
                    x2_y0.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }//GEN-LAST:event_x2_y0ActionPerformed

    private void x2_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y1ActionPerformed
        // TODO add your handling code here:
        if (IsGameRunning) {
            if (x2_y1.getText().isEmpty()) {
                if (MainMenu.get_IsTwoPlayerGame()) {
                    if (engine.get_IsPlayer1Turn()) {
                        engine.Board.game_board[2][1] = engine.player1.get_piece_type();
                        x2_y1.setText(engine.player1.get_piece_type().toString());
                        Player1_Move();
                    }
                    
                    else {
                        engine.Board.game_board[2][1] = engine.player2.get_piece_type();
                        x2_y1.setText(engine.player2.get_piece_type().toString());
                        Player2_Move();
                    }
                } 
                
                else {
                    engine.Board.game_board[2][1] = engine.player2.get_piece_type();
                    x2_y1.setText(engine.player2.get_piece_type().toString());

                    Player2_Move();
                    Player1_Move();
                }
            }
        }
    }//GEN-LAST:event_x2_y1ActionPerformed

    private void StartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameActionPerformed
        // TODO Sounadd your handling code here:
        
        if(!IsGameRunning){
            ResetBoard();
            if (gamecount % 2 == 0) {
                SetPlayer2Turn();
            } else {
                SetPlayer1Turn();
            }

            IsGameRunning = true;
            if (!MainMenu.get_IsTwoPlayerGame() && engine.get_IsPlayer1Turn()) {
               engine.Board.game_board[0][0] = engine.player1.get_piece_type();
               x0_y0.setText(engine.player1.get_piece_type().toString());
               SetPlayer2Turn();
            }
            gamecount++;
        }
        else{
            JOptionPane.showMessageDialog(frame,"Game Is Already Running,Please Reset Game If you wan't to start from beginning");
        }
    }//GEN-LAST:event_StartGameActionPerformed

    private void MoveSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveSuggestionActionPerformed
        // TODO add your handling code here:
        int[] bestMove = engine.findBestMove();
        if (bestMove[2] == -1) {
            System.out.println("game draw");
            JOptionPane.showMessageDialog(frame,
                    "you can't get more than a draw");
            
        }  
        
        else {

            if (bestMove[0] == 0 && bestMove[1] == 0) {
                Blink_Button(x0_y0);

            }

            if (bestMove[0] == 1 && bestMove[1] == 0) {
                Blink_Button(x1_y0);
            }

            if (bestMove[0] == 2 && bestMove[1] == 0) {
               Blink_Button(x2_y0);
            }

            if (bestMove[0] == 0 && bestMove[1] == 1) {
                Blink_Button(x0_y1);
            }

            if (bestMove[0] == 1 && bestMove[1] == 1) {
                Blink_Button(x1_y1);
            }

            if (bestMove[0] == 2 && bestMove[1] == 1) {
                Blink_Button(x2_y1);
            }

            if (bestMove[0] == 0 && bestMove[1] == 2) {
                Blink_Button(x0_y2);
            }

            if (bestMove[0] == 1 && bestMove[1] == 2) {
                Blink_Button(x1_y2);
            }

            if (bestMove[0] == 2 && bestMove[1] == 2) {
               Blink_Button(x2_y2);
            }

        
    }//GEN-LAST:event_MoveSuggestionActionPerformed
 }
    private void Blink_Button(final javax.swing.JButton b){
        Timer blinkTimer = new Timer(500, new ActionListener() {
        private int count = 0;
        private int maxCount = 10;
        private boolean on = false;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (count >= maxCount) {
                b.setBackground(null);
                ((Timer) e.getSource()).stop();
            } else {
                b.setBackground( on ? Color.YELLOW : null);
                on = !on;
                count++;
            }
        }

           
            
       });
        blinkTimer.start();
    }
    private void SetPlayer1Turn() {
        engine.set_IsPlayer1Turn(true);
        CurrentTurn.setText("Opponent's");
        CurrentTurn.setForeground(new java.awt.Color(240, 84, 84));
    }

    private void SetPlayer2Turn() {
        engine.set_IsPlayer1Turn(false);
        CurrentTurn.setText("Your's");
        CurrentTurn.setForeground(new java.awt.Color(51, 111, 44));
    }

    private void ResetBoard() {
        int i, j;

        engine.Board.reset();
        ResetButtonColor();
        x0_y0.setText("");
        x0_y1.setText("");
        x0_y2.setText("");
        x1_y0.setText("");
        x1_y1.setText("");
        x1_y2.setText("");
        x2_y0.setText("");
        x2_y1.setText("");
        x2_y2.setText("");

    }

    private void ResetScore() {
        gamecount = 0;
        engine.player1.reset_total_wins();
        engine.player2.reset_total_wins();
        PlayerScore.setText("0");
        OpponentScore.setText(("0"));
    }

    private void Player2_Move() {

        curr_score = engine.evaluate_score(0);
        SetPlayer1Turn();
        if (curr_score > 0) {
            
            System.out.println("Player1 Wins");
            HighlightWinningOrLoosing();
            IsGameRunning = false;
            engine.Board.printBoard();
            engine.player1.increment_total_wins();
            OpponentScore.setText(Integer.toString(engine.player1.get_total_wins()));
            JOptionPane.showMessageDialog(frame,
                                    "YOU Lost , Your Opponent has played better than you");
           
            

        } else if (curr_score < 0) {
            
            System.out.println("Player2 wins");
            HighlightWinningOrLoosing();
            engine.Board.printBoard();
            engine.player2.increment_total_wins();
            PlayerScore.setText(Integer.toString(engine.player2.get_total_wins()));
            
            IsGameRunning = false;
            JOptionPane.showMessageDialog(frame,
                                    "Hurrah,YOU Won the game");
           

        }

        if (!engine.IsMoveLeft()) {
            IsGameRunning = false;
            JOptionPane.showMessageDialog(frame, "Game DRAW ,It's better than loosing");
           
        }

    }

    private void Player1_Move() {

        int[] bestMove = new int[3];
        if (IsGameRunning) {

            if (MainMenu.get_IsTwoPlayerGame()) {
                
                curr_score = engine.evaluate_score(0);
                SetPlayer2Turn();
                if (curr_score > 0) {
                    System.out.println("Player1 Wins");
                    HighlightWinningOrLoosing();
                    IsGameRunning = false;
                    engine.Board.printBoard();
                    engine.player1.increment_total_wins();
                    OpponentScore.setText(Integer.toString(engine.player1.get_total_wins()));
                    JOptionPane.showMessageDialog(frame,
                                    "YOU Lost , Your Opponent has played better");
             

                } else if (curr_score < 0) {
                    System.out.println("Player1 looses");
                    HighlightWinningOrLoosing();
                    IsGameRunning = false;
                    engine.Board.printBoard();
                    engine.player2.increment_total_wins();
                    PlayerScore.setText(Integer.toString(engine.player2.get_total_wins()));
                    JOptionPane.showMessageDialog(frame,
                                    "Hurrah,YOU Won the game");
                    
               
                }

                if (!engine.IsMoveLeft()) {
                    IsGameRunning = false;
                    JOptionPane.showMessageDialog(frame, "Game DRAW ,It's better than loosing");
                   
                 
                }

            } 
            
            else {

                if (engine.get_IsPlayer1Turn()) {

                    bestMove = engine.findBestMove();

                    if (bestMove[2] == -1) {
                        System.out.println("Game Draw");
                        JOptionPane.showMessageDialog(frame,
                                "Game DRAW ,It's better than loosing");
                        IsGameRunning = false;
                    } else {

                        if (bestMove[0] == 0 && bestMove[1] == 0) {
                            engine.Board.game_board[0][0] = engine.player1.get_piece_type();
                            x0_y0.setText(engine.player1.get_piece_type().toString());

                        }

                        if (bestMove[0] == 1 && bestMove[1] == 0) {
                            engine.Board.game_board[1][0] = engine.player1.get_piece_type();
                            x1_y0.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 2 && bestMove[1] == 0) {
                            engine.Board.game_board[2][0] = engine.player1.get_piece_type();
                            x2_y0.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 0 && bestMove[1] == 1) {
                            engine.Board.game_board[0][1] = engine.player1.get_piece_type();
                            x0_y1.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 1 && bestMove[1] == 1) {
                            engine.Board.game_board[1][1] = engine.player1.get_piece_type();
                            x1_y1.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 2 && bestMove[1] == 1) {
                            engine.Board.game_board[2][1] = engine.player1.get_piece_type();
                            x2_y1.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 0 && bestMove[1] == 2) {
                            engine.Board.game_board[0][2] = engine.player1.get_piece_type();
                            x0_y2.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 1 && bestMove[1] == 2) {
                            engine.Board.game_board[1][2] = engine.player1.get_piece_type();
                            x1_y2.setText(engine.player1.get_piece_type().toString());
                        }

                        if (bestMove[0] == 2 && bestMove[1] == 2) {
                            engine.Board.game_board[2][2] = engine.player1.get_piece_type();
                            x2_y2.setText(engine.player1.get_piece_type().toString());
                        }

                        SetPlayer2Turn();
                        curr_score = engine.evaluate_score(0);
                        if (curr_score > 0) {
                            System.out.println("Player1 Wins");
                            HighlightWinningOrLoosing();
                            engine.player1.increment_total_wins();
                            OpponentScore.setText(Integer.toString(engine.player1.get_total_wins()));
                            IsGameRunning = false;
                            engine.Board.printBoard();
                            JOptionPane.showMessageDialog(frame,
                                    "YOU Lost , It's unbeatable Bro");

                        } else if (curr_score < 0) {
                            System.out.println("Player1 looses");
                            IsGameRunning = false;
                            JOptionPane.showMessageDialog(frame,
                                    "This will never happen");
                       

                        }
                        if (!engine.IsMoveLeft()) {
                            JOptionPane.showMessageDialog(frame, "Game DRAW ,It's better than loosing");
                            IsGameRunning = false;
                        
                           
                        }
                    }

                }

            }
        }
        System.out.println("Done");
    }
    
    public int Highlight_helper(){
        int row,col;
        // Checking for Rows for X or O victory.
        pieces type = pieces.emp;
        for (row = 0; row < engine.Board.get_no_of_rows(); row++)
        {
            type = engine.Board.game_board[row][0];
            for(col = 0;col < engine.Board.get_no_of_coloumns();col++){
                if(engine.Board.game_board[row][col] != type)
                    break;
            }
            
            if(col == engine.Board.get_no_of_coloumns()){
            
                if(type == engine.player1.get_piece_type()){
                    color = "RED";
                    return row + 1;
                }
                else if(type == engine.player2.get_piece_type()){
                    color = "GREEN";
                    return row + 1;
                }
            }
        }

        // Checking for Columns for X or O victory.
        for (col = 0; col < engine.Board.get_no_of_coloumns(); col++)
        {
            type = engine.Board.game_board[0][col];
            for(row = 0;row < engine.Board.get_no_of_rows();row++){
                if(engine.Board.game_board[row][col] != type)
                    break;
                
            }
            
            if(row == engine.Board.get_no_of_rows()){
                            
                if(type == engine.player1.get_piece_type()){
                    color = "RED";
                    return engine.Board.get_no_of_rows() + col + 1;
                }
                else if(type == engine.player2.get_piece_type()){
                    color = "GREEN";
                    return engine.Board.get_no_of_rows() + col + 1;
                }
            }
        }

        // Checking for Diagonals for X or O victory.
        type = engine.Board.game_board[0][0];
        for(row = 0;row < engine.Board.get_no_of_rows();row++){
            
            if(engine.Board.game_board[row][row] != type)
                break;
            
        }
        if(row == engine.Board.get_no_of_rows()){
            
           
            if(type == engine.player1.get_piece_type()){
               color = "RED";
               return 7;
            }
            else if(type == engine.player2.get_piece_type()){
                color = "GREEN";
               return 7;
            }
        }
        
        
        row = 0;
        col = engine.Board.get_no_of_coloumns()-1;
        type = engine.Board.game_board[row][col];
        while(col >= 0){
            if(engine.Board.game_board[row][col] != type)
                break;
            row++;
            col--;
        }
        
        if(col < 0){
            
            if(type == engine.player1.get_piece_type()){
                color = "RED";
               return 8;
            }
            else if(type == engine.player2.get_piece_type()){
                color = "GREEN";
               return 8;
            }
        }

        // Else if none of them have won then return 0
        return 0; 
        
    }
    
    void HighlightWinningOrLoosing(){
        int type = Highlight_helper();
        if(type == 1){
            if(color.equals("RED")){
                x0_y0.setBackground(new java.awt.Color(244,38,38));
                x0_y1.setBackground(new java.awt.Color(244,38,38));
                x0_y2.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y0.setBackground(new java.awt.Color(73,220,82));
                x0_y1.setBackground(new java.awt.Color(73,220,82));
                x0_y2.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 2){
            if(color.equals("RED")){
                x1_y0.setBackground(new java.awt.Color(244,38,38));
                x1_y1.setBackground(new java.awt.Color(244,38,38));
                x1_y2.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x1_y0.setBackground(new java.awt.Color(73,220,82));
                x1_y1.setBackground(new java.awt.Color(73,220,82));
                x1_y2.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 3){
            if(color.equals("RED")){
                x2_y0.setBackground(new java.awt.Color(244,38,38));
                x2_y1.setBackground(new java.awt.Color(244,38,38));
                x2_y2.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x2_y0.setBackground(new java.awt.Color(73,220,82));
                x2_y1.setBackground(new java.awt.Color(73,220,82));
                x2_y2.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 4){
            if(color.equals("RED")){
                x0_y0.setBackground(new java.awt.Color(244,38,38));
                x1_y0.setBackground(new java.awt.Color(244,38,38));
                x2_y0.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y0.setBackground(new java.awt.Color(73,220,82));
                x1_y0.setBackground(new java.awt.Color(73,220,82));
                x2_y0.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 5){
            if(color.equals("RED")){
                x0_y1.setBackground(new java.awt.Color(244,38,38));
                x1_y1.setBackground(new java.awt.Color(244,38,38));
                x2_y1.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y1.setBackground(new java.awt.Color(73,220,82));
                x1_y1.setBackground(new java.awt.Color(73,220,82));
                x2_y1.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 6){
            if(color.equals("RED")){
                x0_y2.setBackground(new java.awt.Color(244,38,38));
                x1_y2.setBackground(new java.awt.Color(244,38,38));
                x2_y2.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y2.setBackground(new java.awt.Color(73,220,82));
                x1_y2.setBackground(new java.awt.Color(73,220,82));
                x2_y2.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
        if(type == 7){
            if(color.equals("RED")){
                x0_y0.setBackground(new java.awt.Color(244,38,38));
                x1_y1.setBackground(new java.awt.Color(244,38,38));
                x2_y2.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y0.setBackground(new java.awt.Color(73,220,82));
                x1_y1.setBackground(new java.awt.Color(73,220,82));
                x2_y2.setBackground(new java.awt.Color(73,220,82));
            }
        }
        if(type == 8){
            if(color.equals("RED")){
                x0_y2.setBackground(new java.awt.Color(244,38,38));
                x1_y1.setBackground(new java.awt.Color(244,38,38));
                x2_y0.setBackground(new java.awt.Color(244,38,38));
            }
            else{
                x0_y2.setBackground(new java.awt.Color(73,220,82));
                x1_y1.setBackground(new java.awt.Color(73,220,82));
                x2_y0.setBackground(new java.awt.Color(73,220,82));
            }
        }
        
    }
    
    void ResetButtonColor(){
        x0_y0.setBackground(new java.awt.Color(249,249,248));
        x0_y1.setBackground(new java.awt.Color(249,249,248));
        x0_y2.setBackground(new java.awt.Color(249,249,248));
        x1_y0.setBackground(new java.awt.Color(249,249,248));
        x1_y1.setBackground(new java.awt.Color(249,249,248));
        x1_y2.setBackground(new java.awt.Color(249,249,248));
        x2_y0.setBackground(new java.awt.Color(249,249,248));
        x2_y1.setBackground(new java.awt.Color(249,249,248));
        x2_y2.setBackground(new java.awt.Color(249,249,248));
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMainMenu;
    private javax.swing.JLabel CHOOSE_label;
    private javax.swing.JLabel CURR_TURN_label;
    private javax.swing.JComboBox ChoosePieceType;
    private javax.swing.JLabel CurrentTurn;
    private javax.swing.JButton MoveSuggestion;
    private javax.swing.JLabel OPPONENT_label;
    private javax.swing.JLabel OpponentScore;
    private javax.swing.JLabel PlayerScore;
    private javax.swing.JButton ResetGame;
    private javax.swing.JLabel SCORE_label;
    private javax.swing.JButton StartGame;
    private javax.swing.JLabel YOU_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton x0_y0;
    private javax.swing.JButton x0_y1;
    private javax.swing.JButton x0_y2;
    private javax.swing.JButton x1_y0;
    private javax.swing.JButton x1_y1;
    private javax.swing.JButton x1_y2;
    private javax.swing.JButton x2_y0;
    private javax.swing.JButton x2_y1;
    private javax.swing.JButton x2_y2;
}
