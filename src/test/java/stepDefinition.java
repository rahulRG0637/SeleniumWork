import com.thoughtworks.gauge.Step;

public class stepDefinition {
    @Step("Print this message <message>")
    public void printMsg(String message){
        System.out.println("Hello "+message);
    }
}
