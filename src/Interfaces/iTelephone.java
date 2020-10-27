package Interfaces;
// dummy interface, all notes on main class
interface iTelephone{
    public abstract void powerOn();
    public abstract void dial(int phoneNumber);
    public abstract void answer();
    public abstract boolean callPhone(int phoneNumber);
    public abstract boolean isRinging();
}
