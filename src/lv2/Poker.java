package lv2;

import java.util.ArrayList;
import java.util.List;

public class Poker {
    private String figure;
    private String color;

    public Poker(String figure, String color) {
        this.figure = figure;
        this.color = color;
    }

    public String getFigure() {
        return figure;
    }

    public String getColor() {
        return color;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class King{
    private String king;

    public King(String king) {
        this.king = king;
    }
    public void chu(){
        System.out.print("["+king+"]"+" ");
    }
    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }
}
class Create{
    String[] figures={"2","3","4","5","6","7","8","9","10","J","K","A"};
    String[] colors={"spades","clubs","hearts","diamonds"};
    List<Poker> pokerList;
    public Create(){
        this.pokerList=new ArrayList<Poker>();
    }
    void createpokers(){
        for(String figure : figures){
            for(String color : colors){
                pokerList.add(new Poker(figure,color));
            }
        }System.out.println("打印扑克牌:");
        for(int i=0;i<pokerList.size();i++){
            Poker poker = pokerList.get(i);
            System.out.print("[");
            System.out.print(poker.getFigure()+" "+poker.getColor());
            System.out.print("]");
            System.out.print("  ");
            if((i+1)%4==0&&i!=0){
                System.out.println("");
            }
        }
    }public void makeking(){
        King ki1 = new King("bigking");
        King ki2 = new King("smallking");
        ki1.chu();
        ki2.chu();
    }
}
