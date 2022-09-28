public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю Вас с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Вам необходимо дождаться совершеннолетия (((");
        }


        int you = 6;
        if (you >= 7 && you <= 18) {
            System.out.println("Вы ходите в школу)");
        }
        if (you >=19&&you<=23){
            System.out.println("Вы учитесь в институте)");
        }
        if (you >= 24) {
            System.out.println("Вам нужно искать работу");
        }
        else {
            System.out.println("Вы даже до школы не доросли)");
        }


    }


    }