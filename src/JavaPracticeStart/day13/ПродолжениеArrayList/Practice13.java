package JavaPracticeStart.day13.ПродолжениеArrayList;

public class Practice13 {
    public static void main(String[] args){
        User user1 = new User("Jane");
        User user2 = new User("John");
        User user3 = new User("Jack");

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello!");
        user2.sendMessage(user1, "I'm fine!");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hi!");
        user1.sendMessage(user3, "Hello!");
        user3.sendMessage(user1, "How old are you?");
        user1.sendMessage(user3, "14");
        user3.sendMessage(user1, "Wow!");
        user1.sendMessage(user3, "Hahaha!");
        user3.sendMessage(user1, "Good bye!");

        MessageDatabase.showDialog(user1,user3);
        System.out.println();

        Message message = new Message(user2, user3, "Hi!");
        System.out.println(message);

        user2.subscribe(user3);
        System.out.println(user2.isSubscribed(user3));
        System.out.println(user3.isSubscribed1(user2));
    }
}
