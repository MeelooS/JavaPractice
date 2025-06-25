package JavaPracticeStart.day13.ПродолжениеArrayList;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username){
        this.username=username;
        subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }
    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){                         //сравнивает все имена из списка subscription c именем, поступившего в качестве аргумента
        for (User user1: subscriptions){                            //перебираем каждый i-й элемент(user1) из списка subscription
            if(user1.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean isSubscribed1(User user){               //мой метод
        if(subscriptions.contains(user)){
            return true;
        }
        return false;
    }
    public boolean isFriend(User user){
        if(this.isSubscribed(user)&&user.isSubscribed(this)){            //объект this - текущий пользователь
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }
    public String toString(){
        return username;
    }

}

