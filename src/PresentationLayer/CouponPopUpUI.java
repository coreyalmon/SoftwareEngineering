package PresentationLayer;

import BusinessLogicLayer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CouponPopUpUI {
    private JFrame popUpWindow;
    private JPanel couponPanel;
    private ShoppingLogic shoppingLogic;
    private List<Coupon> couponList;
    private CouponApplier lastestCouponApplier;
    private List<CouponVoucher> couponVoucherList;
    CouponObserver couponObserver = new CouponObserver();

    public CouponPopUpUI(ShoppingLogic shoppingLogic, boolean isActive){
        this.shoppingLogic = shoppingLogic;

        if(isActive)
            launchUI();
    }

    private void launchUI(){
        createMainWindow();
        createTopPanelnUseRemoveButton();
        createSidePanel();
        createCouponPanel();
        initializeCouponPanel();
        showPopUp();
    }

    private void createCouponPanel(){
        couponPanel = new JPanel();
        couponPanel.setLayout(new GridLayout(0, 1));
        popUpWindow.add(couponPanel, BorderLayout.CENTER);
    }

    private void initializeCouponPanel()
    {
        couponList = new CouponLibrary(shoppingLogic).getCouponList();
        lastestCouponApplier = new CouponApplier(null, null);
        couponVoucherList = new ArrayList<>();

        for (var coupon: couponList) {
            System.out.println(coupon.getClass());
            CouponVoucher couponVoucher = addVoucher(coupon);
            couponVoucherList.add(couponVoucher);
            couponVoucher.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(! couponVoucher.isCouponSelected()){
                        lastestCouponApplier = new CouponApplier(coupon, lastestCouponApplier);
                        couponVoucher.setVoucherSelected();
                    }
                }
            });
        }
    }
    private void createMainWindow(){
        popUpWindow = new JFrame();
        popUpWindow.setSize(350, 500);
        popUpWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popUpWindow.setLayout(new BorderLayout());
    }

    private void createTopPanelnUseRemoveButton() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.setPreferredSize(new Dimension(100, 80));

        JLabel headerLabel = new JLabel("Coupons Here");
        headerLabel.setBounds(0,0, 100, 20);

        JButton useCouponButton = new JButton("Use Coupon");
        useCouponButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastestCouponApplier.applyCoupon();

                lastestCouponApplier = new CouponApplier(null, null);
                for(var voucher: couponVoucherList){
                    voucher.setVoucherUnselected();
                }
            }
        });
        useCouponButton.setBounds(50, 50, 50, 100);

        JButton removeSelectedCouponButton = new JButton("Remove Selected Coupon");
        removeSelectedCouponButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastestCouponApplier = new CouponApplier(null, null);
                for(var voucher: couponVoucherList){
                    voucher.setVoucherUnselected();
                }
            }
        });
        removeSelectedCouponButton.setBounds(100, 50,50, 100);


        topPanel.add(headerLabel);
        topPanel.add(useCouponButton);
        topPanel.add(removeSelectedCouponButton);
        popUpWindow.add(topPanel, BorderLayout.NORTH);
    }

    // This function is to create side padding
    private void createSidePanel(){
        int panelWidth = 50;

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(panelWidth, 100));
        popUpWindow.add(leftPanel, BorderLayout.WEST);

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(panelWidth, 100));
        popUpWindow.add(rightPanel, BorderLayout.EAST);
    }

    public void showPopUp(){
        popUpWindow.setVisible(true);
    }


    /**
     * This method add a Voucher to the VoucherPanel
     * @param coupon from BusinessLogicLayer
     * @return CouponVoucher object
     */
    public CouponVoucher addVoucher(Coupon coupon){
        //            if(observerCoupon.isMoreThanTwoItems()）
//                displaycoupon
//            else graybox the coupon
        CouponVoucher couponVoucher = new CouponVoucher(coupon, couponObserver);
        couponPanel.add(couponVoucher);
        return couponVoucher;
    }

    public static void main(String[] args) {
        new CouponPopUpUI(new ShoppingLogic(), true);
    }

}
