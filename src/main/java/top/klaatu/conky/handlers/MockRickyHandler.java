package top.klaatu.conky.handlers;

import java.util.concurrent.ThreadLocalRandom;

public class MockRickyHandler extends ChatHandler {

    @Override
    public String getResponse() {
        return getRandomRickyism().getSaying();
    }

    @Override
    public String getResponse(String arg) {
        return getRandomRickyism().getSaying();
    }

    public Rickyism getRandomRickyism() {
        return Rickyism.values()[ThreadLocalRandom.current().nextInt(Rickyism.values().length)];
    }

    public enum Rickyism {
        ONE("A link is only as long as your longest strong chain"),
        TWO("Alright, Heisenstein"),
        THREE("Awkwardly Situation"),
        FOUR("Beauty is in the eye when you hold her"),
        FIVE("Can you give me a bit of credjudice?"),
        SIX("Looks like a tropical earthquake blew through here\t"),
        SEVEN("Delicately situation"),
        EIGHT("Denial and error"),
        NINE("Does a bear shit on the pope?"),
        TEN("Does a bear shit on the pope?"),
        ELEVEN("What the fuck does that suppose to mean?"),
        TWELVE("What Lucy doesn't know won't learn her"),
        THIRTEEN("What comes around is all around"),
        FOURTEEN("Trying to make my heart attack?"),
        FIFTEEN("Supply and command boys"),
        SIXTEEN("Split it 50/50/50"),
        SEVENTEEN("Selling me under the bus"),
        EIGHTEEN("It's not Rocket appliances"),
        NINETEEN("Refuckulate"),
        TWENTY("Passed with flying fuckin' carpets"),
        TWENTYONE("Don't judge a cover of a book by its look"),
        TWENTYTWO("False Acriminations"),
        TWENTYTHREE("For the Gooder of Us All"),
        TWENTYFOUR("Get two birds stoned at once"),
        TWENTYFIVE("Good things come to those at the gate"),
        TWENTYSIX("Hit 'em with everything we caught");

        private String saying;

        Rickyism(String saying) {
            this.saying = saying;
        }

        public String getSaying() {
            return this.saying;
        }
    }
}
