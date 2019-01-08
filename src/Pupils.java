import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Pupils {
    //pola klasy

    private String name;
    private Integer id;


    //lista z nazwami przedmiotów
    public ArrayList<String> subjects = new ArrayList<String>();

    //hashMapa przechowująca jako klucz nazwe przedmiotu i jako wartosc powyższą Listę z ocenami z danego przedmiotu
    public HashMap<String, List<Integer>> marks = new HashMap<String, List<Integer>>();

    //konstruktor z parametrami  ustawiającymi atrybuty
    public Pupils(String name, Integer id ){

        this.name = name;
        this.id = id;

    }

    @Override
    public boolean equals(Object o){
        final Pupils p = (Pupils) o;
        return this.name.equals(p.name) && this.id.equals(p.id);
    }

    @Override
    public int hashCode(){
        //This method cuts first 6 (0-5) characters from peselId
        //and then converts it into Integer
        //peselId includes year and month and day of birth in the first 6 characters
        //for example: beginning of peselId 800630 means that persone having this peselId
        //was born on 30 july 1980.
        //returning value will be 800630 (Integer type)
        //return Integer.parseInt(peselId.substring(0, 5));
        return id;
    }

    @Override
    public String toString(){
        return name + " " + "(Numer w dzienniku - " + id + ") ";
    }
}