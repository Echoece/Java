package OOPConcepts.Interfaces;
// dummy class, all notes.txt on main class
public class MobilePhone implements iTelephone{
    private  int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone power up");
    }
    @Override
    public void dial(int phoneNumber) {
        if(isOn)
            System.out.println("now ringing "+ phoneNumber + " on mobilePhone");
        else
            System.out.println("phone is off");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering the mobilePhone");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println(" Ring Ring");
        }
        else {
            isRinging= false;
            System.out.println("phone is off or wrong number");
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
