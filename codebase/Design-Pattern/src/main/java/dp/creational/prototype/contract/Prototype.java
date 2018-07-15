package dp.creational.prototype.contract;


public interface Prototype extends Cloneable
{
    public Prototype clone() throws CloneNotSupportedException;
    
}