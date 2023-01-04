public class Seat {
    private String seatNum;
    private String mealType;
    private int recline;
    private int price;

    public Seat(String seatNum, String mealType, int recline, int price){
        this.seatNum = seatNum;
        this.mealType = mealType;
        this.recline = recline;
        this.price = price;
    }

    public void setMealType(String mealType){this.mealType = mealType;}
    public void setRecline(int recline){this.recline = recline;}
    public void setPrice(int price){this.price = price;}

    public int getPrice(){return price;}
    public int getRecline(){return recline;}
    public String getSeatNum(){return seatNum;}
    public String getMealType(){return mealType;}

    public String toString(){
        return "Seat Number: " + seatNum +
                "Price: " + price +
                "MealType: " + mealType +
                "Recline: " + recline;
    }
}
