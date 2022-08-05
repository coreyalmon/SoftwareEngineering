package PresentationLayer;

import BusinessLogicLayer.Coupon;
import BusinessLogicLayer.CouponObserver;

import javax.swing.*;
import java.awt.*;

public class CouponVoucher extends JButton{
    private boolean isSelected = false;
    private CouponObserver couponObserver;
    private JLabel descLabel;
    private Coupon coupon;
    private Color defaultColor = Color.black;

    CouponVoucher(Coupon coupon, CouponObserver couponObserver){
        this.setSize(250, 100);
        this.coupon = coupon;
        this.couponObserver = couponObserver;

        descLabel = new JLabel(coupon.getDescription());
        this.add(descLabel);
        setClickable();
    }

    boolean isCouponSelected(){
        return isSelected;
    }

    public void setVoucherSelected(){
        this.isSelected = true;
        descLabel.setForeground(Color.red);
    }

    public void setVoucherUnselected(){
        this.isSelected = false;
        descLabel.setForeground(defaultColor);
    }

    /***
     * This method uses the result of observer to decide whether the Coupon Voucher should be active or not
     */
    public void setClickable(){
        switch (coupon.getCoupon_type()){
            case COUPON_TYPE_NEW_USER ->{
                if(! couponObserver.isNewUser())
                    disableVoucher();
                else
                    enableVoucher();
            }
            case COUPON_TYPE_RETURN_USER -> {
                if(! couponObserver.isReturningUser())
                    disableVoucher();
                else
                    enableVoucher();
            }
            case COUPON_TYPE_TWO_OR_MORE_ITEMS -> {
                if(! couponObserver.isTwoItems())
                    disableVoucher();
                else
                    enableVoucher();
            }
        }
    }

    private void disableVoucher(){
        this.setEnabled(false);
        defaultColor = Color.gray;
        descLabel.setForeground(defaultColor);
    }

    private void enableVoucher(){
        this.setEnabled(true);
        defaultColor = Color.black;
        descLabel.setForeground(defaultColor);
    }
}
