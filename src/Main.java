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
        if (you >= 7 || you <= 18) {
            System.out.println("Вы ходите в школу)");
        }
        if (you >=19 || you<=23){
            System.out.println("Вы учитесь в институте)");
        }
        if (you >= 24) {
            System.out.println("Вам нужно искать работу");
        }
        else {
            System.out.println("Вы даже до школы не доросли)");
        }


        int stendingPlacesTotal = 41;
        int seatsPlacesTotal = 47;
        if (stendingPlacesTotal >= 42 && seatsPlacesTotal >= 60){
            System.out.println("В вагоне мест нет!");
        }
        if (stendingPlacesTotal <= 41 && seatsPlacesTotal >= 60 ){
            System.out.println("В вагоне есть стоячее место!");
        }
        if (stendingPlacesTotal >= 42 && seatsPlacesTotal <= 59 ){
            System.out.println("В вагоне есть сидячее место!");
        }
        if (stendingPlacesTotal <= 42 && seatsPlacesTotal <= 59 ) {
            System.out.println("В вагоне есть стоячее и сидячее место!");
        }

            int ageBob = 17;
            if (ageBob>=18){
                System.out.println("Поздрвляю, Вы совершеннолетний!");
            }
            else {
                System.out.println("Вам необходимо дождаться совершеннолетия(");

        }






    }


    }