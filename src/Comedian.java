import java.util.ArrayList;
public class Comedian extends Entertainer
{
    private ArrayList<String> jokes;

    public Comedian(String t, ArrayList<String> jks)
    {
        super(t);
        jokes = jks;
    }

    public String getTalent()
    {
        return "Comedy style: " + super.getTalent();
    }

    public String tellJoke()
    {
        return jokes.get((int) (Math.random() * jokes.size()));
    }
}