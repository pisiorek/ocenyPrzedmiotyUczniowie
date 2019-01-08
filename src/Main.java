import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//tworzymy instancję obiektu uczeń
        Pupils pupil1 = new Pupils("Michał", 1);


        //ArrayLista subjects - zadeklarowana w Pupils
        pupil1.subjects.add("Java");//dopisujemy do listy przedmiotów przedmiot wybrany przez konkretnego ucznia
        ArrayList<Integer> javaMarksPupil1 = new ArrayList<Integer>(); //lista dla ocen z wybranego przedmiotu
        javaMarksPupil1.add(5); //dopisanie do listy oceny
        javaMarksPupil1.add(4);
        javaMarksPupil1.add(3);

        pupil1.subjects.add("PHP");//dopisujemy do listy przedmiotów kolejny przedmiot wybrany przez konkretnego ucznia
        ArrayList<Integer> phpMarksPupil1 = new ArrayList<Integer>(); //i nową lista dla ocen z nowego przedmiotu
        phpMarksPupil1.add(6);//oceny z przedmiotu
        phpMarksPupil1.add(5);
        phpMarksPupil1.add(6);

        //kolejne operacje jak powyżej dla danego przedmiotu i kolejnych uczniów tak samo
        pupil1.subjects.add("C++");
        ArrayList<Integer> cPlusMarksPupil1 = new ArrayList<>();
        cPlusMarksPupil1.add(4);
        cPlusMarksPupil1.add(5);
        cPlusMarksPupil1.add(4);

        pupil1.subjects.add("C#");
        ArrayList<Integer> cSharpMarksPupil1 = new ArrayList<>();
        cSharpMarksPupil1.add(3);
        cSharpMarksPupil1.add(3);
        cSharpMarksPupil1.add(3);
        cSharpMarksPupil1.add(3);
        cSharpMarksPupil1.add(3);


        pupil1.marks.put(pupil1.subjects.get(0),javaMarksPupil1);
        pupil1.marks.put(pupil1.subjects.get(1),phpMarksPupil1);
        pupil1.marks.put(pupil1.subjects.get(2),cPlusMarksPupil1);
        pupil1.marks.put(pupil1.subjects.get(3),cSharpMarksPupil1);


        System.out.println(pupil1);

        Double temp = 0.0;
        Double average = 0.0;
        List<Integer> list;

        for(Map.Entry<String, List<Integer>> entry: pupil1.marks.entrySet()){

            System.out.println("Oceny z przedmiotu " + entry.getKey()+": "+  entry.getValue());

            list = entry.getValue();
            for(int i = 0; i < list.size(); i++){

                temp += list.get(i);
                // System.out.println(temp);
            }
            average = temp / list.size();
            System.out.println("Srednia ocen z przedmiotu: "+ entry.getKey() +" wynosi  " + average + "\n");
            temp = 0.0;

        }


        /*---------------Uczeń numer 2-------------------------------------------*/

        Pupils pupil2 = new Pupils ("Arek", 2);


        pupil2.subjects.add("C++");
        ArrayList<Integer> cPlusMarksPupil2 = new ArrayList<>();
        cPlusMarksPupil2.add(5);
        cPlusMarksPupil2.add(5);
        cPlusMarksPupil2.add(5);

        pupil2.subjects.add("C#");
        ArrayList<Integer> cSharpMarksPupil2 = new ArrayList<>();
        cSharpMarksPupil2.add(4);
        cSharpMarksPupil2.add(4);
        cSharpMarksPupil2.add(4);
        cSharpMarksPupil2.add(4);
        cSharpMarksPupil2.add(4);


        pupil2.marks.put(pupil2.subjects.get(0),cPlusMarksPupil2);
        pupil2.marks.put(pupil2.subjects.get(1),cSharpMarksPupil2);


        System.out.println(pupil2);

        Double temp2 = 0.0;
        Double average2 = 0.0;
        List<Integer> list2;

        for(Map.Entry<String, List<Integer>> entry: pupil2.marks.entrySet()){

            System.out.println("Oceny z przedmiotu " + entry.getKey()+": "+  entry.getValue());

            list2 = entry.getValue();
            for(int i = 0; i < list2.size(); i++){

                temp2 += list2.get(i);
                // System.out.println(temp);
            }
            average = temp2 / list2.size();
            System.out.println("Srednia ocen z przedmiotu: "+entry.getKey() +" wynosi  " + average + "\n");
            temp2 = 0.0;

        }

    }
}
