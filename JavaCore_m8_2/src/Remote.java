class Remote{
    // храним ссылку на телевизор, которым управляем
    private TVset tvSet;

    // связываем телевизор с пультом
    public void setTVset(TVset tvSet){
        this.tvSet = tvSet;
    }
    // переключаем каналы на телевизоре
    public void setChannel(int channel){
        tvSet.channel = channel;
    }
    // включаем телевизор
    public void turnOn(){
        tvSet.isOn = true;
    }
    // выключаем телевизор
    public void turnOff(){
        tvSet.isOn = false;
    }
}
