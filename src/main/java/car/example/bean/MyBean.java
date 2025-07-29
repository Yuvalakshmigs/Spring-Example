package car.example.bean;

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showMessage(){
        return "Message: " + message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
