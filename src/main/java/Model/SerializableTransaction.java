package Model;

/**
 * Created by fozersahin on 24/08/19.
 */
public class SerializableTransaction {
    public final double amount;
    public final int receiver;
    public final int sender;

    public SerializableTransaction(int sender, int receiver, double amount){
        this.receiver = receiver;
        this.sender   = sender;
        this.amount   = amount;
    }

    @Deprecated
    public SerializableTransaction(){
        this.receiver = 0;
        this.sender   = 0;
        this.amount   = 0.0;
    }
}
