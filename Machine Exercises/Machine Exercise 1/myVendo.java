package machineexercise1; //CQB, JST

public class myVendo {
	int money;
    int change;
    int choice;
    int prices[] = {200, 70, 100, 80, 95};
    String snacks[] = {"Herhseys", "Chocopie", "Take It", "Cadbury", "Monster"};
    
    // setter for money (Stores the value of money)
    public void setMoney(int money){
        this.money = money;
    }
    
    // getter for money (Returns the value of money)
    public int getMoney(){
        return this.money;
    }
    
    // setter for choice
    public void setChoice(int choice){
        this.choice = choice;
    }
    
    // getter for money
    public int getChoice(){
        return this.choice;
    }
    
    
    // setter for change (Computes and stores the change)
    public void setChange(){
        this.change = getMoney() - prices[getChoice() - 1];
    }
    
    // getter for change (Returns the value of the computed change)
    public int getChange(){
        return this.change;
    }
    
    public void printOptions(){
        System.out.println("1. Herhseys - 200 \n2. Chocopie - 70 \n3. Take It - 100 \n4. Cadbury - 80 \n5. Monster - 95\n");
    }
    
    public void myChoice(int choice){
        setChoice(choice);
        System.out.println("Your choice: " + snacks[getChoice()-1] + " - " + prices[getChoice()-1]);
        System.out.println("Your money: " + getMoney());
        if(getMoney() > prices[getChoice()-1]){
            setChange();
            System.out.println("Your change: " + getChange());
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
