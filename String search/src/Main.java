//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] s={"har","sha","chin"};
        String target="har";
        for(String a:s){
            if(a.equals(target)){
                System.out.println(a);
                break;
            }
        }
    }
}