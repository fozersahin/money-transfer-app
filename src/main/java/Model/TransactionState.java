package Model;

/**
 * Created by fozersahin on 24/08/19.
 */
public enum TransactionState {
    NOT_STARTED(0),
    STARTED(1),
    COMMITED(2);

    private final int value;

    private TransactionState(int value) {
        this.value = value;
    }

    public int getValue(){ return value; }

}
