package ca.baseplate.commandercounter.commandercounter;

/**
 * Created by Luke on 2016-05-11.
 */
public class Commander {

    private String CardName;

    private int CardType;

    private int BaseToughness;
    private int CurrentToughness;

    private int BasePower;
    private int CurrentPower;

    private int Counters = 0;

    private int Image;

    private boolean CanTransform;

    public Commander(String cardName, int baseToughness, int basePower) {
        CardName = cardName;
        BaseToughness = baseToughness;
        BasePower = basePower;
        setCurrentToughness(BaseToughness);
        setCurrentPower(BasePower);
    }

    private int TransformImage;
    private boolean TransformRespectsCounters;


    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public int getCardType() {
        return CardType;
    }

    public void setCardType(int cardType) {
        CardType = cardType;
    }

    public int getBaseToughness() {
        return BaseToughness;
    }

    public void setBaseToughness(int baseToughness) {
        BaseToughness = baseToughness;
    }

    public int getCurrentToughness() {
        return CurrentToughness;
    }

    public void setCurrentToughness(int currentToughness) {
        CurrentToughness = currentToughness;
    }

    public int getBasePower() {
        return BasePower;
    }

    public void setBasePower(int basePower) {
        BasePower = basePower;
    }

    public int getCurrentPower() {
        return CurrentPower;
    }

    public void setCurrentPower(int currentPower) {
        CurrentPower = currentPower;
    }

    public int getCounters() {
        return Counters;
    }

    public void setCounters(int counters) {
        Counters = counters;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public boolean isCanTransform() {
        return CanTransform;
    }

    public void setCanTransform(boolean canTransform) {
        CanTransform = canTransform;
    }

    public int getTransformImage() {
        return TransformImage;
    }

    public void setTransformImage(int transformImage) {
        TransformImage = transformImage;
    }

    public boolean isTransformRespectsCounters() {
        return TransformRespectsCounters;
    }

    public void setTransformRespectsCounters(boolean transformRespectsCounters) {
        TransformRespectsCounters = transformRespectsCounters;
    }
}
