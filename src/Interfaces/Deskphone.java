package Interfaces;
// dummy class, all notes on main class
public class Deskphone implements iTelephone {
    private  int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("no Action taken, desk phone dont have power button");
    }
    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing "+ phoneNumber + " on deskphone");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering the deskphone");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println(" Ring Ring");
        }
        else {
            isRinging= false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
