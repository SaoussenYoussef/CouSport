package fr.clubomnisportsulis.cousport.modele;

public class User {

    private String mAdreeseEmail;
    private String mMotDepasse;
    private String mNumeroAdherent;

    public User(String adreeseEmail, String motDepasse, String numeroAdherent) {
        this.mAdreeseEmail = adreeseEmail;
        this.mMotDepasse = motDepasse;
        this.mNumeroAdherent = numeroAdherent;
    }

    public String getAdreeseEmail() {
        return mAdreeseEmail;
    }

    public void setAdreeseEmail(String adreeseEmail) {
        mAdreeseEmail = adreeseEmail;
    }

    public String getMotDepasse() {
        return mMotDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        mMotDepasse = motDepasse;
    }

    public String getNumeroAdherent() {
        return mNumeroAdherent;
    }

    public void setNumeroAdherent(String numeroAdherent) {
        mNumeroAdherent = numeroAdherent;
    }

    @Override
    public String toString() {
        return "User{" +
                "mAdreeseEmail='" + mAdreeseEmail + '\'' +
                ", mMotDepasse='" + mMotDepasse + '\'' +
                ", mNumeroAdherent='" + mNumeroAdherent + '\'' +
                '}';
    }
}
