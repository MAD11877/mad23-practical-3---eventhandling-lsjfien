package sg.edu.np.mad.madpractical2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(){

    }

    public User(String n, String d, int i, boolean f)
    {
        name = n;
        description = d;
        id = i;
        followed = f;
    }
}
