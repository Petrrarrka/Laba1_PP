package Car;

public class Car {
    private int id, year, price;
    private String model, reg_num;

    public void setId(int ID){ id = ID; }
    public void setModel(String MODEL){ model = MODEL; }
    public void setYear(int YEAR){ year = YEAR; }
    public void setPrice(int PRICE){ price = PRICE; }
    public void setReg_num(String REG_NUM) { reg_num = REG_NUM; }

    public int getId(){ return id; }
    public String getModel(){ return model; }
    public int getYear(){ return year; }
    public int getPrice(){ return price; }
    public String getReg_num(){ return reg_num; }

    public String toString(){
        return "\t-----------" + "\t\tID: " + this.id + "\t\tModel: " + this.model + "\t\tRegister number: "+ reg_num +
                "\t\tYear: " + this.year + "\t\tPrice: " + this.price;
    }
}
