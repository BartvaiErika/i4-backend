package week10programming.Sms;

public class Sms {
    private String type;
    private String messageText;

    public Sms(String type, String messageText) {
        this.type = type;
        this.messageText = messageText;
    }

    public String getType() {
        return type;
    }

    public String getMessageText() {
        return messageText;
    }

    public Integer lengthOfText(){
        return messageText.length();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

