public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю Вас с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Вам необходимо дождаться совершеннолетия (((");
        }


        int you = 20;
        if (you >= 7 && you <= 18) {
            System.out.println("Вы ходите в школу)");
        }
        if (you >= 19 && you <= 23) {


            int youn = 6;
            if (youn >= 7 && youn <= 18) {
                System.out.println("Вы ходите в школу)");
            }
            if (youn >= 19 && youn <= 23) {
                System.out.println("Вы учитесь в институте)");
            }
            if (youn >= 24) {
                System.out.println("Вам нужно искать работу");
            }


            int stendingPlacesTotal = 41;
            int seatsPlacesTotal = 47;
            if (stendingPlacesTotal >= 42 && seatsPlacesTotal >= 60) {
                System.out.println("В вагоне мест нет!");
            }
            if (stendingPlacesTotal <= 41 && seatsPlacesTotal >= 60) {
                System.out.println("В вагоне есть стоячее место!");
            }
            if (stendingPlacesTotal >= 42 && seatsPlacesTotal <= 59) {
                System.out.println("В вагоне есть сидячее место!");
            }
            if (stendingPlacesTotal <= 42 && seatsPlacesTotal <= 59) {
                System.out.println("В вагоне есть стоячее и сидячее место!");
            }

            int ageBob = 17;
            if (ageBob >= 18) {
                System.out.println("Поздрвляю, Вы совершеннолетний!");
            } else {
                System.out.println("Вам необходимо дождаться совершеннолетия(");
            }

        }

        int ageOleg = 25;
        int ageOlegYang = 6;

        if (ageOleg >= 7 && ageOleg <= 18 && ageOleg >= ageOlegYang) {
            System.out.println("Ходите в школу)");
        }
        if (ageOleg >= 19 && ageOleg <= 23 && ageOleg >= ageOlegYang) {
            System.out.println("Учитесь в институте)");
        } else {
            System.out.println("Вам нужно искать работу!!!)");
        }


        int stendingPlacesTotal = 42;
        int seatsPlacesTotal = 60;
        if (stendingPlacesTotal <= 41 && seatsPlacesTotal + stendingPlacesTotal <= 102) {
            System.out.println("В вагоне есть стоячее место!");
        }
        if (stendingPlacesTotal + seatsPlacesTotal <= 102 && seatsPlacesTotal <= 59) {
            System.out.println("В вагоне есть сидячее место!");
        } else {
            System.out.println("В вагоне мест нет!");
        }

        int ageTom = 1;
        boolean ageTomKinderGarten = ageTom >= 2 && ageTom <= 6;
        boolean ageTomSchool = ageTom >= 7 && ageTom <= 18;
        boolean ageTomUnivercity = ageTom >= 19 && ageTom <= 24;
        boolean ageTomWork = ageTom >= 25;
        if (ageTomKinderGarten) {
            System.out.println("Если возраст Тома " + ageTom + " , то он ходит в детский сад.");
        }
        if (ageTomSchool) {
            System.out.println("Если возраст Тома " + ageTom + " , то он ходит в школу.");
        }
        if (ageTomUnivercity) {
            System.out.println("Если возраст Тома " + ageTom + " , то он учится в институте.");
        }
        if (ageTomWork) {
            System.out.println("Если возраст Тома " + ageTom + " , то он имеет работу.");
        }
        else {
            System.out.println("Если возраст Тома " + ageTom + " , то он грудной ребенок.");
        }

        int ageNik = 20;
        boolean ageNikMin = ageNik <= 5;
        boolean ageNikMidle = ageNik >=6 && ageNik <=14;
        if (ageNikMin) {
            System.out.println("Этот ребенок не может кататься на атракционе!!!");
        }
        if (ageNikMidle) {
            System.out.println("Этот ребенок может кататься на атракционе в сопровождении взрослых!");
        }
        else  {
            System.out.println("Этот человек имеет право посещать атракцион без сопровождения.");
        }

        int one = 22;
        int two = 12;
        int three = 21;
        boolean firstOption = one >= two && one >= three;
        boolean secondOption = two >= one  && two >= three;

        if (firstOption) {
            System.out.println("Большее число - " + one);
        }
        else if (secondOption) {
            System.out.println("Большее число - " + two);
        }
        else
         System.out.println("Большее число - " + three);

    }

}