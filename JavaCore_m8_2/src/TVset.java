class TVset{

    int channel = 5;
    boolean isOn;

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}