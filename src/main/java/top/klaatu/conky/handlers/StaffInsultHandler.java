package top.klaatu.conky.handlers;

public class StaffInsultHandler extends ChatHandler {

    @Override
    public String getResponse() {
        return "";
    }

    public String getResponse(String arg) {
        Insult insult = getInsult(arg);
        if(insult == null) return "dont got shit on him yet";
        return getInsult(arg).getInsult();
    }

    public Insult getInsult(String staff) {
        for(Insult insult : Insult.values()) {
            if(insult.getStaff().equalsIgnoreCase(staff)) {
                return insult;
            }
        }
        return null;
    }

    public enum Insult {
        ONE("Sethdog6", "sethdog6 looks like an indian justin bieber"),
        TWO("ItsiPro", "he's dutch, what more is needed?"),
        THREE("Cruee", "albanian AND a new yorker? gross"),
        FOUR("sam", "'jonathon'"),
        FIVE("Duci13", "what's the difference between the dutch and germans? Only duci would know"),
        SIX("Chibi", "[insert sexist comment here]"),
        SEVEN("Colt", "you wish faggot"),
        EIGHT("RoyalSKid", "sorry royal is too busy watching jersey shore"),
        NINE("Presidentx", "he secretly wants to be american"),
        TEN("TakeAPoop", "Have you seen his face? He's one prostitute away from assassinating a president to impress jodie foster"),
        ELEVEN("jj", "jordyn with a y - his parents probably wanted a girl"),
        TWELVE("destructive", "british version of itsipro"),
        THIRTEEN("snow", "demoted for being british"),
        FOURTEEN("whyteagle", "no words for his level of retardedness");

        private String staff;
        private String insult;

        Insult(String staff, String insult) {
            this.staff = staff;
            this.insult = insult;
        }

        public String getStaff() {
            return this.staff;
        }

        public String getInsult() {
            return insult;
        }
    }
}
