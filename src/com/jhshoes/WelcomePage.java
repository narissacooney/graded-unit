package com.jhshoes;

//name: narissa cooney
//date: 15 July 2017
//task: creating welcome UI which includes products
import static com.jhshoes.Gender.FEMALE;
import static com.jhshoes.Gender.MALE;
import static com.jhshoes.Gender.UNISEX;
import com.jhshoes.cell.ProductCellRenderer;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class WelcomePage extends javax.swing.JFrame {

    //creating new JHShoes Object
    JHShoes connect = new JHShoes();
    //creating new Object for random number generator
    Random rnd = new Random();

    //global variable created to save customer id
    private Customer loggedInCustomer;

    public WelcomePage() {
    }

    public WelcomePage(String customerID) {
        initComponents();

        //for current logged in customer, connecting to database
        this.loggedInCustomer = connect.getCustomerById(customerID);
        //getting product from database based on gender - FEMALE
        List<Product> womensList = connect.getProductListByGender(FEMALE);
        //creating new model object
        DefaultListModel<Product> model = new DefaultListModel<>();
        //creating a collection - grouping same data together
        womensList.stream().forEach(product -> {
            //add element adds specific component (product) to the end of the list
            model.addElement(product);
        });
        listWomensShoes.setModel(model);

        //getting product from database based on gender - MALE
        List<Product> mensList = connect.getProductListByGender(MALE);
        //creating new model1 object
        DefaultListModel<Product> model1 = new DefaultListModel<>();
        //creating a collection - grouping same data together
        mensList.stream().forEach(product -> {
            //add element adds specific component (product) to the end of the list
            model1.addElement(product);
        });

        listMensShoes.setModel(model1);

        //getting product from database based on gender - UNISEX
        List<Product> unisexList = connect.getProductListByGender(UNISEX);
        //creating new model 2 object
        DefaultListModel<Product> model2 = new DefaultListModel<>();
        //creating a collection - grouping same data together
        unisexList.stream().forEach(product -> {
            //add element adds specific component (product) to the end of the list
            model2.addElement(product);
        });

        listUnisexShoes.setModel(model2);

        //list of model product
        listBasketItems.setModel(new DefaultListModel<>());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderHistoryPanel = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        tbdPaneHome = new javax.swing.JTabbedPane();
        panelHomePage = new javax.swing.JPanel();
        lbl1Info = new javax.swing.JLabel();
        lbl2Info = new javax.swing.JLabel();
        lbl3Info = new javax.swing.JLabel();
        lbl4Info = new javax.swing.JLabel();
        lbl5Info = new javax.swing.JLabel();
        tbdPaneShop = new javax.swing.JTabbedPane();
        scrollPaneMen = new javax.swing.JScrollPane();
        listMensShoes = new javax.swing.JList<>();
        listMensShoes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {

                    // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());
                    Product selectedProduct = listMensShoes.getModel().getElementAt(index);
                    ListModel model = listBasketItems.getModel();
                    ShoeDisplay s = new ShoeDisplay(selectedProduct, (DefaultListModel)listBasketItems.getModel());
                    s.setVisible(true);

                }
            }
        });
        scrollPaneWomens = new javax.swing.JScrollPane();
        listWomensShoes = new javax.swing.JList<>();
        listWomensShoes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {

                    // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());
                    Product selectedProduct = listWomensShoes.getModel().getElementAt(index);
                    ListModel model = listBasketItems.getModel();
                    ShoeDisplay s = new ShoeDisplay(selectedProduct, (DefaultListModel)listBasketItems.getModel());
                    s.setVisible(true);

                }
            }
        });
        scrollPaneUni = new javax.swing.JScrollPane();
        listUnisexShoes = new javax.swing.JList<>();
        listUnisexShoes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {

                    // Double-click detected
                    int index = list.locationToIndex(evt.getPoint());
                    Product selectedProduct = listUnisexShoes.getModel().getElementAt(index);
                    ListModel model = listBasketItems.getModel();
                    ShoeDisplay s = new ShoeDisplay(selectedProduct, (DefaultListModel)listBasketItems.getModel());
                    s.setVisible(true);

                }
            }
        });
        tbdPaneAccount = new javax.swing.JTabbedPane();
        panelOrderHistory = new javax.swing.JPanel();
        panelAccountDetails = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        lblTelephoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblMobileNumber = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtLastNameAcc = new javax.swing.JTextField();
        txtFirstNameAcc = new javax.swing.JTextField();
        txtStreetAcc = new javax.swing.JTextField();
        txtTownAcc = new javax.swing.JTextField();
        txtPostcodeAcc = new javax.swing.JTextField();
        txtTelephoneNumberAcc = new javax.swing.JTextField();
        txtEmailAcc = new javax.swing.JTextField();
        txtMobileNumberAcc = new javax.swing.JTextField();
        pswrdPassword = new javax.swing.JPasswordField();
        txtUsernameAcc = new javax.swing.JTextField();
        btnSaveDetails = new javax.swing.JButton();
        btnRemoveAccount = new javax.swing.JButton();
        tbdPanelBasket = new javax.swing.JPanel();
        sclPaneBasket = new javax.swing.JScrollPane();
        listBasketItems = new javax.swing.JList<>();
        lblTotalCost = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        //0.0d - double
        double totalPrice = 0.0d;

        for (int i = 0; i < listBasketItems.getModel().getSize(); i++) {
            totalPrice += listBasketItems.getModel().getElementAt(i).getProductPrice();

        }

        txtTotalCost.setText(String.valueOf(totalPrice));
        btnContinueToPayment = new javax.swing.JButton();
        pnlContactDetails = new javax.swing.JPanel();
        lbl1DetailInfo = new javax.swing.JLabel();
        lbl2DetailInfo = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        javax.swing.GroupLayout orderHistoryPanelLayout = new javax.swing.GroupLayout(orderHistoryPanel);
        orderHistoryPanel.setLayout(orderHistoryPanelLayout);
        orderHistoryPanelLayout.setHorizontalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        orderHistoryPanelLayout.setVerticalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        welcomePanel.setBackground(new java.awt.Color(255, 255, 153));
        welcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("YuMincho +36p Kana", 0, 24)); // NOI18N
        lblWelcome.setText("WELCOME");
        welcomePanel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 6, 168, 41));

        tbdPaneHome.setBackground(new java.awt.Color(51, 153, 255));

        panelHomePage.setBackground(new java.awt.Color(255, 255, 153));

        lbl1Info.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl1Info.setText("JHShoes is an organisation that specialises in selling training shoes for Male and Female.");

        lbl2Info.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl2Info.setText("As an innovative shoe manufacturer, we must always adapt to the changing social, ");

        lbl3Info.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl3Info.setText("economic and professional framework conditions.  We determine what gives us direction");

        lbl4Info.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl4Info.setText("and helps us in our daily tasks to be successfully fulfilled. ");

        lbl5Info.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl5Info.setText("We are an independent, successful and creative company who strive for the highest quality. ");

        javax.swing.GroupLayout panelHomePageLayout = new javax.swing.GroupLayout(panelHomePage);
        panelHomePage.setLayout(panelHomePageLayout);
        panelHomePageLayout.setHorizontalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomePageLayout.createSequentialGroup()
                .addGroup(panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomePageLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lbl4Info)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl1Info, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelHomePageLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(lbl2Info))
                                .addComponent(lbl3Info, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                                .addComponent(lbl5Info)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        panelHomePageLayout.setVerticalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomePageLayout.createSequentialGroup()
                .addComponent(lbl1Info, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2Info, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl3Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl4Info)
                .addGap(18, 18, 18)
                .addComponent(lbl5Info)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbdPaneHome.addTab("About Us", panelHomePage);

        jTabbedPane2.addTab("Home Page", tbdPaneHome);

        listMensShoes.setBackground(new java.awt.Color(255, 255, 153));
        listMensShoes.setCellRenderer(new ProductCellRenderer());
        scrollPaneMen.setViewportView(listMensShoes);

        tbdPaneShop.addTab("Mens Training Shoes", scrollPaneMen);

        scrollPaneWomens.setMaximumSize(new java.awt.Dimension(100, 100));

        listWomensShoes.setBackground(new java.awt.Color(255, 255, 153));
        listWomensShoes.setToolTipText("");
        listWomensShoes.setCellRenderer(new ProductCellRenderer()
        );
        scrollPaneWomens.setViewportView(listWomensShoes);

        tbdPaneShop.addTab("Womens Training Shoes", scrollPaneWomens);

        listUnisexShoes.setBackground(new java.awt.Color(255, 255, 153));
        listUnisexShoes.setCellRenderer(new ProductCellRenderer());
        scrollPaneUni.setViewportView(listUnisexShoes);

        tbdPaneShop.addTab("Unisex Training Shoes", scrollPaneUni);

        jTabbedPane2.addTab("Shop", tbdPaneShop);

        tbdPaneAccount.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbdPaneAccountComponentShown(evt);
            }
        });

        panelOrderHistory.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout panelOrderHistoryLayout = new javax.swing.GroupLayout(panelOrderHistory);
        panelOrderHistory.setLayout(panelOrderHistoryLayout);
        panelOrderHistoryLayout.setHorizontalGroup(
            panelOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelOrderHistoryLayout.setVerticalGroup(
            panelOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbdPaneAccount.addTab("Order History", panelOrderHistory);

        panelAccountDetails.setBackground(new java.awt.Color(255, 255, 153));
        panelAccountDetails.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelAccountDetailsComponentShown(evt);
            }
        });

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblStreet.setText("Street");

        lblTown.setText("Town");

        lblPostcode.setText("Postcode");

        lblTelephoneNumber.setText("Telephone Number");

        lblEmail.setText("Email");

        lblUsername.setText("Username");

        lblMobileNumber.setText("Mobile Number");

        lblPassword.setText("Password");

        txtFirstNameAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameAccActionPerformed(evt);
            }
        });

        txtStreetAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetAccActionPerformed(evt);
            }
        });

        txtTownAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTownAccActionPerformed(evt);
            }
        });

        txtTelephoneNumberAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberAccActionPerformed(evt);
            }
        });

        txtMobileNumberAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberAccActionPerformed(evt);
            }
        });

        btnSaveDetails.setBackground(new java.awt.Color(51, 153, 255));
        btnSaveDetails.setText("SAVE DETAILS");
        btnSaveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDetailsActionPerformed(evt);
            }
        });

        btnRemoveAccount.setBackground(new java.awt.Color(51, 153, 255));
        btnRemoveAccount.setText("REMOVE ACCOUNT");
        btnRemoveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccountDetailsLayout = new javax.swing.GroupLayout(panelAccountDetails);
        panelAccountDetails.setLayout(panelAccountDetailsLayout);
        panelAccountDetailsLayout.setHorizontalGroup(
            panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                        .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStreet)
                            .addComponent(lblLastName)
                            .addComponent(lblTown)
                            .addComponent(lblPostcode))
                        .addGap(18, 18, 18)
                        .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastNameAcc)
                            .addComponent(txtStreetAcc)
                            .addComponent(txtTownAcc)
                            .addComponent(txtPostcodeAcc)))
                    .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                        .addComponent(lblFirstName)
                        .addGap(18, 18, 18)
                        .addComponent(txtFirstNameAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                        .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTelephoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelephoneNumberAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMobileNumber)
                                    .addComponent(lblEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMobileNumberAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsernameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswrdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))))
            .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnSaveDetails)
                .addGap(38, 38, 38)
                .addComponent(btnRemoveAccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccountDetailsLayout.setVerticalGroup(
            panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccountDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(txtTelephoneNumberAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastName)
                    .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmailAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmail)
                        .addComponent(txtLastNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreetAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobileNumber)
                    .addComponent(txtMobileNumberAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtTownAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsernameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostcode)
                    .addComponent(txtPostcodeAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswrdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(panelAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveDetails)
                    .addComponent(btnRemoveAccount))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tbdPaneAccount.addTab("Account Details", panelAccountDetails);

        jTabbedPane2.addTab("Account", tbdPaneAccount);

        tbdPanelBasket.setBackground(new java.awt.Color(255, 255, 153));
        tbdPanelBasket.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbdPanelBasketComponentShown(evt);
            }
        });

        listBasketItems.setBackground(new java.awt.Color(255, 255, 153));
        listBasketItems.setCellRenderer(new ProductCellRenderer());
        sclPaneBasket.setViewportView(listBasketItems);

        lblTotalCost.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTotalCost.setText("Total");

        txtTotalCost.setEditable(false);
        txtTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCostActionPerformed(evt);
            }
        });

        btnContinueToPayment.setText("Continue To Payment");

        javax.swing.GroupLayout tbdPanelBasketLayout = new javax.swing.GroupLayout(tbdPanelBasket);
        tbdPanelBasket.setLayout(tbdPanelBasketLayout);
        tbdPanelBasketLayout.setHorizontalGroup(
            tbdPanelBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdPanelBasketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbdPanelBasketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinueToPayment)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbdPanelBasketLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(sclPaneBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tbdPanelBasketLayout.setVerticalGroup(
            tbdPanelBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbdPanelBasketLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(sclPaneBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tbdPanelBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCost)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnContinueToPayment)
                .addGap(33, 33, 33))
        );

        jTabbedPane2.addTab("Basket", tbdPanelBasket);

        pnlContactDetails.setBackground(new java.awt.Color(255, 255, 153));

        lbl1DetailInfo.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl1DetailInfo.setText("For returns - Please contact jhshoes@trainingwear.co.uk with your order reference number ");

        lbl2DetailInfo.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbl2DetailInfo.setText("and reason for returning the item.");

        javax.swing.GroupLayout pnlContactDetailsLayout = new javax.swing.GroupLayout(pnlContactDetails);
        pnlContactDetails.setLayout(pnlContactDetailsLayout);
        pnlContactDetailsLayout.setHorizontalGroup(
            pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2DetailInfo)
                    .addComponent(lbl1DetailInfo))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlContactDetailsLayout.setVerticalGroup(
            pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1DetailInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl2DetailInfo)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Contact Details", pnlContactDetails);

        welcomePanel.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 707, 404));

        btnLogOut.setBackground(new java.awt.Color(0, 153, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        welcomePanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        //once log out button is clicked, system interface will be closed
        close();
        SystemInterface s = new SystemInterface();
        s.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void txtFirstNameAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameAccActionPerformed

    }//GEN-LAST:event_txtFirstNameAccActionPerformed

    private void txtStreetAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetAccActionPerformed

    }//GEN-LAST:event_txtStreetAccActionPerformed

    private void txtTownAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTownAccActionPerformed

    }//GEN-LAST:event_txtTownAccActionPerformed

    private void txtTelephoneNumberAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberAccActionPerformed

    }//GEN-LAST:event_txtTelephoneNumberAccActionPerformed

    private void txtMobileNumberAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberAccActionPerformed

    private void btnSaveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDetailsActionPerformed
        //creating new customer object
        Customer customer = new Customer();
        //saving the customersID once logged in
        customer.setCustomerID(loggedInCustomer.getCustomerID());
        customer.setFirstName(txtFirstNameAcc.getText());
        customer.setLastName(txtLastNameAcc.getText());
        customer.setEmail(txtEmailAcc.getText());
        customer.setMobileNumber(txtMobileNumberAcc.getText());
        //customer.setPassword(Arrays.toString(pswrdPassword.getPassword()));
        customer.setPostcode(txtPostcodeAcc.getText());
        customer.setStreet(txtStreetAcc.getText());
        customer.setTelephoneNumber(txtTelephoneNumberAcc.getText());
        customer.setTown(txtTownAcc.getText());
        customer.setUsername(txtUsernameAcc.getText());

        //connecting to the database and saving customer details
        connect.saveCustomerDetails(customer);

        //notifies customer that updates have been successfull
        JOptionPane.showMessageDialog(null, "Updates to your account details have been made");

    }//GEN-LAST:event_btnSaveDetailsActionPerformed

    private void btnRemoveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAccountActionPerformed
        //creating new instance of customer
        Customer customer = new Customer();
        //asking user for confirmation they want to continue removing their account from system
        int response = JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_NO_OPTION) {

            //Store customer details into CUSTOMER database.
            String input = ("CUSTOMER(CUSTOMERID, FIRSTNAME, LASTNAME, STREET, TOWN, POSTCODE, TELEPHONENUMBER, EMAIL, MOBILENUMBER, USERNAME, PASSWORD)");

            //setting values to be removed
            String values = ("'" + customer.getCustomerID() + "', '"
                    + customer.getFirstName() + "', '"
                    + customer.getLastName() + "', '"
                    + customer.getStreet() + "', '"
                    + customer.getTown() + "', '"
                    + customer.getPostcode() + "', '"
                    + customer.getTelephoneNumber() + "', '"
                    + customer.getEmail() + "', '"
                    + customer.getMobileNumber() + "', '"
                    + customer.getUsername() + "', '"
                    + customer.getPassword() + "'");

            //deleting customer information from the database
            connect.deleteDB(loggedInCustomer.getCustomerID());

            //Clears all fields once user has been removed
            txtFirstNameAcc.setText("");
            txtLastNameAcc.setText("");
            txtStreetAcc.setText("");
            txtTownAcc.setText("");
            txtPostcodeAcc.setText("");
            txtTelephoneNumberAcc.setText("");
            txtEmailAcc.setText("");
            txtMobileNumberAcc.setText("");
            txtUsernameAcc.setText("");
            pswrdPassword.setText("");
        }


    }//GEN-LAST:event_btnRemoveAccountActionPerformed

    private void panelAccountDetailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelAccountDetailsComponentShown
        //code behind text fields to populate user information as soon as they have logged into system

        txtFirstNameAcc.setText(loggedInCustomer.getFirstName());
        txtLastNameAcc.setText(loggedInCustomer.getLastName());
        txtEmailAcc.setText(loggedInCustomer.getEmail());
        txtMobileNumberAcc.setText(loggedInCustomer.getMobileNumber());
        txtPostcodeAcc.setText(loggedInCustomer.getPostcode());
        txtStreetAcc.setText(loggedInCustomer.getStreet());
        txtTelephoneNumberAcc.setText(loggedInCustomer.getTelephoneNumber());
        txtUsernameAcc.setText(loggedInCustomer.getUsername());
        pswrdPassword.setText(loggedInCustomer.getPassword());
        txtTownAcc.setText(loggedInCustomer.getTown());


    }//GEN-LAST:event_panelAccountDetailsComponentShown

    private void tbdPaneAccountComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbdPaneAccountComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdPaneAccountComponentShown

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
       
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void tbdPanelBasketComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbdPanelBasketComponentShown
          //0.0d - double
        double totalPrice = 0.0d;
        
        for (int i = 0; i < listBasketItems.getModel().getSize(); i++) {
            totalPrice += listBasketItems.getModel().getElementAt(i).getProductPrice();
        }
        
        DecimalFormat df = new DecimalFormat("##.##");
        txtTotalCost.setText(df.format(totalPrice));
    }//GEN-LAST:event_tbdPanelBasketComponentShown

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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinueToPayment;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRemoveAccount;
    private javax.swing.JButton btnSaveDetails;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbl1DetailInfo;
    private javax.swing.JLabel lbl1Info;
    private javax.swing.JLabel lbl2DetailInfo;
    private javax.swing.JLabel lbl2Info;
    private javax.swing.JLabel lbl3Info;
    private javax.swing.JLabel lbl4Info;
    private javax.swing.JLabel lbl5Info;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JList<Product> listBasketItems;
    private javax.swing.JList<Product> listMensShoes;
    private javax.swing.JList<Product> listUnisexShoes;
    private javax.swing.JList<Product> listWomensShoes;
    private javax.swing.JPanel orderHistoryPanel;
    private javax.swing.JPanel panelAccountDetails;
    private javax.swing.JPanel panelHomePage;
    private javax.swing.JPanel panelOrderHistory;
    private javax.swing.JPanel pnlContactDetails;
    private javax.swing.JPasswordField pswrdPassword;
    private javax.swing.JScrollPane sclPaneBasket;
    private javax.swing.JScrollPane scrollPaneMen;
    private javax.swing.JScrollPane scrollPaneUni;
    private javax.swing.JScrollPane scrollPaneWomens;
    private javax.swing.JTabbedPane tbdPaneAccount;
    private javax.swing.JTabbedPane tbdPaneHome;
    private javax.swing.JTabbedPane tbdPaneShop;
    private javax.swing.JPanel tbdPanelBasket;
    private javax.swing.JTextField txtEmailAcc;
    private javax.swing.JTextField txtFirstNameAcc;
    private javax.swing.JTextField txtLastNameAcc;
    private javax.swing.JTextField txtMobileNumberAcc;
    private javax.swing.JTextField txtPostcodeAcc;
    private javax.swing.JTextField txtStreetAcc;
    private javax.swing.JTextField txtTelephoneNumberAcc;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtTownAcc;
    private javax.swing.JTextField txtUsernameAcc;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    //creating close method
    private void close() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

}
