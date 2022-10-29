import java.util.Scanner;

/**
 * Created by DELL on 06/10/2022.
 * sub class
 */
public class lavorssprice extends lavorss {

    private int mangoprice,choocleatprice,blueberryprice,strwberyprice,orangeprice,honeyprice;

    public lavorssprice(String m,String ch,String b,String s,String o,String h,int mp,int chp,int bp,int sp,int op,int hp)
    {
        super(m,ch,b,s,o,h);
        mangoprice=mp;
        choocleatprice=chp;
        blueberryprice=bp;
        strwberyprice=sp;
        orangeprice=op;
        honeyprice=hp;
    }
    public lavorssprice()
    {
        mangoprice=1000;
        choocleatprice=1500;
        blueberryprice=2000;
        strwberyprice=2500;
        orangeprice=3000;
        honeyprice=3500;

    }

    public void setMangoprice(int mangoprice) {
        this.mangoprice = mangoprice;
    }

    public void setChoocleatprice(int choocleatprice) {
        this.choocleatprice = choocleatprice;
    }

    public void setBlueberryprice(int blueberryprice) {
        this.blueberryprice = blueberryprice;
    }

    public void setStrwberyprice(int strwberyprice) {
        this.strwberyprice = strwberyprice;
    }

    public void setOrangeprice(int orangeprice) {
        this.orangeprice = orangeprice;
    }

    public void setHoneyprice(int honeyprice) {
        this.honeyprice = honeyprice;
    }

    public double getMangoprice() {
        return mangoprice;
    }

    public double getChoocleatprice() {
        return choocleatprice;
    }

    public double getBlueberryprice() {
        return blueberryprice;
    }

    public double getStrwberyprice() {
        return strwberyprice;
    }

    public double getOrangeprice() {
        return orangeprice;
    }

    public double getHoneyprice() {
        return honeyprice;
    }


    public String menu() {
        return
                " mangoprice=" + mangoprice+"\n" +
                " choocleatprice=" + choocleatprice +"\n"+
                " blueberryprice=" + blueberryprice +"\n"+
                " strwberyprice=" + strwberyprice +"\n"+
                " orangeprice=" + orangeprice +"\n"+
                " honeyprice=" + honeyprice
                ;
    }





}

