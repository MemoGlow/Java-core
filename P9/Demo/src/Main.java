-import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

    }
};
class LocalData implements Data{
    ArrayList<String> userNameList;
    public boolean findUserByName(String name) {
        for(String userName : userNameList){
            if(userName.equals(name)) return true;
        }
        return false;
    }
}
class GlobalData implements Data{
    @Override
    public boolean findUserByName(String name) {
        return false;
    }
}
interface Data{
    boolean findUserByName(String name);
}
class UserSevice{
    Data data;
    boolean authenticateUserName(String userName){
        return data.findUserByName(userName);
    }
}



















