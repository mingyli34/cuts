package mingyli.com.cuts;

import java.util.ArrayList;


public class Profile {
    private String name;
    private double hair_length;
    private int cut_frequency;
    private String cut_name;
    private String barber_name;
    private String shampoo_name;
    private ArrayList<String> tags_list;

    public Profile(){ //default profile
        name = "John Smith";
        hair_length = 5.0;
        cut_frequency = 1;
        cut_name = "The Usual";
        barber_name = "Barber Eduardo";
        shampoo_name = "Head and Shoulders";
        tags_list = new ArrayList<String>() {{
            add("#fade");
            add("#mullet");
            add("#perm");
        }};

    }
    public Profile(double length, int freq, String cut, String barber, String shampoo, ArrayList<String> tags){ //decked out profile
        hair_length = length;
        cut_frequency = freq;
        cut_name = cut;
        barber_name = barber;
        shampoo_name = shampoo;
        tags_list = tags;
    }
    //mutators
    public void addTag(String tag){
        tags_list.add(tag);
    }
    public void setTags(ArrayList<String> tags){
        tags_list = tags;
    }
    public void setHair_length(double length){
        hair_length = length;
    }
    public void setCut_frequency(int freq){
        cut_frequency = freq;
    }
    public void setBarber_name(String barber){
        barber_name = barber;
    }
    public void setShampoo_name(String shampoo){
        shampoo_name = shampoo;
    }
    public void setCut_name(String shampoo){
        shampoo_name = shampoo;
    }
    //accessors
    public String getName(){
        return name;
    }
    public double getHair_length(){
        return hair_length;
    }
    public int getCut_frequency(){
        return cut_frequency;
    }
    public String getBarber_name(){
        return barber_name;
    }
    public String getCut_name(){
        return cut_name;
    }
    public String getShampoo_name(){
        return shampoo_name;
    }
    public ArrayList<String> getTags_list(){
        return tags_list;
    }
}